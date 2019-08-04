package com.example.demo.persistence.rest.aspect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Yudai Tokunaga
 */
@Component
@Aspect
public class RestLoggerAspect {

    private static final Logger logger = LoggerFactory.getLogger(RestLoggerAspect.class);

    @Before("execution(* *..*.*RestClientImpl.request*(..))")
    public void restRequestLog(JoinPoint joinPoint) {
        logger.info("Signature: " + joinPoint.getSignature().toString());
        logger.info("Request: " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "execution(* *..*.*RestClientImpl.request*(..))", returning = "returnValue")
    public void restResponseLog(JoinPoint joinPoint, Object returnValue) {
        String response = "";
        try {
            response = new ObjectMapper().writeValueAsString(returnValue);
        } catch (JsonProcessingException e) {
            response = "No response";
        }
        logger.info("Response: " + response);
    }
}
