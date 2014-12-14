package org.xiaoquan.spring.aop.utils;

import org.xiaoquan.spring.aop.dao.ConfigDao;
import org.xiaoquan.spring.aop.dao.ConfigDaoImpl;
import org.xiaoquan.spring.aop.service.ConfigService;

/**
 * Created by XiaoQuan on 2014/12/14.
 */
public class BeanFactory {

    public static ConfigDao createConfigDao(){
        return new ConfigDaoImpl();
    }
}
