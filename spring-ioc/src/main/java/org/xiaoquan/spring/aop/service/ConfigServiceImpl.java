package org.xiaoquan.spring.aop.service;

import org.xiaoquan.spring.aop.dao.ConfigDao;
import org.xiaoquan.spring.aop.model4xml.Config;

/**
 * Created by XiaoQuan on 2014/12/14.
 */
public class ConfigServiceImpl implements ConfigService{

    private ConfigDao configDao;

    @Override
    public Config getConfig(Integer id){
        return configDao.getConfig(id);
    }

    public void setConfigDao(ConfigDao configDao) {
        this.configDao = configDao;
    }
}
