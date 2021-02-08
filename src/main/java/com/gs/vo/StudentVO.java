package com.gs.vo;

import com.gs.pojo.Student;
import java.io.Serializable;
import lombok.Data;

/**
* 显示类
* @author guos
* @date 2021/02/02 21:44
*/
@Data
public class StudentVO extends Student implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 178818119491724L;
}