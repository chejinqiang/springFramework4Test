package SpringBoot.config;

import SpringBoot.component.MyBean2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chejinqiang on 2018/4/13.
 * SpringBoot倾向于基于java的配置。尽管支持XML，通常建议通过使用@Configuration的类来声明。定义main方法的类是一个选择。
 * 没有必要把所有的配置放到一个类中，@import可以引入其它的配置类。
 * @ComponentScan 可以自动识别注解类，包含基于@Configuration的类。
 * @importResource 可以用来继续加载原来的XML文件
 *
 */
@Configuration
public class Config {

    /**
     * 将@ConfigurationProperties绑定到@Bean上，对于想绑定属性到第三方组件非常有用。
     * */
    @ConfigurationProperties(prefix = "my2")
    @Bean
    public MyBean2 anotherMyBean2(){
        return new MyBean2();
    }
}
