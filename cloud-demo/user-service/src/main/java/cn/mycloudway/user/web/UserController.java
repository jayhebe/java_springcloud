package cn.mycloudway.user.web;

import cn.mycloudway.user.config.PatternProperties;
import cn.mycloudway.user.pojo.User;
import cn.mycloudway.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PatternProperties patternProperties;

    @GetMapping("/prop")
    public PatternProperties getPatternProperties() {
        return patternProperties;
    }

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}
