package com.fa.cai.dao;

import com.fa.cai.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserDao {

    @Select("SELECT id,username name FROM user ")
     List<User> get(Integer age);

    @Insert("INSERT INTO user(name, age) VALUES (#{name}, #{age})")
     void insert(User user);





}
