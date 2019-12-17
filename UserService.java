package com.gsjk.user;

import com.gsjk.result.Result;

/**
 * @program: usermanagement
 * @Description: declare user interface
 * @author: hxr
 * @date: 2019/12/9
 */
public interface UserService {
    /**
    * @Description: to login the system
    * @Param: [userinfo]
    * @return: com.gsjk.result.Result
    * @Author: hxr
    * @Date: 2019/12/9 
    */ 
   public Result login(UserInfo userinfo);
   
   /**
   * @Description: to register the new user
   * @Param: [userInfo]
   * @return: com.gsjk.result.Result
   * @Author: hxr
   * @Date: 2019/12/9 
   */ 
   public Result register(UserInfo userInfo);
}
