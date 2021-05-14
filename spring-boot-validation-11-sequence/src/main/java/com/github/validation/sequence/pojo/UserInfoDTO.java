package com.github.validation.sequence.pojo;

import com.github.validation.sequence.pojo.constraint.Birthday1;
import com.github.validation.sequence.pojo.constraint.Birthday2;
import com.github.validation.sequence.pojo.constraint.Username1;
import com.github.validation.sequence.pojo.constraint.Username2;
import com.github.validation.sequence.pojo.group.Group1;
import com.github.validation.sequence.pojo.group.Group2;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

/**
 * TODO
 * <p>
 * create in 2021/5/14 1:27 下午
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

    @Username1(groups = {Group1.class})
    @Username2(groups = {Group1.class})
    String username;

    @Min(value = 1)
    @Max(value = 150)
    Integer age;

    @Birthday1(groups = {Group2.class})
    @Birthday2(groups = {Group2.class})
    Date birthday;


}
