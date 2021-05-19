package com.github.validation.basic.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.validation.MessageInterpolatorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * TODO
 * <p>
 * create in 2021/5/17 11:23 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
//@Configuration
public class HibernateFailFastConfig {

    @Bean
    public static LocalValidatorFactoryBean defaultValidator() {
        LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
        MessageInterpolatorFactory interpolatorFactory = new MessageInterpolatorFactory();
        factoryBean.setMessageInterpolator(interpolatorFactory.getObject());
        factoryBean.getValidationPropertyMap().put("hibernate.validator.fail_fast", "true");
        return factoryBean;
    }
}
