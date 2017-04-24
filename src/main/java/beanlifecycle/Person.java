package beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/4/24 下午5:25
 */
public class Person implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean,BeanFactoryPostProcessor,BeanPostProcessor{

    private String name;

    private String address;

    private String phone;

    public Person(){
        System.out.println("Person:调用构造器方法");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("person:注入属性name");
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("person:注入属性address");
    }

    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("person:注入属性phone");
    }


    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("person:调用BeanFactoryAware的setBeanFactory方法");
    }

    public void setBeanName(String s) {
        System.out.println("person:调用BeanNameAware的setBeanName方法");
    }

    public void destroy() throws Exception {
        System.out.println("person:调用DisposableBean的destroy方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("person:调用InitializingBean的afterPropertiesSet方法");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("person:调用BeanFactoryPostProcessor的postProcessBeanFactory方法");
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("person:调用BeanPostProcessor的postProcessBeforeInitialization方法");
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("person:调用BeanPostProcessor的postProcessAfterInitialization方法");
        return null;
    }

    public void initFirst(){
        System.out.println("person:调用initFirst方法,对应bean上的init-method");
    }

    public void destroyFirst(){
        System.out.println("person:调用destroyFirst方法,对应bean上的destroy-method方法");
    }
}
