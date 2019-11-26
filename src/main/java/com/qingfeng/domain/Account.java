package com.qingfeng.domain;

/**
 * @PackageName: com.qingfeng.domain
 * @ClassName: Account
 * @Author: QingFeng
 * @Date: 2019-11-19 19:39
 * @Description: //TODO
 */

public class Account {

    private Integer id;
    private String name;
    private double money;

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
