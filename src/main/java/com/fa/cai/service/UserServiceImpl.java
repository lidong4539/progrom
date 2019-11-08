package com.fa.cai.service;

import com.fa.cai.dao.UserDao;
import com.fa.cai.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public String show() {
        return "hello world!";
    }
    @Override
    public List<User> showDao(Integer age) {
        return userDao.get(age);
    }
    @Override
    public String insert(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userDao.insert(user);
        return "Insert ( \\\"\"+name+\"\\\", age\"+age+\") OK!";
    }


}
