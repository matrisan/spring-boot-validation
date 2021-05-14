package com.github.validation.basic.pojo;

import javax.validation.Payload;

/**
 * TODO
 * <p>
 * create in 2021/5/14 4:18 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */

public interface Severity {

    interface Info extends Payload {
    }

    interface Error extends Payload {
    }

}
