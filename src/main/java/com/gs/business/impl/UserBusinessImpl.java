package com.gs.business.impl;

import com.gs.business.UserBusiness;
import com.gs.pojo.Student;
import com.gs.pojo.User;
import com.gs.query.UserQuery;
import com.gs.service.StudentService;
import com.gs.service.UserService;
import com.gs.vo.UserVO;
import mybatis.base.template.bs.business.BusinessImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户业务类
 *
 * @author guos
 * @date 2021/02/02 21:44
 */
@Service
public class UserBusinessImpl extends BusinessImpl<UserService, User, UserQuery, UserVO> implements UserBusiness {

    @Autowired
    private StudentService studentService;

    @Transactional
    @Override
    public int save(UserVO userVO) {
        //保存用户新信息
        super.save(userVO);
        //int i = 1 / 0;
        Student student = Student.builder().id("4").age(3).name("测试").build();
        studentService.save(student);
        return 1;
    }
}
