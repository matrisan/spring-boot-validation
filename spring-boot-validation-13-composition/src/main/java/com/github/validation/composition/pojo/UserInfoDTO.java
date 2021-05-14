package com.github.validation.composition.pojo;

import com.github.validation.composition.pojo.constraint.Composition;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 * <p>
 * create in 2021/5/14 3:35 下午
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

    String username;

    @Composition
    String identity;

}
