package com.google.user;

/**
 * @author hxr
 * @date   2019-10-30
 */

public class UserServiceImplement{

    public int login(User user) {

        int result = 3;
        if(DefaultValue.USERNAME.equals(user.getUsername())){
            if (DefaultValue.USERNAME.equals(user.getUserpassword())){
                System.out.println("welcome" + user.getUsername());
                return 1;

            }
            else {
                System.out.println("password incorrect");
                return 2;

            }
        }
        else {
            result = 0;
            System.out.println("username incorrect");
        }
        return result;
    }
    public int register(User user){
        return 0 ;
    }



}
