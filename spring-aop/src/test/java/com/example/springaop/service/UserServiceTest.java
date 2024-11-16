package com.example.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void proxyTest() {
        log.info("userService class: {}", userService.getClass());
        log.info("isAopProxy: {}", AopUtils.isAopProxy(userService));

        userService.createUser("test");
    }
}
