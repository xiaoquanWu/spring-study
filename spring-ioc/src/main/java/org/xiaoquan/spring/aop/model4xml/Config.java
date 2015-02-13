package org.xiaoquan.spring.aop.model4xml;

import java.time.LocalDate;

/**
 * Created by XiaoQuan on 2014/12/14.
 */
public class Config {
    private Integer id;
    private String name;
    private String value;
    private LocalDate date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Config(Integer id, String name, String value, LocalDate date) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.date = date;
    }
}
