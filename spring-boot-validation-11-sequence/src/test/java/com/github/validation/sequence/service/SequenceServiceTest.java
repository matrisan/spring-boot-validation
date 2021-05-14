package com.github.validation.sequence.service;

import com.github.validation.sequence.pojo.UserInfoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

/**
 * TODO
 * <p>
 * create in 2021/5/14 1:32 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@SpringBootTest
class SequenceServiceTest {

    @Resource
    SequenceService service;

    @Test
    void sequence() {
        service.sequence(getUserInfo());
    }

    private UserInfoDTO getUserInfo() {
        UserInfoDTO user = new UserInfoDTO();
        user.setUsername("test_name");
        user.setAge(19);
        user.setBirthday(new Date());
        return user;
    }

}