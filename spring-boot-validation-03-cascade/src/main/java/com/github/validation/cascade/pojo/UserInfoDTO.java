package com.github.validation.cascade.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.Map;

/**
 * TODO
 * <p>
 * create in 2021/5/13 11:29 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfoDTO {

    @Min(1) @Max(150)
    Integer age;
    @Valid
    UserExtDTO userExt;

    String username;

    Date birthday;
    Map<Integer, @Valid BookInfoDTO> bookMaps;

}