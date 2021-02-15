package com.jerry.userprovider;

import com.jerry.userapi.IUserService;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 21:46
 * Description:
 */
public class UserServiceImpl implements IUserService {

    @Override
    public String getNameById(String id) {
        System.out.println("receive request data:" + id);
        // 数据库操作
        return "Jerry";
    }
}
