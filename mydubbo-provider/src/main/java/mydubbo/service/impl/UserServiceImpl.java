package mydubbo.service.impl;

import mydubbo.dto.User;
import mydubbo.service.UserService;

public class UserServiceImpl implements UserService {
    public User sayHello(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }
}
