package SpringBoot.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chejinqiang on 2018/4/8.
 * 在SpringBoot启动的时候运行指定的代码和功能。可以实现AppliationRunner或CommandLineRunner接口。这两个接口都提供了
 * 一个run方法，会在SpringApplication的方法完成前调用。CommandLineRunner提供了对应用程序参数的访问，并提供给run方法。
 *
 * 使用@ConfigurationProperties时，需要结合@Component一起使用。并且pom中需要加载相应依赖
 * 只有使用@Autowired在Controller中配置后才会完成自动数据装配。
 *
 * @Value 和@ConfigurationProperties的区别：
 *          @ConfigurationProperties 支持Relaxed binding和Meta-data support。
 *          @Value 支持SpEL表达式
 * 如果是为自己的Component定义了一系列的Configuration key，建议组装成一个POJO类并使用@ConfigurationProperties注解。
 */
@Component
@ConfigurationProperties(prefix = "my")
public class MyBean2 implements ApplicationRunner{

    private static final Logger logger = LoggerFactory.getLogger(MyBean2.class);

    private List<String> servers = new ArrayList<>();

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.info("在SpringBoot启动的时候运行指定的代码和功能:{}",servers.size());
    }

    public List<String> getServers() {
        return servers;
    }
}
