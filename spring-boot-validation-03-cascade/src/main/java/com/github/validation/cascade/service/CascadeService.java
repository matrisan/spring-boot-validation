package com.github.validation.cascade.service;

import com.github.validation.cascade.pojo.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * TODO
 * <p>
 * create in 2021/5/14 9:27 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@Validated
@Service
public class CascadeService {

    public UserInfoDTO cascade(@Valid UserInfoDTO userInfo) {
        return userInfo;
    }


}
