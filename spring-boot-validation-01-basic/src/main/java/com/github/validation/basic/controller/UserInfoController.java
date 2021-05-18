package com.github.validation.basic.controller;

import com.github.validation.basic.pojo.UserInfoDTO;
import com.github.validation.basic.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * TODO
 * <p>
 * create in 2021/5/17 10:00 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserInfoController {

    @PostMapping("/user1")
    public UserInfoDTO userInfo1(@RequestBody @Valid UserInfoDTO userInfo) {
        return userInfo;
    }

    private final UserInfoService service;

    @PostMapping("/user2")
    public UserInfoDTO userInfo2(@RequestBody UserInfoDTO userInfo) {
        return service.check(userInfo);
    }
}
