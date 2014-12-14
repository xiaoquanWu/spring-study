package org.xiaoquan.spring.aop.model;

import java.beans.ConstructorProperties;

public class ExampleBean {

    private int years;
    private String ultimateAnswer;

    /**
     * 通过@ConstructorProperties (JDK 1.6) 注解可以更改注入时的属性名
     * @param years
     * @param ultimateAnswer
     */
    @ConstructorProperties({"yearsAlias", "ultimateAnswerAlias"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public String toString() {
        return this.years + "," + this.ultimateAnswer;
    }
}