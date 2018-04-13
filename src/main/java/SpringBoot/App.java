package SpringBoot;

import SpringBoot.component.MyBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chejinqiang on 2018/4/7.
 *
 * 1.Spring Boot使得创建一个基于Spring的独立的、生产级别的应用程序更为容易，它对于Spring平台和第三方库的独特的视角使得可以更轻易的使用。
 * 大部分Spring Boot的应用程序只需要很少的Spring配置。
 *
 * 2.SpringBoot应用程序可以通过java -jar命令启动，或者传统的基于war包的方式。
 *
 * 3.SpringBoot的使用目标：为Spring的开发提供更快的、更广泛理解的使用体验。强调开箱即用，但对默认值的处理偏离更远。提供一些大型项目所
 * 共有的非功能特性（嵌入式服务、安全、标准、健康检查、外部化配置）。无需代码生成和XML配置
 *
 * 4.Spring Boot 2.0.1基于JAVA8及以上，Spring5及以上。内置servlet容器：tomcat8.5，jetty9.4。Servlet:3.1
 *
 * @SpringbootApplication相当于：@Configuration，@EnableAutoConfiguration，@ComponentScan
 * 5.SpringBoot如何运行呢？直接通过main方法运行，通过：mvn spring-boot:run运行
 * 6.SpringBoot每一次新版发布会提供依赖清单，你并不需要提供这些依赖，spring boot会为你管理这些。
 * 7.starters：可以在应用程序中使用的方便的依赖描述，可以得到Spring或相关技术的一站式管理。
 * 8.基于debug模式运行jar包：java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n \
-jar target/myapplication-0.0.1-SNAPSHOT.jar

 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class App {

    public static void main(String[] args) {
        //SpringApplication.run(App.class, args);
        //定制化SpringApplication
        SpringApplication application = new SpringApplication(App.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
    }
}
