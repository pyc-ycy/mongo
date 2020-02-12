//IntelliJ IDEA
//mongo
//PersonRepository
//2020/2/12
// Author:御承扬
//E-mail:2923616405@qq.com


package com.pyc.mongo.dao;

import com.pyc.mongo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {
    // query by using function
    Person findByName(String name);

    // query by using @Query,query parameter is constructed by json string
    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);
}
