package com.longmao.common.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @Author: wwivan
 * @Date: 2020/4/1日9:52
 * @Description: 指向性验证jwtToken
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JwtToken {
    boolean required() default true;
}
