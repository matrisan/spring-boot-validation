package com.github.validation.basic.service;

import com.github.validation.basic.pojo.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * TODO
 * <p>
 * create in 2021/5/13 7:31 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@Service
@Validated
public class UserInfoService {

    public UserInfoDTO check(@Valid UserInfoDTO user) {
        return user;
    }

}
