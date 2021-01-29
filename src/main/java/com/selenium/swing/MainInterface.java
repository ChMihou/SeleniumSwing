package com.selenium.swing;

import com.selenium.pojo.Offer;
import com.selenium.untils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainInterface extends JFrame implements ActionListener {

    //生产环境
    public final static String FILEPATH = "C:\\Users\\Administrator\\Desktop\\TestUtils\\user.xls";
    public final static String PATH = "C:\\Users\\Administrator\\Desktop\\TestUtils\\User-Agent.txt";
    //测试环境
//    public final static String FILEPATH = "D:\\user.xls";
//    public final static String PATH = "D:\\User-Agent.txt";
    JPanel jp1, jp2, jp3, jp4, jp5;     //面板
    JLabel labelTitle;      //标题
    JLabel labelOfferId, labelURL, labelBlock;       //提示
    JTextField textOfferId;                  //输入OfferId
    JTextField textOfferUrl;                            //输入OfferUrl
    JTextArea textBlock;
    JButton buttonEnter, buttonReset;                        //测试按扭，重置按钮

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
        textOfferUrl = new JTextField(50);
        //设置白板显示信息
        textBlock = new JTextArea(6, 50);
        //设置自动换行输出信息
        textBlock.setLineWrap(true);
        //设置按钮
        buttonEnter = new JButton(" 测试开始  ");
        //重置按钮
        buttonReset = new JButton("     重置    ");
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
    public void actionPerformed(ActionEvent e) {

        //如果点击了登录按钮
        if (e.getSource() == buttonEnter) {
            try {
                testOffer();        //调用方法判断账户密码
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (e.getSource() == buttonReset) {
            clear();
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
            try {
                int i = 1;
                List<Offer> offerList = new ArrayList<>();
                String last_allocation_id;
                List<String> Ips = new ArrayList<>();
                Offer param = new Offer();
                param.setTypeOffer(Integer.valueOf(textOfferId.getText()));
                param.setUrl(textOfferUrl.getText());
                Random random = new Random();
                List<Offer> offers = ExcelImport.importExcelAction(FILEPATH);
                java.util.List<String> uas = ReadTxt.readTxt(PATH);
                last_allocation_id = ChangeAwsIp.bindIp2Instance();
                ChangeAwsIp.describeAddresses(Ips, last_allocation_id);
                Ips.add(getIp.getV4IP());
                for (Offer offer : offers) {
                    int uaNumber = Math.abs(random.nextInt(uas.size()));
                    System.out.println("Fake browser access:" + uas.get(uaNumber));
                    System.out.println("Fake identity login" + offer.toString());
                    Selenium.selenium(offer, uas.get(uaNumber), param, offerList);
                    textBlock.append("IP:" + Ips.get(Ips.size() - 1));
                    textBlock.append("     OfferId:" + param.getId());
                    textBlock.append("     CardNumber:" + offer.getCardNumber());
                    textBlock.append("     循环已经" + i++ + "次");
                    if (last_allocation_id != null && !last_allocation_id.equals("")) {
                        ChangeAwsIp.freedIp(last_allocation_id);
                        textBlock.append("     释放IP:" + Ips.get(Ips.size() - 1));
                    }
                    textBlock.repaint();
                    last_allocation_id = ChangeAwsIp.bindIp2Instance();
                    ChangeAwsIp.describeAddresses(Ips, last_allocation_id);
                }
                ExcelImport.exportExcel(offerList, param.getTypeOffer());
            } catch (Exception e) {
                e.printStackTrace();
                textBlock.append(e.getMessage());
                textBlock.repaint();
            }
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