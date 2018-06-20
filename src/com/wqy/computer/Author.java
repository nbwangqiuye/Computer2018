package com.wqy.computer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * 作者
 * @author wangqouye
 * 日期2018/6/20
 */
public class Author extends JFrame {

    public Author(){
        this.setTitle("作者");//设置标题
        this.setBounds(400, 100, 297, 422);//设置显示位置 及宽度 高度
        //创建内容面板
        JPanel contentPanel = new JPanel();
        this.add(contentPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));//设置面板边界 距离边界5个像素
//        contentPanel.setLayout(null);

        //添加内容
        JLabel name = new JLabel("开发人：王秋叶");
        name.setFont(new Font("华文彩云",Font.BOLD,10));
        name.setBounds(27, 223, 430, 52);
        contentPanel.add(name);
        JLabel date = new JLabel("2018年06月20号");
        date.setBounds(27,400,430,52);
        contentPanel.add(date);

    }

}
