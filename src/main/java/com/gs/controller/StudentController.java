package com.gs.controller;

import com.gs.business.StudentBusiness;
import com.gs.pojo.Student;
import com.gs.query.StudentQuery;
import com.gs.vo.StudentVO;
import mybatis.base.template.bs.controller.BaseController;
import mybatis.base.template.response.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * api类
 *
 * @author guos
 * @date 2021/02/02 21:44
 */
@RestController
@RequestMapping("/student")
public class StudentController extends BaseController<StudentBusiness, Student, StudentQuery, StudentVO> {

    @RequestMapping
    @Override
    public Result<List<StudentVO>> list(StudentQuery studentQuery) {
        return Result.success(baseBusiness.listByCondition(studentQuery, this.getPageNum(), this.getPageSize()));
    }
}
