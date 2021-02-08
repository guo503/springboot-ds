package com.gs.business;

import com.gs.pojo.User;
import com.gs.query.UserQuery;
import com.gs.vo.UserVO;
import mybatis.base.template.bs.business.IBusiness;

/**
* 用户service类
* @author guos
* @date 2021/02/02 21:44
*/
public interface UserBusiness extends IBusiness<User, UserQuery, UserVO> {
}