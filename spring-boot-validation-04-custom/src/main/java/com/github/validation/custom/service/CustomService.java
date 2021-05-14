package com.github.validation.custom.service;

import com.github.validation.custom.pojo.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * TODO
 * <p>
 * create in 2021/5/14 10:11 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@Validated
@Service
public class CustomService {

    public UserInfoDTO custom(@Valid UserInfoDTO user) {
        return user;
    }

}
