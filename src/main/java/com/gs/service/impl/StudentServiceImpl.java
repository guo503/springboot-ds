package com.gs.service.impl;

import com.gs.conf.ds.DS;
import com.gs.conf.ds.DSConst;
import com.gs.mapper.StudentMapper;
import com.gs.pojo.Student;
import com.gs.service.StudentService;
import mybatis.base.template.bs.service.ServiceImpl;
import mybatis.core.entity.Condition;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* service实现类
* @author guos
* @date 2021/02/02 21:44
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {


    @DS(DSConst.DS_SLAVE1)
    @Override
    public int save(Student student) {
        return super.save(student);
    }

    @DS(DSConst.DS_SLAVE1)
    @Override
    public List<Student> listByCondition(Condition<Student> condition) {
        return super.listByCondition(condition);
    }
}
