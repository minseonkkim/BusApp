package GUI;

import javax.swing.*;
import java.awt.*;

public class AboutGUI extends BusGUI{

    public static BusGUI about(){
        BusGUI window = new BusGUI(460, 360, "정보", Resources.IMG_INFO , 270, 220);
        window.setLayout(null);
        //window.setLayout(new GridLayout(3,0,2,2));
        window.setLocationRelativeTo(null);


        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,460,160);
        panel1.setLayout(null);

        JLabel license1 = new JLabel("광주광역시 BIS 노선 정보, 정류소 정보");
        license1.setBounds(20,5,460,60);
        license1.setFont(Resources.nsq(Resources.FONT_BOLD, 25));

        JLabel license2 = new JLabel("<html>본 저작물은 광주광역시에서 2018년 <br>작성하여 공공누리 제1유형으로 개방한 <br>광주광역시 BIS 노선 정보,\n" +
                "광주광역시 <br>BIS 정류소 정보를 이용하였습니다.</html>");
        license2.setBounds(205,55,460,80);
        license2.setFont(Resources.nsq(Resources.FONT_NORMAL, 13));

        JLabel img1 = new JLabel(Resources.getBtImage(Resources.IMG_LICENSE, 174, 67));
        img1.setBounds(20, 65,174,67);

        panel1.add(img1);
        panel1.add(license1);
        panel1.add(license2);
        window.add(panel1);




        JPanel panel2 = new JPanel();
        panel2.setBounds(0,162,180,160);
        panel2.setLayout(null);

        JLabel version1 = new JLabel("버전 정보");
        version1.setBounds(20,10,460,60);
        version1.setFont(Resources.nsq(Resources.FONT_BOLD, 25));

        JLabel version2 = new JLabel("<html>현재 버전  v1.0.0<br>최신 버전  v1.0.0</html>");
        version2.setBounds(20,55,460,70);
        version2.setFont(Resources.nsq(Resources.FONT_NORMAL, 13));

        JLabel img2 = new JLabel(Resources.getBtImage(Resources.IMG_VERSION, 70,70));
        img2.setBounds(95, 35,100,100);

        panel2.add(img2);
        panel2.add(version1);
        panel2.add(version2);
        window.add(panel2);




        JPanel panel3 = new JPanel();
        panel3.setBounds(182,162,460,160);
        panel3.setLayout(null);

        JLabel developer1 = new JLabel("만든 사람들");
        developer1.setBounds(20,10,300,60);
        developer1.setFont(Resources.nsq(Resources.FONT_BOLD, 25));

        JLabel developer2 = new JLabel("<html>정재준 김유선 강세이<br>김태준 김민선</html>");
        developer2.setBounds(20,60,300,60);
        developer2.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img3 = new JLabel(Resources.getBtImage(Resources.IMG_DEVELOPER, 89,82));
        img3.setBounds(150, 35,102,94);

        panel3.add(img3);
        panel3.add(developer1);
        panel3.add(developer2);
        window.add(panel3);




//        JPanel panel3 = new JPanel();
//        panel3.setBounds(0,324,460,160);
//        panel3.setLayout(null);
//
//        JLabel license1 = new JLabel("광주광역시 BIS 노선 정보, 정류소 정보");
//        license1.setBounds(20,5,460,60);
//        license1.setFont(Resources.nsq(Resources.FONT_BOLD, 25));
//
//        JLabel license2 = new JLabel("<html>본 저작물은 광주광역시에서 2018년 <br>작성하여 공공누리 제1유형으로 개방한 <br>광주광역시 BIS 노선 정보,\n" +
//                "광주광역시 <br>BIS 정류소 정보를 이용하였습니다.</html>");
//        license2.setBounds(205,55,460,80);
//        license2.setFont(Resources.nsq(Resources.FONT_NORMAL, 13));
//
//        JLabel img3 = new JLabel(Resources.getBtImage(Resources.IMG_LICENSE, 174, 67));
//        img3.setBounds(20, 65,174,67);
//
//        panel3.add(img3);
//        panel3.add(license1);
//        panel3.add(license2);
//        window.add(panel3);


//        JPanel panel3 = new JPanel();
//       //panel3.setLayout(new GridLayout(2,1,2,2));
//        panel3.setBounds(0,324,340,160);
//        panel3.setLayout(null);
//
//        JLabel credit1 = new JLabel("크레딧");
//        credit1.setBounds(70,20,300,60);
//        //credit1.setHorizontalAlignment(JLabel.CENTER);
//        credit1.setFont(Resources.nsq(Resources.FONT_BOLD, 30));
//
//        JLabel credit2 = new JLabel("무료");
//        credit2.setBounds(70,70,300,60);
//        //credit2.setHorizontalAlignment(JLabel.CENTER);
//        credit2.setFont(Resources.nsq(Resources.FONT_NORMAL, 25));
//
//        JLabel img3 = new JLabel(Resources.getBtImage(Resources.IMG_CREDIT, 90, 90));
//        img3.setBounds(180, 25,100,100);
//
//        panel3.add(img3);
//        panel3.add(credit1);
//        panel3.add(credit2);
//        window.add(panel3);

        return window;
    }
}