package com.gsjk.user;

/**
 * @program: usermanagement
 * @Description: to get user information from data source
 * @author: hxr
 * @date: 2019/12/9 
 */
public interface UserDao {
    /**
    * @Description: to find user by user name
    * @Param: [username]
    * @return: com.gsjk.user.UserInfo
    * @Author: hxr
    * @Date: 2019/12/9 
    */
    public UserInfo findUserInfoByName(String username);

    /**
    * @Description: to register user in data source
    * @Param: [userInfo]
    * @return: int
    * @Author: hxr
    * @Date: 2019/12/9 
    */ 
    public boolean saveUser(UserInfo userInfo);
}
