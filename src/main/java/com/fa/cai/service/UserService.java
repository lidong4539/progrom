package com.fa.cai.service;

import com.fa.cai.entity.User;

import java.util.List;

public interface UserService {
     String show();
     List<User> showDao(Integer age);
     String insert(String name, Integer age);
}
