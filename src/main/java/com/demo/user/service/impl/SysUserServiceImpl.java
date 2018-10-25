package com.demo.user.service.impl;

import com.demo.base.BaseServiceImpl;
import com.demo.user.entity.SysUser;
import com.demo.user.mapper.SysUserMapper;
import com.demo.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/10/25
 */
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
}
