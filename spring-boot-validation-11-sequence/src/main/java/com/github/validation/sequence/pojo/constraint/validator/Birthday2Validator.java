package com.github.validation.sequence.pojo.constraint.validator;

import com.github.validation.sequence.pojo.constraint.Birthday2;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

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
public class Birthday2Validator implements ConstraintValidator<Birthday2, Date> {

    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        log.error("@Birthday2 注解生效");
        return true;
    }
}
