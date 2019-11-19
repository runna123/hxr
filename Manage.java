package com.classbook.chapter.wechat;

import com.classbook.chapter.wechat.loginform.LoginForm;
import com.classbook.chapter.wechat.registerform.RegisterForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manage {
    public static void main(String[] arges){
        final LoginForm loginForm = new LoginForm();
        final RegisterForm registerForm = new RegisterForm();
        loginForm.setFrameLoginVisible(true);

        loginForm.getRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerForm.setFrameRegisterVisible(true);
                loginForm.setFrameLoginVisible(false);
            }
        });
        registerForm.getBackButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerForm.setFrameRegisterVisible(false);
                loginForm.setFrameLoginVisible(true);
            }
        });
    }

}
