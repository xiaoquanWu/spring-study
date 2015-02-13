package org.xiaoquan.spring.aop.model4xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by XiaoQuan on 2014/12/14.
 */
public class CollectionModel {
    private List<Object> someList;
    private Set<Object> someSet;
    private Map<Integer, String> someMap;
    private Properties properties;

    public void setSomeList(List<Object> someList) {
        this.someList = someList;
    }

    public void setSomeSet(Set<Object> someSet) {
        this.someSet = someSet;
    }

    public void setSomeMap(Map<Integer, String> someMap) {
        this.someMap = someMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionModel{" +
                "someList=" + someList +
                ", someSet=" + someSet +
                ", someMap=" + someMap +
                ", properties=" + properties +
                '}';
    }
}
