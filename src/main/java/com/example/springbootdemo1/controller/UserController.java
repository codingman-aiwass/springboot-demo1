package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.commons.Result;
import com.example.springbootdemo1.entity.User;
import com.example.springbootdemo1.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;
    @PostMapping
    public Result save(@RequestBody User user){
        userMapper.insert(user);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        Stack<Integer> integers = new Stack<>();

        return Result.success();
    }
}
