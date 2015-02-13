package org.xiaoquan.spring.aop.model4xml;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by XiaoQuan on 2014/12/16.
 */

/**
 * 实现ApplicationContextAware与spring耦合
 */
public class CommandManager implements ApplicationContextAware{

    private ApplicationContext applicationContext;


    public <T> T getBean(String beanName, Class<T> clz) {
        return applicationContext.getBean(beanName, clz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
