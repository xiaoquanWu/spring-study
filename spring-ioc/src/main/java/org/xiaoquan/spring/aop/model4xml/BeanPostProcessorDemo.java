package org.xiaoquan.spring.aop.model4xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by XiaoQuan on 2014/12/18.
 */
public class BeanPostProcessorDemo implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("userDao")) {
            //Do Something
        }
        System.out.println("postProcessBeforeInitialization + " + bean + ":" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization + " + bean + ":" + beanName);
        return bean;
    }
}
