package com.github.validation.sequence.pojo.constraint;


import com.github.validation.sequence.pojo.constraint.validator.Username2Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TODO
 * <p>
 * create in 2021/5/14 10:07 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
//指定注解的处理类
@Constraint(validatedBy = {Username2Validator.class})
public @interface Username2 {

    String value() default "";

    String message() default "用户 ID 不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
