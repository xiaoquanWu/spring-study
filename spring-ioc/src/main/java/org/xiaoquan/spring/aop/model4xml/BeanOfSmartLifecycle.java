package org.xiaoquan.spring.aop.model4xml;

import org.springframework.context.SmartLifecycle;

/**
 * Created by XiaoQuan on 2014/12/17.
 */
public class BeanOfSmartLifecycle implements SmartLifecycle {
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
        System.out.println("BeanOfSmartLifecycle start.............");

    }

    @Override
    public void stop() {
        System.out.println("BeanOfSmartLifecycle stop.............");

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return 10;
    }
}
