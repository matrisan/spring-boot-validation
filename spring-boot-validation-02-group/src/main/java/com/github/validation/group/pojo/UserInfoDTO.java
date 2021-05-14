package com.github.validation.group.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

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

    @NotBlank(groups = {Group1.class, Group2.class})
    @Length(min = 5, max = 20, groups = {Group1.class, Group2.class})
    String username;

    @Email(groups = {Group1.class, Group2.class})
    String email;

    @NotNull(groups = {Group1.class})
    @Past(groups = {Group1.class})
    Date birthday;

}