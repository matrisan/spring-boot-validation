package com.github.validation.sequence.pojo.constraint.validator;

import com.github.validation.sequence.pojo.constraint.Username2;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <p>
 * 创建时间为 下午6:20 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Slf4j
public class Username2Validator implements ConstraintValidator<Username2, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        log.error("@Username2 注解生效");
        return true;
    }
}
