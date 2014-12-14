package org.xiaoquan.spring.aop;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xiaoquan.spring.aop.model.CollectionModel;
import org.xiaoquan.spring.aop.model.ExampleBean;
import org.xiaoquan.spring.aop.service.ConfigService;

/**
 * Unit test for simple App.
 */
public class AopTest {

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
}
