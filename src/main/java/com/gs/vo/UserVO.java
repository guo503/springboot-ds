package com.gs.vo;

import com.gs.pojo.User;
import java.io.Serializable;
import lombok.Data;

/**
* 用户显示类
* @author guos
* @date 2021/02/02 21:44
*/
@Data
public class UserVO extends User implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 631557245438883L;
}