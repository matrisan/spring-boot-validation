package com.github.validation.group.service;

import com.github.validation.group.pojo.Group1;
import com.github.validation.group.pojo.Group2;
import com.github.validation.group.pojo.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * TODO
 * <p>
 * create in 2021/5/13 11:27 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@Validated
@Service
public class GroupValidateService {

    @Validated(Group1.class)
    public UserInfoDTO group1(@Valid UserInfoDTO data) {
        return data;
    }

    @Validated(Group2.class)
    public UserInfoDTO group2(@Valid UserInfoDTO data) {
        return data;
    }


}
