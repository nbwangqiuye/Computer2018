package com.wqy.computer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 科学计算器
 * @author wangqouye
 * 日期2018/6/20
 */
public class ComputerEX extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTextArea textArea;
    StringBuffer sb = new StringBuffer(); // 存储输入的数字
    String vl = null; // 存储事件点击的字符

    public ComputerEX() {
        setTitle("科学型");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 515, 442);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("功能");
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("标准型");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               ComputerBasic ordinary = new ComputerBasic();
                ordinary.setVisible(true);
            }
        });
        menu.add(menuItem);

        JMenuItem menuItem_1 = new JMenuItem("科学型");
        menu.add(menuItem_1);

        JMenuItem menuItem_2 = new JMenuItem("单位换算");
        menu.add(menuItem_2);

        JMenuItem menuItem_3 = new JMenuItem("日期计算");
        menu.add(menuItem_3);

        JMenu menu_1 = new JMenu("关于");
        menuBar.add(menu_1);

        JMenuItem menuItem_4 = new JMenuItem("使用帮助");
        menu_1.add(menuItem_4);

        JMenuItem menuItem_5 = new JMenuItem("关于作者");
        menuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Author calculator_Author = new Author();
                calculator_Author.setVisible(true);
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
        textArea.setBackground(new Color(255, 250, 240));
        textArea.setText("0");
        textArea.setBounds(10, 0, 479, 81);
        contentPane.add(textArea);

        ButtonGroup bg = new ButtonGroup();
        JRadioButton radioButton = new JRadioButton("度", true);
        radioButton.setBounds(6, 87, 67, 40);
        contentPane.add(radioButton);

        JRadioButton radioButton_1 = new JRadioButton("弧度");
        radioButton_1.setBounds(91, 87, 67, 40);
        contentPane.add(radioButton_1);

        JRadioButton radioButton_2 = new JRadioButton("梯度");
        radioButton_2.setBounds(189, 87, 60, 40);
        contentPane.add(radioButton_2);
        bg.add(radioButton);
        bg.add(radioButton_1);
        bg.add(radioButton_2);

        JButton btnNewButton = new JButton("");
        btnNewButton.setBorder(null);
        btnNewButton.setBounds(10, 132, 40, 40);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(this);

        JButton btnLnv = new JButton("lnv");
        btnLnv.setBorder(null);
        btnLnv.setBounds(60, 132, 40, 40);
        contentPane.add(btnLnv);
        btnLnv.addActionListener(this);

        JButton btnLn = new JButton("ln");
        btnLn.setBorder(null);
        btnLn.setBounds(105, 132, 40, 40);
        contentPane.add(btnLn);
        btnLn.addActionListener(this);

        JButton button_1 = new JButton("(");
        button_1.setBorder(null);
        button_1.setBounds(155, 132, 40, 40);
        contentPane.add(button_1);
        button_1.addActionListener(this);

        JButton button_2 = new JButton(")");
        button_2.setBorder(null);
        button_2.setBounds(209, 132, 40, 40);
        contentPane.add(button_2);
        button_2.addActionListener(this);

        JButton btnInt = new JButton("int");
        btnInt.setBorder(null);
        btnInt.setBounds(10, 182, 40, 40);
        contentPane.add(btnInt);
        btnInt.addActionListener(this);

        JButton btnSinh = new JButton("sinh");
        btnSinh.setBorder(null);
        btnSinh.setBounds(60, 182, 40, 40);
        contentPane.add(btnSinh);
        btnSinh.addActionListener(this);

        JButton btnSin = new JButton("sin");
        btnSin.setBorder(null);
        btnSin.setBounds(105, 182, 40, 40);
        contentPane.add(btnSin);
        btnSin.addActionListener(this);

        JButton btnX = new JButton("x²");
        btnX.setBorder(null);
        btnX.setBounds(155, 182, 40, 40);
        contentPane.add(btnX);
        btnX.addActionListener(this);

        JButton btnN = new JButton("n!");
        btnN.setBorder(null);
        btnN.setBounds(209, 182, 40, 40);
        contentPane.add(btnN);

        JButton btnDms = new JButton("dms");
        btnDms.setBorder(null);
        btnDms.setBounds(10, 232, 40, 40);
        contentPane.add(btnDms);
        btnDms.addActionListener(this);

        JButton btnCosh = new JButton("cosh");
        btnCosh.setBorder(null);
        btnCosh.setBounds(60, 232, 40, 40);
        contentPane.add(btnCosh);
        btnCosh.addActionListener(this);

        JButton btnCos = new JButton("cos");
        btnCos.setBorder(null);
        btnCos.setBounds(105, 232, 40, 40);
        contentPane.add(btnCos);
        btnCos.addActionListener(this);

        JButton btnXy = new JButton("x^y");
        btnXy.setBorder(null);
        btnXy.setBounds(155, 232, 40, 40);
        contentPane.add(btnXy);
        btnXy.addActionListener(this);

        JButton btnYx = new JButton("y√x");
        btnYx.setBorder(null);
        btnYx.setBounds(209, 232, 40, 40);
        contentPane.add(btnYx);
        btnYx.addActionListener(this);

        JButton button_13 = new JButton("π");
        button_13.setBorder(null);
        button_13.setBounds(10, 282, 40, 40);
        contentPane.add(button_13);
        button_13.addActionListener(this);

        JButton btnTanh = new JButton("tanh");
        btnTanh.setBorder(null);
        btnTanh.setBounds(60, 282, 40, 40);
        contentPane.add(btnTanh);
        btnTanh.addActionListener(this);

        JButton btnTan = new JButton("tan");
        btnTan.setBorder(null);
        btnTan.setBounds(105, 282, 40, 40);
        contentPane.add(btnTan);
        btnTan.addActionListener(this);

        JButton btnX_1 = new JButton("x^3");
        btnX_1.setBorder(null);
        btnX_1.setBounds(155, 282, 40, 40);
        contentPane.add(btnX_1);
        btnX_1.addActionListener(this);

        JButton btnx = new JButton("3√x");
        btnx.setBorder(null);
        btnx.setBounds(209, 282, 40, 40);
        contentPane.add(btnx);
        btnx.addActionListener(this);

        JButton btnFe = new JButton("F-E");
        btnFe.setBorder(null);
        btnFe.setBounds(10, 332, 40, 40);
        contentPane.add(btnFe);
        btnFe.addActionListener(this);

        JButton btnExp = new JButton("Exp");
        btnExp.setBorder(null);
        btnExp.setBounds(60, 332, 40, 40);
        contentPane.add(btnExp);
        btnExp.addActionListener(this);

        JButton btnMod = new JButton("Mod");
        btnMod.setBorder(null);
        btnMod.setBounds(105, 332, 40, 40);
        contentPane.add(btnMod);
        btnMod.addActionListener(this);

        JButton btnLog = new JButton("log");
        btnLog.setBorder(null);
        btnLog.setBounds(155, 332, 40, 40);
        contentPane.add(btnLog);
        btnLog.addActionListener(this);

        JButton btnx_1 = new JButton("10^x");
        btnx_1.setBorder(null);
        btnx_1.setBounds(209, 332, 40, 40);
        contentPane.add(btnx_1);
        btnx_1.addActionListener(this);

        JButton button_23 = new JButton("←");
        button_23.setBorder(null);
        button_23.setBounds(259, 132, 40, 40);
        contentPane.add(button_23);
        button_23.addActionListener(this);

        JButton btnCe = new JButton("CE");
        btnCe.setBorder(null);
        btnCe.setBounds(309, 132, 40, 40);
        contentPane.add(btnCe);
        btnCe.addActionListener(this);

        JButton btnC = new JButton("C");
        btnC.setBorder(null);
        btnC.setBounds(354, 132, 40, 40);
        contentPane.add(btnC);
        btnC.addActionListener(this);

        JButton button_26 = new JButton("±");
        button_26.setBorder(null);
        button_26.setBounds(404, 132, 40, 40);
        contentPane.add(button_26);
        button_26.addActionListener(this);

        JButton button_27 = new JButton("√");
        button_27.setBorder(null);
        button_27.setBounds(458, 132, 40, 40);
        contentPane.add(button_27);
        button_27.addActionListener(this);

        JButton btnMc = new JButton("MC");
        btnMc.setBorder(null);
        btnMc.setBounds(259, 87, 40, 40);
        contentPane.add(btnMc);
        btnMc.addActionListener(this);

        JButton btnMr = new JButton("MR");
        btnMr.setBorder(null);
        btnMr.setBounds(309, 87, 40, 40);
        contentPane.add(btnMr);
        btnMr.addActionListener(this);

        JButton btnMs = new JButton("MS");
        btnMs.setBorder(null);
        btnMs.setBounds(354, 87, 40, 40);
        contentPane.add(btnMs);
        btnMs.addActionListener(this);

        JButton btnM = new JButton("M+");
        btnM.setBorder(null);
        btnM.setBounds(404, 87, 40, 40);
        contentPane.add(btnM);
        btnM.addActionListener(this);

        JButton btnM_1 = new JButton("M-");
        btnM_1.setBorder(null);
        btnM_1.setBounds(458, 87, 40, 40);
        contentPane.add(btnM_1);
        btnM_1.addActionListener(this);

        JButton button_33 = new JButton("7");
        button_33.setBorder(null);
        button_33.setBounds(259, 182, 40, 40);
        contentPane.add(button_33);
        button_33.addActionListener(this);

        JButton button_34 = new JButton("8");
        button_34.setBorder(null);
        button_34.setBounds(309, 182, 40, 40);
        contentPane.add(button_34);
        button_34.addActionListener(this);

        JButton button_35 = new JButton("9");
        button_35.setBorder(null);
        button_35.setBounds(354, 182, 40, 40);
        contentPane.add(button_35);

        JButton button_36 = new JButton("/");
        button_36.setBorder(null);
        button_36.setBounds(404, 182, 40, 40);
        contentPane.add(button_36);
        button_36.addActionListener(this);

        JButton button_37 = new JButton("%");
        button_37.setBorder(null);
        button_37.setBounds(458, 182, 40, 40);
        contentPane.add(button_37);
        button_37.addActionListener(this);

        JButton button_38 = new JButton("4");
        button_38.setBorder(null);
        button_38.setBounds(259, 232, 40, 40);
        contentPane.add(button_38);
        button_38.addActionListener(this);

        JButton button_39 = new JButton("5");
        button_39.setBorder(null);
        button_39.setBounds(309, 232, 40, 40);
        contentPane.add(button_39);
        button_39.addActionListener(this);

        JButton button_40 = new JButton("6");
        button_40.setBorder(null);
        button_40.setBounds(354, 232, 40, 40);
        contentPane.add(button_40);
        button_40.addActionListener(this);

        JButton button_41 = new JButton("*");
        button_41.setBorder(null);
        button_41.setBounds(404, 232, 40, 40);
        contentPane.add(button_41);
        button_41.addActionListener(this);

        JButton button_42 = new JButton("1/x");
        button_42.setBorder(null);
        button_42.setBounds(458, 232, 40, 40);
        contentPane.add(button_42);
        button_42.addActionListener(this);

        JButton button_43 = new JButton("1");
        button_43.setBorder(null);
        button_43.setBounds(259, 282, 40, 40);
        contentPane.add(button_43);
        button_43.addActionListener(this);

        JButton button_44 = new JButton("2");
        button_44.setBorder(null);
        button_44.setBounds(309, 282, 40, 40);
        contentPane.add(button_44);
        button_44.addActionListener(this);

        JButton button_45 = new JButton("3");
        button_45.setBorder(null);
        button_45.setBounds(354, 282, 40, 40);
        contentPane.add(button_45);
        button_45.addActionListener(this);

        JButton button_46 = new JButton("-");
        button_46.setBorder(null);
        button_46.setBounds(404, 282, 40, 40);
        contentPane.add(button_46);
        button_46.addActionListener(this);

        JButton button_50 = new JButton(".");
        button_50.setBorder(null);
        button_50.setBounds(354, 332, 40, 40);
        contentPane.add(button_50);
        button_50.addActionListener(this);

        JButton button_51 = new JButton("+");
        button_51.setBorder(null);
        button_51.setBounds(404, 332, 40, 40);
        contentPane.add(button_51);
        button_51.addActionListener(this);

        JButton btnNewButton_1 = new JButton("=");
        btnNewButton_1.setBorder(null);
        btnNewButton_1.setBounds(458, 282, 40, 90);
        contentPane.add(btnNewButton_1);
        btnNewButton_1.addActionListener(this);

        JButton btnNewButton_2 = new JButton("0");
        btnNewButton_2.setBounds(259, 332, 90, 40);
        contentPane.add(btnNewButton_2);
        btnNewButton_2.addActionListener(this);

    }

    //添加事件点击
    public void actionPerformed(ActionEvent e) {
        vl = e.getActionCommand();

        try {
            if(vl.equals(".") || Integer.parseInt(vl) % 2 == 1 || Integer.parseInt(vl) % 2 == 0) {
                sb.append(vl);
            }
        } catch (Exception c) {
            if(vl.equals("+") || vl.equals("-") || vl.equals("*") || vl.equals("/") || vl.equals("√") || vl.equals("%") || vl.equals("int") || vl.equals("sinh") || vl.equals("sin") || vl.equals("x²") || vl.equals("cosh") || vl.equals("cos") || vl.equals("x^y") || vl.equals("y√x") || vl.equals("tanh")  || vl.equals("tan") || vl.equals("x^3") || vl.equals("3√x") || vl.equals("Mod") || vl.equals("10^x") || vl.equals("1/x")) {
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

            if(n[i].equals("int")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.ceil(after);
            }

            if(n[i].equals("sinh")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.sinh(after);
            }

            if(n[i].equals("sinh")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.sin(after);
            }

            if(n[i].equals("x²")) {
                double Front = Double.parseDouble(n[i - 1]);
                ans = Front*Front;
            }

            if(n[i].equals("n!")) {
                double Front = Double.parseDouble(n[i - 1]);
                for(int aa = 1; aa<Front; aa++) {
                    ans *=aa;
                }
            }

            if(n[i].equals("cosh")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.cosh(after);
            }

            if(n[i].equals("cos")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.cos(after);
            }

            if(n[i].equals("x^y")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = Math.pow(Front, after);
            }

            if(n[i].equals("y√x")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = Math.pow(Front, 1d/after);
            }

            if(n[i].equals("tanh")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.tanh(after);
            }

            if(n[i].equals("tan")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.tan(after);
            }

            if(n[i].equals("x^3")) {
                double Front = Double.parseDouble(n[i - 1]);
                ans = Front*Front*Front;
            }

            if(n[i].equals("3√x")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.pow(after, 1d/3);
            }

            if(n[i].equals("Mod")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = (Front%after);
            }

            if(n[i].equals("Log")) {
                double after = Double.parseDouble(n[i + 1]);
                double Front = Double.parseDouble(n[i - 1]);
                ans = Math.log10(after);
            }

            if(n[i].equals("10^x")) {
                double after = Double.parseDouble(n[i + 1]);
                ans = Math.pow(10, after);
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
            public void run() {
                try {
                    ComputerEX frame = new ComputerEX();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
