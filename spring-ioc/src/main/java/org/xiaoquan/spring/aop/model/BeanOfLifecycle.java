package org.xiaoquan.spring.aop.model;

import org.springframework.context.Lifecycle;

/**
 * Created by XiaoQuan on 2014/12/17.
 */
public class BeanOfLifecycle implements Lifecycle{

    public void say() {
        System.out.println("hello");
    }

    @Override
    public void start() {
        System.out.println("BeanOfLifecycle is start....");
    }

    @Override
    public void stop() {
        System.out.println("BeanOfLifecycle is end....");
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
