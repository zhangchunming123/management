package com.management.management.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //java实体类和数据库表的对应
@Data  //lombok的注解，自动帮我们生成get/set方法的。
public class Book {
    @Id //是指定当前实体的主键是哪一个属性，因为实体和数据库表绑定到一起了，所以说必须指定
    private Integer id;
    private String name;
    private String author;
    private String publish;
    private Integer pages;
    private float price;
}
