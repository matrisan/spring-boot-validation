package com.github.validation.group.service;

import com.github.validation.group.pojo.UserInfoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;
import java.util.Date;

/**
 * TODO
 * <p>
 * create in 2021/5/13 11:37 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@SpringBootTest
class GroupValidateServiceTest {

    @Resource
    GroupValidateService service;

    @Nested
    @DisplayName("测试组 1")
    class Group1 {

        @DisplayName("各项数据均符合要求,不抛出异常")
        @Test
        void group11() {
            String username = "test_username";
            UserInfoDTO userInfo = new UserInfoDTO(username, "spring-boot@qq.com", new Date());
            UserInfoDTO dto = service.group1(userInfo);
            Assertions.assertEquals(username, dto.getUsername());
        }

        @DisplayName("username 不符合要求,抛出异常")
        @Test
        void group12() {
            UserInfoDTO userInfo = new UserInfoDTO(null, "spring-boot@qq.com", new Date());
            Assertions.assertThrows(ConstraintViolationException.class, () -> service.group1(userInfo));
        }
    }
    @Nested
    @DisplayName("测试组 2")
    class Group2 {

        @DisplayName("各项数据均符合要求,不抛出异常")
        @Test
        void group21() {
            String username = "test_username";
            UserInfoDTO userInfo = new UserInfoDTO(username, "spring-boot@qq.com", new Date());
            UserInfoDTO dto = service.group2(userInfo);
            Assertions.assertEquals(username, dto.getUsername());
        }

        @DisplayName("birthday 不符合要求,没有校验,不抛出异常")
        @Test
        void group22() {
            String username = "test_username";
            UserInfoDTO userInfo = new UserInfoDTO(username, "spring-boot@qq.com", null);
            UserInfoDTO dto = service.group2(userInfo);
            Assertions.assertEquals(username, dto.getUsername());
        }


    }

}