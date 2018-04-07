package web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import web.model.Quote;

/**
 * Created by chejinqiang on 2018/4/7.
 */
@SpringBootApplication
@EnableScheduling
//@ImportResource(locations = {"classpath:beans.xml"})
@PropertySource("classpath:redis.properties")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    /**
     * @Bean 主要用在方法上，显式声明生成的类，用@Configuration注解该类。等价于在XML中配置该类。
     * */
    @Bean(name = "restTemplate")
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",Quote.class);
        };
    }

    /**
     * @SpringBootApplication 相当于如下的注解配置:
     *
     * @Configuration tags the class as a source of bean definitions for the application context
     *
     *  @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
     *
     *  Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath.
     * This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
     *
     *@ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.
     *
     *最主要的是:0配置。
     *
     * */
}
