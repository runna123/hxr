﻿package com.gsjk.user;

import com.gsjk.DefaultValue.DefaultValue;
import com.gsjk.result.Result;

/**
 * @program: usermanagement
 * @Description: implement user service
 * @author: hxr
 * @date: 2019/12/9 
 */
public class UserServiceImpl implements UserService {
    /**
     * @param userinfo
     * @Description: to login the system
     * @Param: [userinfo]
     * @return: com.gsjk.result.Result
     * @Author: hxr
     * @Date: 2019/12/9
     */
    @Override
    public Result login(UserInfo userLogin) {
        UserDaoImpl userDao = new UserDaoImpl();
        UserInfo userInfo = userDao.findUserInfoByName(userLogin.getUsername());
        Result result = new Result(402,"incorrect pwd");
        if(userInfo.getUsername().equals(userLogin.getUsername()) &&
                userInfo.getPassword().equals(userLogin.getPassword())){
            result.setResultcode(201);
            result.setResultmessage("welcome " + userInfo.getUsername());
        }
        return result;
    }

    /**
     * @param userInfo
     * @Description: to register the new user
     * @Param: [userInfo]
     * @return: com.gsjk.result.Result
     * @Author: hxr
     * @Date: 2019/12/9
     *//
    @Override
    public Result register(UserInfo userInfo) {
        UserDaoImpl userDao = new UserDaoImpl();
        boolean register = userDao.saveUser(userInfo);
        Result result = new Result(404,"can not save");
        if(register){
            result.setResultcode(200);
            result.setResultmessage("saved");
        }
        return result;
    }
}
