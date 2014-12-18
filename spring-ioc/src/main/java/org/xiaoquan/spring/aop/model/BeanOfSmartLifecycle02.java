package org.xiaoquan.spring.aop.model;

import org.springframework.context.SmartLifecycle;

/**
 * Created by XiaoQuan on 2014/12/17.
 */
public class BeanOfSmartLifecycle02 implements SmartLifecycle {
    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        System.out.println("callback run ............");
        callback.run();
    }

    @Override
    public void start() {
        System.out.println("BeanOfSmartLifecycle02 start.............");

    }

    @Override
    public void stop() {
        System.out.println("BeanOfSmartLifecycle02 stop.............");

    }

    @Override
    public boolean isRunning() {
        return true;
    }

    @Override
    public int getPhase() {
        return 20;
    }
}
