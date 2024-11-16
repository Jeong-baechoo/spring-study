package com.example.springaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Around("execution(* com.example.springaop.service.UserService.*(..))")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        // 메서드 실행 전
        log.info("start - {} / target: {}",
                joinPoint.getSignature().getName(),
                joinPoint.getTarget().getClass().getName());

        // 실행
        Object result = joinPoint.proceed();

        // 메서드 실행 후
        log.info("finished - {}", joinPoint.getSignature().getName());

        return result;
    }
}
