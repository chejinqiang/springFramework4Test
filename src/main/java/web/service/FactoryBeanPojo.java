package web.service;

import org.springframework.beans.factory.FactoryBean;
import web.model.School;
import web.model.Student;

/**
 * Created by chejinqiang on 2018/4/16.
 * BeanFactory和FactoryBean的区别：
 * BeanFactory是IOC最基本的容器，负责生产和管理bean，它为其它具体的IOC容器提供了最基本的规范，例如：ApplicationContext等具体的容器
 * 都是实现了BeanFactory，再在其基础之上附加了其它的功能。
 * FactoryBean是一个接口，当在IOC容器中的Bean实现了FactoryBean后，通过getBean(String beanName)获取到的bean对象
 * 并不是FactoryBean的实现类对象。而是这个实现类中的getObject()方法返回的对象。要想获取FactoryBean的实现类，就要
 * getBean(&BeanName)，在BeanName之前加上&。
 * FactoryBean可以说为IOC容器中Bean的实现提供了更加灵活的配置，相当于加上了一个简单工厂模式和装饰模式。可以在getObject()
 * 方法中灵活配置。
 */
public class FactoryBeanPojo implements FactoryBean{

    private String type;

    @Override
    public Object getObject() throws Exception {
        if ("student".equals(type)){
            return new Student();
        }else {
            return new School();
        }
    }

    @Override
    public Class<?> getObjectType() {
        return School.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
