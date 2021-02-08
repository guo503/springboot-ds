package com.gs.controller;

import com.gs.business.UserBusiness;
import com.gs.pojo.User;
import com.gs.query.UserQuery;
import com.gs.vo.UserVO;
import mybatis.base.template.bs.controller.BaseController;
import mybatis.base.template.response.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户api类
 *
 * @author guos
 * @date 2021/02/02 21:44
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserBusiness, User, UserQuery, UserVO> {

    /**
     * 测试事务
     *
     * @param userVO
     * @return
     * @author guos
     * @date 2021/2/4 11:36
     **/
    @PostMapping("/testTx")
    public Result<Object> testTx(@RequestBody UserVO userVO) {
        return Result.success(baseBusiness.save(userVO));
    }
}
