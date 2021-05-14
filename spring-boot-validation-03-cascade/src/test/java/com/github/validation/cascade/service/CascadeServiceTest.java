package com.github.validation.cascade.service;

import com.github.validation.cascade.pojo.BookInfoDTO;
import com.github.validation.cascade.pojo.UserExtDTO;
import com.github.validation.cascade.pojo.UserInfoDTO;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 * <p>
 * create in 2021/5/14 9:29 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@SpringBootTest
class CascadeServiceTest {

    @Resource
    private CascadeService service;

    @DisplayName("UserExtDTO 中手机号码超过了长度,抛出异常")
    @Test
    void cascade1() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> service.cascade(getUserInfo1()));
    }

    @DisplayName("BookInfoDTO 中 expireDate 为过去的时间,抛出异常")
    @Test
    void cascade2() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> service.cascade(getUserInfo2()));
    }

    private UserInfoDTO getUserInfo1() {
        UserInfoDTO user = new UserInfoDTO();
        user.setUsername("test_username");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setUserExt(getUserExt1());
        user.setBookMaps(getBookMap1());
        return user;
    }

    private UserExtDTO getUserExt1() {
        UserExtDTO userExt = new UserExtDTO();
        userExt.setPhone("123456789011");
        userExt.setEmail("spring-boot@qq.com");
        return userExt;
    }

    private Map<Integer, BookInfoDTO> getBookMap1() {
        Map<Integer, BookInfoDTO> map = new HashMap<>();
        map.put(1, new BookInfoDTO("book1", DateTime.now().plusDays(1).toDate()));
        map.put(2, new BookInfoDTO("book2", DateTime.now().plusDays(2).toDate()));
        return map;
    }

    private UserInfoDTO getUserInfo2() {
        UserInfoDTO user = new UserInfoDTO();
        user.setUsername("test_username");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setUserExt(getUserExt2());
        user.setBookMaps(getBookMap2());
        return user;
    }

    private UserExtDTO getUserExt2() {
        UserExtDTO userExt = new UserExtDTO();
        userExt.setPhone("1234567890");
        userExt.setEmail("spring-boot@qq.com");
        return userExt;
    }

    private Map<Integer, BookInfoDTO> getBookMap2() {
        Map<Integer, BookInfoDTO> map = new HashMap<>();
        map.put(1, new BookInfoDTO("book1", DateTime.now().plusDays(1).toDate()));
        map.put(2, new BookInfoDTO("book2", DateTime.now().minusDays(2).toDate()));
        return map;
    }

}