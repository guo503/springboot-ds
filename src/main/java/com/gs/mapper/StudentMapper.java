package com.gs.mapper;

import com.gs.pojo.Student;
import mybatis.base.mapper.Mapper;
import mybatis.base.mapper.SoftDeleteMapper;

/**
 * 数据访问层
 *
 * @author guos
 * @date 2021/02/02 21:44
 */
public interface StudentMapper extends Mapper<Student>, SoftDeleteMapper<Student> {
}
