package com.google.main;

import java.util.Scanner;
import com.google.user.User;
import com.google.user.UserServiceImplement;

/**
 * @author Administrator
 * @date   2019-10-30
 */

public class Management {

    public static void main(String[] args){
        int result = 10;
        System.out.println("please choose the number: 1 login, 2 register, 3 forget password, 4 exit ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1 :
                UserServiceImplement userServiceImplement = new UserServiceImplement();
                User user = new User();
                System.out.println("please input username: ");
                user.setUsername(scanner.next());
                System.out.println("please input password:");
                user.setUserpassword(scanner.next());
                result = userServiceImplement.login(user);
                break;
            default:
                System.out.println(result);
                break;
        }
    }
}

