package com.classbook.chapter.wechat.loginform;

import com.classbook.chapter.wechat.registerform.RegisterForm;
import com.classbook.chapter.wechat.wechatform.WeChatForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelLogin;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton registerButton;

    public JButton getRegisterButton() {
        return registerButton;
    }

    public LoginForm(){
        setTitle("Login Form");
        setSize(280, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panelLogin.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panelLogin.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 100, 80, 25);
        panelLogin.add(loginButton);

        registerButton = new JButton("register");
        registerButton.setBounds(100, 100, 80, 25);
        panelLogin.add(registerButton);

        add(panelLogin);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
                WeChatForm weChatForm = new WeChatForm();
                weChatForm.setFrameWeChatVisible(true);
                dispose();
            }
        });

    }

    private void login() {
    }


    public void setFrameLoginVisible(Boolean visible){
        setVisible(visible);
    }

}
