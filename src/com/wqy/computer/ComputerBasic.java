package com.wqy.computer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 普通计算器
 * @author wangqouye
 * 日期2018/6/20
 */
public class ComputerBasic extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTextArea textArea;
    StringBuffer sb = new StringBuffer(); 	// 存储输入的数字
    String vl = null; 	// 存储事件点击的字符

    //标准型计算器
    public ComputerBasic() {
        setTitle("标准型");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 297, 422);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("功能");
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("标准型");
        menu.add(menuItem);

        JMenuItem menuItem_1 = new JMenuItem("科学型");
        menuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ComputerEX computerEX = new ComputerEX();
                computerEX.setVisible(true);
            }
        });
        menu.add(menuItem_1);

        JMenuItem menuItem_2 = new JMenuItem("日期计算");
        menu.add(menuItem_2);

        JMenuItem menuItem_3 = new JMenuItem("单位换算");
        menu.add(menuItem_3);

        JMenu menu_1 = new JMenu("关于");
        menuBar.add(menu_1);

        JMenuItem menuItem_4 = new JMenuItem("使用帮助");
        menu_1.add(menuItem_4);

        JMenuItem menuItem_5 = new JMenuItem("关于作者");
        menuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Author author = new Author();
                author.setVisible(true);
            }
        });
        menu_1.add(menuItem_5);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        textArea.setText("0");
        textArea.setBackground(new Color(255, 250, 240));
        textArea.setBounds(10, 10, 261, 73);
        contentPane.add(textArea);

        JButton btnNewButton = new JButton("MC");
        btnNewButton.setBorder(null);
        btnNewButton.setBounds(10, 93, 45, 35);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(this);

        JButton btnMr = new JButton("MR");
        btnMr.setBorder(null);
        btnMr.setBounds(63, 93, 45, 35);
        contentPane.add(btnMr);
        btnMr.addActionListener(this);

        JButton btnMs = new JButton("MS");
        btnMs.setBorder(null);
        btnMs.setBounds(118, 93, 45, 35);
        contentPane.add(btnMs);
        btnMs.addActionListener(this);

        JButton btnM = new JButton("M+");
        btnM.setBorder(null);
        btnM.setBounds(173, 93, 45, 35);
        contentPane.add(btnM);
        btnM.addActionListener(this);

        JButton btnM_1 = new JButton("M-");
        btnM_1.setBorder(null);
        btnM_1.setBounds(228, 93, 45, 35);
        contentPane.add(btnM_1);
        btnM_1.addActionListener(this);

        JButton button_4 = new JButton("←");
        button_4.setBorder(null);
        button_4.setBounds(10, 138, 45, 35);
        contentPane.add(button_4);
        button_4.addActionListener(this);

        JButton btnCe = new JButton("CE");
        btnCe.setBorder(null);
        btnCe.setBounds(63, 138, 45, 35);
        contentPane.add(btnCe);
        btnCe.addActionListener(this);

        JButton btnC = new JButton("C");
        btnC.setBounds(118, 138, 45, 35);
        contentPane.add(btnC);
        btnC.addActionListener(this);

        JButton button_7 = new JButton("±");
        button_7.setBounds(173, 138, 45, 35);
        contentPane.add(button_7);
        button_7.addActionListener(this);

        JButton button_8 = new JButton("√");
        button_8.setBorder(null);
        button_8.setBounds(228, 138, 45, 35);
        contentPane.add(button_8);
        button_8.addActionListener(this);

        JButton button_9 = new JButton("7");
        button_9.setBounds(10, 183, 45, 35);
        contentPane.add(button_9);
        button_9.addActionListener(this);

        JButton button_10 = new JButton("8");
        button_10.setBounds(63, 183, 45, 35);
        contentPane.add(button_10);
        button_10.addActionListener(this);

        JButton button_11 = new JButton("9");
        button_11.setBounds(118, 183, 45, 35);
        contentPane.add(button_11);
        button_11.addActionListener(this);

        JButton button_12 = new JButton("/");
        button_12.setBounds(173, 183, 45, 35);
        contentPane.add(button_12);
        button_12.addActionListener(this);

        JButton button_13 = new JButton("%");
        button_13.setBounds(228, 183, 45, 35);
        contentPane.add(button_13);
        button_13.addActionListener(this);

        JButton button_14 = new JButton("4");
        button_14.setBounds(10, 228, 45, 35);
        contentPane.add(button_14);
        button_14.addActionListener(this);

        JButton button_15 = new JButton("5");
        button_15.setBounds(63, 228, 45, 35);
        contentPane.add(button_15);
        button_15.addActionListener(this);

        JButton button_16 = new JButton("6");
        button_16.setBounds(118, 228, 45, 35);
        contentPane.add(button_16);
        button_16.addActionListener(this);

        JButton button_17 = new JButton("*");
        button_17.setBounds(173, 228, 45, 35);
        contentPane.add(button_17);
        button_17.addActionListener(this);

        JButton btnx = new JButton("1/x");
        btnx.setBorder(null);
        btnx.setBounds(228, 228, 45, 35);
        contentPane.add(btnx);
        btnx.addActionListener(this);

        JButton button_19 = new JButton("1");
        button_19.setBounds(10, 273, 45, 35);
        contentPane.add(button_19);
        button_19.addActionListener(this);

        JButton button_20 = new JButton("2");
        button_20.setBounds(63, 273, 45, 35);
        contentPane.add(button_20);
        button_20.addActionListener(this);

        JButton button_21 = new JButton("3");
        button_21.setBounds(118, 273, 45, 35);
        contentPane.add(button_21);
        button_21.addActionListener(this);

        JButton button_22 = new JButton("-");
        button_22.setBounds(173, 273, 45, 35);
        contentPane.add(button_22);
        button_22.addActionListener(this);

        JButton button_23 = new JButton(".");
        button_23.setBounds(118, 318, 45, 35);
        contentPane.add(button_23);
        button_23.addActionListener(this);

        JButton button_24 = new JButton("+");
        button_24.setBounds(173, 318, 45, 35);
        contentPane.add(button_24);
        button_24.addActionListener(this);

        JButton btnNewButton_1 = new JButton("0");
        btnNewButton_1.setBounds(10, 318, 98, 35);
        contentPane.add(btnNewButton_1);
        btnNewButton_1.addActionListener(this);

        JButton btnNewButton_2 = new JButton("=");
        btnNewButton_2.setBounds(228, 273, 45, 80);
        contentPane.add(btnNewButton_2);
        btnNewButton_2.addActionListener(this);

    }

    //运算的方法
    private String Algorithm(StringBuffer str) {
        String a = str.toString();
        String n[];
        n = a.split(" ");
        double ans = 0d;

        for(int i = 1; i < n.length; i++) {
            if(n[i].equals("+")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = after+Front;
            }

            if(n[i].equals("-")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = Front-after;
            }

            if(n[i].equals("*")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = after*Front;
            }

            if(n[i].equals("/")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = after/Front;
            }

            if(n[i].equals("√")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.sqrt(after);
            }

            if(n[i].equals("%")) {
                double Front = Double.parseDouble(n[i - 1]);
                ans = Front/100;
            }

            if(n[i].equals("1/x")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = 1/after;
            }

        }

        String result = String.valueOf(ans);
        return result;

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ComputerBasic computerBasic = new ComputerBasic();
                computerBasic.setVisible(true);
                computerBasic.setResizable(false);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vl = e.getActionCommand();

        try {
            if(vl.equals(".") || Integer.parseInt(vl) % 2 == 1 || Integer.parseInt(vl) % 2 == 0) {
                sb.append(vl);
            }
        } catch (Exception c) {
            if(vl.equals("+") || vl.equals("-") || vl.equals("*") || vl.equals("/") || vl.equals("√") || vl.equals("%") || vl.equals("1/x")) {
                sb.append(" "+vl+" ");
            }else if(vl.equals("=")) {
                sb.append(" "+"="+" "+ Algorithm(sb));
            }else if(vl.equals("C")) {
                sb.delete(0, sb.length());
            }else if(vl.equals("←")) {
                sb.delete(sb.length()-1, sb.length());
            }
        }

        textArea.setText(sb.toString());
    }
}
