package com.gs.mapper;

import com.gs.pojo.User;
import mybatis.base.mapper.Mapper;
import mybatis.base.mapper.SoftDeleteMapper;

/**
* 用户数据访问层
* @author guos
* @date 2021/02/02 21:44
*/
public interface UserMapper extends Mapper<User>, SoftDeleteMapper<User> {
}