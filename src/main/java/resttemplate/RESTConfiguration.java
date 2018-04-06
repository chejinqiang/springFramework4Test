package resttemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import web.model.RESTServer;

/**
 * Created by chejinqiang on 2018/4/6.
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class RESTConfiguration {

    @Bean
    public RESTServer restServer(Environment env){
        return new RESTServer(env.getProperty("rest.user"),env.getProperty("rest.password"),env.getProperty("rest.host"));
    }
}
