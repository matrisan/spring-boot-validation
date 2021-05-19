package com.github.validation.custom.service;

import com.github.validation.custom.pojo.UserInfoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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

    @DisplayName("用户名以 'test_'开头不会报错 ")
    @Test
    void custom1() {
        UserInfoDTO info1 = userInfo1();
        UserInfoDTO custom = service.custom(info1);
        Assertions.assertEquals(info1.getUsername(), custom.getUsername());
    }

    @DisplayName("用户名不是 'test_'开头不会报错 ")
    @Test
    void custom2() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> service.custom(userInfo2()));
    }

    private UserInfoDTO userInfo1() {
        UserInfoDTO userInfo = new UserInfoDTO();
        userInfo.setUsername("test_name");
        userInfo.setAge(18);
        return userInfo;
    }

    private UserInfoDTO userInfo2() {
        UserInfoDTO userInfo = new UserInfoDTO();
        userInfo.setUsername("name");
        userInfo.setAge(18);
        return userInfo;
    }

}
