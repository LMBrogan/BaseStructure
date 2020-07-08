package com.dailywear.base_structure.controller;

import com.dailywear.base_structure.common.entity.User;
import com.dailywear.base_structure.service.user.IUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags = "用户管理相关接口")
public class UserController {
 
    @Autowired
    private IUserService userServiceImpl;

    @GetMapping("getUser/{id}")
    @ApiOperation("根据id更新用户的接口")
    public User GetUser(@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable int id){
        return userServiceImpl.queryUserById(id);
    }
}