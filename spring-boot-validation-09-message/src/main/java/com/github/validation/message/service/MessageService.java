package com.github.validation.message.service;

import com.github.validation.message.pojo.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * TODO
 * <p>
 * create in 2021/5/14 3:15 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@Slf4j
@Validated
@Service
public class MessageService {

    public UserInfoDTO message(@Valid UserInfoDTO user) {
        return user;
    }

}
