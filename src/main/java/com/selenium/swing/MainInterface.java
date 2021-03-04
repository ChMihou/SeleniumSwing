package com.selenium.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainInterface extends JFrame implements ActionListener {

    JPanel jp1, jp2, jp3, jp4, jp5;     //面板
    JLabel labelTitle;      //标题
    JLabel labelOfferId, labelURL, labelBlock;       //提示
    JTextField textOfferId;                  //输入OfferId
    JTextField textOfferUrl;                            //输入OfferUrl
    JTextArea textBlock;
    JButton buttonEnter, buttonReset, buttonFlush;                        //测试按扭，重置按钮


    //构造
    public MainInterface() {
        init();

        this.setResizable(false);                       //设置窗口大小不可调节
        this.setTitle("Offer测试");                       //设置窗口标题
        this.setLocationRelativeTo(null);               //在屏幕中间显示(居中显示)
        this.setBounds(500, 200, 600, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //设置关闭窗口同时关闭JVM
        this.setVisible(true);                          //设置为窗口可见
    }

    private ExecutorService service = Executors.newCachedThreadPool(new ThreadFactory() {

        @Override
        public Thread newThread(Runnable test) {
            return new Thread(test, "output");
        }
    });

    //设置窗口组件
    void init() {

        //设置字体
        Font fontTitle = new Font("宋体", Font.BOLD, 25);     //标题字体
        Font fontLabel = new Font("黑体", Font.BOLD, 15); //提示语字体

        //设置面板
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        //设置标题
        labelTitle = new JLabel("Offer自动化测试");
        labelTitle.setFont(fontTitle);

        //设置Label
        labelOfferId = new JLabel("OfferId:                                                     ");
        labelOfferId.setFont(fontLabel);
        labelURL = new JLabel("OfferUrl：                                                   ");
        labelURL.setFont(fontLabel);
        labelBlock = new JLabel("目前测试的信息:                                              ");
        labelBlock.setFont(fontLabel);


        //设置JTextField
        textOfferId = new JTextField(50);
        textOfferUrl = new JTextField("https://m.bolomobi.com/c/n/145013/321?cid={CLICK_ID}&sc={SOURCE}", 50);
        //设置白板显示信息
        textBlock = new JTextArea(6, 50);
        //设置自动换行输出信息
        textBlock.setLineWrap(true);
        //设置按钮
        buttonEnter = new JButton(" 测试开始  ");
        //重置按钮
        buttonReset = new JButton("     重置    ");
        //刷新按钮
        buttonFlush = new JButton(" 刷新信息  ");
        //设置布局
        this.setLayout(new GridLayout(6, 1));   //网格式布局

        //添加各个组件
        jp1.add(labelTitle);

        jp2.add(labelOfferId);

        jp2.add(textOfferId);

        jp3.add(labelURL);

        jp3.add(textOfferUrl);

        jp4.add(labelBlock);

        jp4.add(textBlock);

        jp4.add(new JScrollPane(textBlock));

        jp5.add(buttonEnter);

        jp5.add(buttonReset);

        jp5.add(buttonFlush);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(new JPanel());
        this.add(jp5);

        textOfferId.addActionListener(this);
        textOfferUrl.addActionListener(this);
        buttonEnter.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonFlush.addActionListener(this);
    }

    //设置窗口背景
    void setBackground() {
        ImageIcon background = new ImageIcon("bb.jpg");   //根目录下文件名
        JLabel label = new JLabel(background);
        label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());

        //将窗格转化为JPanel,否则不能调用setOpaque
        JPanel imagePanel = new JPanel();
        imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);   //设置窗口透明
        imagePanel.setLayout(new FlowLayout());

        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));

    }


    //监视器
    @Override
    public void actionPerformed(ActionEvent e) {

        //如果点击了测试按钮
        if (e.getSource() == buttonEnter) {
            try {
                //开启新的线程 避免影响gui界面卡顿
                service.submit(new Runnable() {
                    @Override
                    public void run() {
                        testOffer();        //调用方法判断账户密码
                    }
                });
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (e.getSource() == buttonReset) {
            clear();
        }
        if (e.getSource() == buttonFlush) {
            textBlock.paintImmediately(textBlock.getBounds());
        }

    }

    public void testOffer() {
        //如果账户密码正确
        if (textOfferId.getText().isEmpty() && textOfferUrl.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "请输入OfferId和OfferUrl", "提示",
                    JOptionPane.WARNING_MESSAGE);
        } else if (textOfferId.getText().isEmpty())      //当同户名为空
        {
            JOptionPane.showMessageDialog(null, "请输入OfferId", "提示",
                    JOptionPane.WARNING_MESSAGE);
        } else if (textOfferUrl.getText().isEmpty())       //当密码为空
        {
            JOptionPane.showMessageDialog(null, "请输入OfferUrl", "提示",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!isNumeric(textOfferId.getText())) {
            JOptionPane.showMessageDialog(null, "请输入正确的OfferId", "提示",
                    JOptionPane.WARNING_MESSAGE);
            clear();
        } else {
            testReady.testStart(textOfferId, textOfferUrl, textBlock);
        }
    }

    //清除文本框
    public void clear() {
        textOfferId.setText("");
        textOfferUrl.setText("");
        textBlock.setText("");
        textBlock.setText("");
    }

    public static boolean isNumeric(String str) {
        // 该正则表达式可以匹配所有的数字 包括负数
        Pattern pattern = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;//异常 说明包含非数字。
        }

        Matcher isNum = pattern.matcher(bigStr); // matcher是全匹配
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
}