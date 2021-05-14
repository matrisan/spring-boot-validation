package com.github.validation.sequence.service;

import com.github.validation.sequence.pojo.UserInfoDTO;
import com.github.validation.sequence.pojo.ValidationGroupSequence;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * TODO
 * <p>
 * create in 2021/5/14 1:27 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@Validated
@Service
public class SequenceService {

    @Validated({ValidationGroupSequence.class})
    public UserInfoDTO sequence(@Valid UserInfoDTO user) {
        return user;
    }

}
