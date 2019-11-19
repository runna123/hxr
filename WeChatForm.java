package com.classbook.chapter.wechat.wechatform;

/**
 * @Description:设置主界面可见
 * @Param: [visible]
 * @return: void
 * @Author: hxr
 * @Date: 2019/11/17  下午
 */

import javax.swing.*;

public class WeChatForm extends JFrame {
    private JPanel panelMain;

    public WeChatForm(){
        setTitle("WeChat Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelMain = new JPanel();
        panelMain.setLayout(null);

    }
    public void setFrameWeChatVisible(Boolean visible){
        setVisible(visible);
    }
}
