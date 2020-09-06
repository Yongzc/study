package com.bianyiit.web;

import com.bianyiit.domain.User;
import com.bianyiit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author zeika
 * @Date 2020/8/25 11:19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        return userList;
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "ok";
    }


}
