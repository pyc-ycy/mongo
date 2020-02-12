//IntelliJ IDEA
//mongo
//DataController
//2020/2/12
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.mongo.web;

import com.pyc.mongo.dao.PersonRepository;
import com.pyc.mongo.domain.Location;
import com.pyc.mongo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

@RestController
public class DataController {
    @Autowired
    PersonRepository personRepository;

    // testing the function of save data into database
    @RequestMapping("/save")
    public Person save(){
        Person p = new Person("pyc",22);
        Collection<Location> locations = new LinkedHashSet<Location>();
        Location loc1 = new Location("陆丰","2017");
        Location loc2 = new Location("肇庆","2018");
        Location loc3 = new Location("肇庆","2019");
        Location loc4 = new Location("肇庆","2020");
        Location loc5 = new Location("肇庆","2021");
        locations.add(loc1);
        locations.add(loc2);
        locations.add(loc3);
        locations.add(loc4);
        locations.add(loc5);
        p.setLocations(locations);
        return personRepository.save(p);
    }

    // testing query by using function
    @RequestMapping("/q1")
    public Person q1(String name){
        return personRepository.findByName(name);
    }

    // testing query by using @Query
    @RequestMapping("/q2")
    public List<Person> q2(Integer age){
        return personRepository.withQueryFindByAge(age);
    }
}
