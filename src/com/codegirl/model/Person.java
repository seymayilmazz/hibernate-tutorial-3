package com.codegirl.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Şeyma Yılmaz on 30.7.2017.
 */
@Entity
@Table(name = "tbl_person")
public class Person {

    @Id
    @TableGenerator(name = "tableGenerator", table = "AdditionalTable", allocationSize = 1, pkColumnName = "tableName")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tableGenerator")
    private int id;

    @Column(name = "fullName")
    private String name;

    private int age;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Lob
    private String address;


    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
