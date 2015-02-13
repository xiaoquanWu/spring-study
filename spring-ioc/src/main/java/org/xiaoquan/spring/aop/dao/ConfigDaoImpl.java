package org.xiaoquan.spring.aop.dao;

import org.xiaoquan.spring.aop.model4xml.Config;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by XiaoQuan on 2014/12/14.
 */
public class ConfigDaoImpl implements ConfigDao{

    private static Map<Integer, Config> data = new HashMap<Integer, Config>();
    static {
        data.put(1, new Config(1, "IHG", "http://ihg", LocalDate.now()));
        data.put(2, new Config(2, "HYATT", "http://hyatt", LocalDate.now().plusYears(1)));
        data.put(3, new Config(3, "CHOICE", "http://choice", LocalDate.now().minusYears(1)));
        data.put(4, new Config(4, "TGS", "http://tgs", LocalDate.now().plusMonths(24)));
        data.put(5, new Config(5, "TAOBAO", "http://taobao", LocalDate.now().plusDays(700)));
    }

    @Override
    public Config getConfig(Integer id) {
        return data.get(id);
    }

    public static void setData(Map<Integer, Config> data) {
        ConfigDaoImpl.data = data;
    }
}
