package com.selenium.swing;

import com.selenium.pojo.Offer;
import com.selenium.untils.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class testReady {

    //生产环境
    public final static String FILEPATH = "C:\\Users\\Administrator\\Desktop\\TestUtils\\user.xls";
    public final static String PATH = "C:\\Users\\Administrator\\Desktop\\TestUtils\\User-Agent.txt";

    //测试环境
//    public final static String FILEPATH = "D:\\user.xls";
//    public final static String PATH = "D:\\User-Agent.txt";

    public static void testStart(JTextField textOfferId,
                                 JTextField textOfferUrl,
                                 JTextArea textBlock) {
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
                System.out.println();
                System.out.println("Fake browser access:" + uas.get(uaNumber));
                System.out.println("Fake identity login" + offer.toString());
                textBlock.append("      IP:" + Ips.get(Ips.size() - 1));
                textBlock.append("      OfferId:" + param.getTypeOffer());
                textBlock.append("      CardNumber:" + offer.getCardNumber());
                textBlock.append("      循环已经" + i++ + "次");
                //强行将信息输入text框内
                textBlock.paintImmediately(textBlock.getBounds());
                Selenium.selenium(offer, uas.get(uaNumber), param, offerList);
                if (last_allocation_id != null && !last_allocation_id.equals("")) {
                    ChangeAwsIp.freedIp(last_allocation_id);
                    textBlock.append("      释放IP:" + Ips.get(Ips.size() - 1));
                    //强行将信息输入text框内
                    textBlock.paintImmediately(textBlock.getBounds());
                }
                last_allocation_id = ChangeAwsIp.bindIp2Instance();
                ChangeAwsIp.describeAddresses(Ips, last_allocation_id);
            }
            ReadTxt.writeFileContext(Collections.singletonList(offerList.toString()), param.getTypeOffer());
        } catch (Exception e) {
            e.printStackTrace();
            textBlock.append(e.getMessage());
            textBlock.paintImmediately(textBlock.getBounds());
        }
    }
}
