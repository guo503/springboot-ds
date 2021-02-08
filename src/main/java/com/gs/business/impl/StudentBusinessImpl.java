package com.gs.business.impl;

import com.gs.business.StudentBusiness;
import com.gs.pojo.Student;
import com.gs.query.StudentQuery;
import com.gs.service.StudentService;
import com.gs.vo.StudentVO;
import mybatis.base.template.bs.business.BusinessImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务类
 *
 * @author guos
 * @date 2021/02/02 21:44
 */
@Service
public class StudentBusinessImpl extends BusinessImpl<StudentService, Student, StudentQuery, StudentVO> implements StudentBusiness {


    @Override
    public int save(StudentVO studentVO) {
        return super.save(studentVO);
    }

    @Override
    public List<StudentVO> listByCondition(StudentQuery studentQuery, int pageNum, int pageSize) {
        return super.listByCondition(studentQuery, pageNum, pageSize);
    }
}
