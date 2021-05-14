package com.github.validation.sequence.pojo;

import com.github.validation.sequence.pojo.group.Group1;
import com.github.validation.sequence.pojo.group.Group2;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * TODO
 * <p>
 * create in 2021/5/14 2:01 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@GroupSequence({Default.class, Group1.class, Group2.class})
public interface ValidationGroupSequence {
}
