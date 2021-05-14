package com.github.validation.basic.service;

import com.github.validation.basic.pojo.UserInfoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;
import java.util.Date;

/**
 * TODO
 * <p>
 * create in 2021/5/13 7:36 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@DisplayName("测试基本参数")
@SpringBootTest
class UserInfoServiceTest {

    @Resource
    private UserInfoService service;

    @DisplayName("参数均符合时,方法正常执行")
    @Test
    void check1() {
        UserInfoDTO user = new UserInfoDTO("test_name", 18, "spring-boot@qq.com", new Date());
        service.check(user);
    }

    @DisplayName("当年龄不符合时,抛出异常")
    @Test
    void check2() {
        UserInfoDTO user = new UserInfoDTO("test_name", 30, "spring-boot@qq.com", new Date());
        Assertions.assertThrows(ConstraintViolationException.class, () -> service.check(user));
    }

}