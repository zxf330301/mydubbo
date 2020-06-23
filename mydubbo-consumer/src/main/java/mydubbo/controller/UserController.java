package mydubbo.controller;

import mydubbo.dto.User;
import mydubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(){
        return userService.sayHello("zhangxiongfeng");
    }
}
