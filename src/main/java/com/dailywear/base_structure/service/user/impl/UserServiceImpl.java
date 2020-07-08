package com.dailywear.base_structure.service.user.impl;

import com.dailywear.base_structure.common.entity.User;
import com.dailywear.base_structure.mapper.user.UserMapper;
import com.dailywear.base_structure.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }
}
