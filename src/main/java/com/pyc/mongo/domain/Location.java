//IntelliJ IDEA
//mongo
//Location
//2020/2/12
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.mongo.domain;

public class Location {
    private String place;
    private String year;

    public Location(String place, String year) {
        super();
        this.place = place;
        this.year = year;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public String getYear() {
        return year;
    }
}
