package com.gs.business;

import com.gs.pojo.Student;
import com.gs.query.StudentQuery;
import com.gs.vo.StudentVO;
import mybatis.base.template.bs.business.IBusiness;

/**
* service类
* @author guos
* @date 2021/02/02 21:44
*/
public interface StudentBusiness extends IBusiness<Student, StudentQuery, StudentVO> {
}