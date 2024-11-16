package com.example.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    public void createUser(String name) {
        log.info("UserService.createUser 실행");
        log.info("현재 클래스: {}", this.getClass().getName());
    }
}
