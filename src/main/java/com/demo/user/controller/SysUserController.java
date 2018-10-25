package com.demo.user.controller;

import com.demo.base.ResponseParam;
import com.demo.user.entity.SysUser;
import com.demo.user.service.SysUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/10/25
 */
@RestController
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/getUserList")
    public List<SysUser> list(){
        PageHelper.startPage(1,5);
        return  sysUserService.selectListByPage();
    }

    @GetMapping("/getUser")
    public  ResponseParam<String> selectByPrimaryKey(@RequestParam("id")Integer id){
       return  ResponseParam.SUCCESS().addData("user",sysUserService.selectByPrimaryKey(id));
    }
}
