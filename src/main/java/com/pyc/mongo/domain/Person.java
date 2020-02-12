//IntelliJ IDEA
//mongo
//Person
//2020/2/12
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.Collection;
import java.util.LinkedHashSet;


//映射领域和MongoDB的文档
// Location map and document of MongoDB
@Document
public class Person {
    @Id
    private String id;
    private String name;
    private Integer age;
    @Field("locs")
    private Collection<Location> locations = new LinkedHashSet<Location>();

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setLocations(Collection<Location> locations) {
        this.locations = locations;
    }

    public Collection<Location> getLocations() {
        return locations;
    }
}
