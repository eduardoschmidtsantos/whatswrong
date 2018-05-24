package com.whatswrong.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import com.whatswrong.validation.Validator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Aspect
public class ValidatorAdvice {
    @Around("execution(public * * (.., @com.whatswrong.annotations.Valid (*), ..))")
    public void before(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for (int i = 0; i < parameterAnnotations.length; i++) {
            Object object = args[i];
            ValidatorAnnotationExecutor.validate(object);
        }
    }
}
