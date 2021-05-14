package com.github.validation.message.service;

import com.github.validation.message.pojo.UserInfoDTO;
import org.joda.time.DateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * TODO
 * <p>
 * create in 2021/5/14 3:18 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@SpringBootTest
class MessageServiceTest {

    @Resource
    private MessageService service;

    @DisplayName("用户名长度不符合要求")
    @Test
    void message1() {
        ConstraintViolationException exception = assertThrows(ConstraintViolationException.class,
                () -> service.message(new UserInfoDTO("TEST", DateTime.now().toDate())));
        System.out.println(exception.getMessage());
    }

    @DisplayName("日期不符合要求")
    @Test
    void message2() {
        ConstraintViolationException exception = assertThrows(ConstraintViolationException.class,
                () -> service.message(new UserInfoDTO("TEST123", DateTime.now().plusDays(1).toDate())));
        System.out.println(exception.getMessage());
    }


}