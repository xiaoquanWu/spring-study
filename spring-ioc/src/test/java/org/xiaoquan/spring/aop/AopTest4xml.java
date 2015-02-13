package org.xiaoquan.spring.aop;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xiaoquan.spring.aop.model4xml.BeanOfLifecycle;
import org.xiaoquan.spring.aop.model4xml.CollectionModel;
import org.xiaoquan.spring.aop.model4xml.ExampleBean;
import org.xiaoquan.spring.aop.model4xml.CommandManager;
import org.xiaoquan.spring.aop.service.ConfigService;

/**
 * Unit test for simple App.
 */
public class AopTest4xml {

    @Test
    public void testInit() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
    }

    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        ConfigService configService = applicationContext.getBean("configService", ConfigService.class);

        ExampleBean exampleBean = applicationContext.getBean("exampleBean", ExampleBean.class);

        System.out.println(configService.getConfig(1).getDate());
        System.out.println(exampleBean);
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application-context.xml", "application-context-collection.xml"});
        CollectionModel collectionModel = applicationContext.getBean("collectionObject", CollectionModel.class);
        System.out.println(collectionModel);
    }

    @Test
    public void testApplicationContextAware() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        CommandManager commandManager = applicationContext.getBean("commandManager", CommandManager.class);
        ConfigService configService = commandManager.getBean("configService", ConfigService.class);
        System.out.println(configService.getConfig(1).getName());
    }

    @Test
    public void testLifecycle() throws InterruptedException {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        applicationContext.registerShutdownHook(); //没有webContainer下必须加这句

        BeanOfLifecycle beanOfLifecycle = applicationContext.getBean("beanOfLifecycle", BeanOfLifecycle.class);
        beanOfLifecycle.say();

    }
}
