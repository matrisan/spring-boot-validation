package com.github.validation.basic.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TODO
 * <p>
 * create in 2021/5/17 10:01 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@SpringBootTest
@AutoConfigureMockMvc
class UserInfoControllerTest {


    @Resource
    private MockMvc mockMvc;

    private static final String username = "test_name";
    private static final int age = 28;
    private static final String email = "spring-boot@qq.com";

    /**
     * 2021-05-19 16:22:19 - 1621412539000L
     * 2033-05-18 11:33:19 - 1999999999999L
     */
    private static final long birthday = 1999999999999L;

    @Test
    void userInfo1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/user1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(getUserInfo1()))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username").value(username))
                .andExpect(jsonPath("$.age").value(age))
                .andExpect(jsonPath("$.email").value(email))
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    private String getUserInfo1() {
        return "{\n" +
                "  \"username\": \"" + username + "\",\n" +
                "  \"age\": " + age + ",\n" +
                "  \"email\": \"" + email + "\",\n" +
                "  \"birthday\": " + birthday +
                "}";
    }

}