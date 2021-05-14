package com.github.validation.composition.service;

import com.github.validation.composition.pojo.UserInfoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * TODO
 * <p>
 * create in 2021/5/14 3:50 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@SpringBootTest
class CompositionServiceTest {

    @Resource
    private CompositionService service;

    @Test
    void composition() {
        service.composition(new UserInfoDTO("1111", "18888888888123"));
    }
}