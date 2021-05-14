package com.github.validation.custom.service;

import com.github.validation.custom.pojo.UserInfoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;

/**
 * TODO
 * <p>
 * create in 2021/5/14 10:12 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@SpringBootTest
class CustomServiceTest {

    @Resource
    private CustomService service;

    @Test
    void custom() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> service.custom(userInfo()));
    }

    private UserInfoDTO userInfo() {
        UserInfoDTO userInfo = new UserInfoDTO();
        userInfo.setUsername("name");
        userInfo.setAge(18);
        return userInfo;
    }

}