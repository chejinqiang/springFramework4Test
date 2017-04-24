package beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

/**
 * @author chejinqiang
 * @version V1.0
 * @Title:
 * @Description:
 * @date 17/4/24 下午5:45
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor{

    public MyInstantiationAwareBeanPostProcessor(){
        System.out.println("InstantiationAwareBeanPostProcessor:构造器方法调用");
    }

    public Object postProcessBeforeInstantiation(Class<?> aClass, String s) throws BeansException {
        return null;
    }

    public boolean postProcessAfterInstantiation(Object o, String s) throws BeansException {
        return false;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues propertyValues, PropertyDescriptor[] propertyDescriptors, Object o, String s) throws BeansException {
        return null;
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
