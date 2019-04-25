package com.xxmy.boot.neteasy_one.entity;

/**
 * @Title: User.java
 * @Package com.xxmy.boot.neteasy_one.entity
 * @Description: TODO(用一句话描述该文件做什么)
 * @author LiJing
 * @date 2019/4/25 16:05
 * @version v.3.0
 */

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author LiJing
 * @ClassName: User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/4/25 16:05
 */
@Data
public class User implements Serializable {

    private Long id;
    private String name;
    private Integer age;
    private Boolean sex;


}
