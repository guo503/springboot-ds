package com.gs.service.impl;

import com.gs.mapper.UserMapper;
import com.gs.pojo.User;
import com.gs.service.UserService;
import mybatis.base.template.bs.service.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* 用户service实现类
* @author guos
* @date 2021/02/02 21:44
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}