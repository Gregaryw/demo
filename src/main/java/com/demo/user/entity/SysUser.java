package com.demo.user.entity;

import com.demo.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/10/25
 */
@Getter
@Setter
public class SysUser extends BaseEntity {
    @Id
    private Integer id;
    private String username;
    private String password;
}
