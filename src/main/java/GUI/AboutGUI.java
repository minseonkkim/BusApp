package GUI;

import javax.swing.*;
import java.awt.*;

public class AboutGUI extends BusGUI{

    public static BusGUI about(){
        BusGUI window = new BusGUI(340, 520, "정보", Resources.IMG_INFO , 270, 220);
        window.setLayout(null);
        //window.setLayout(new GridLayout(3,0,2,2));
        window.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,340,160);
        panel1.setLayout(null);

        JLabel version1 = new JLabel("버전");
        version1.setBounds(70,20,300,60);
        version1.setFont(Resources.nsq(Resources.FONT_BOLD, 30));

        JLabel version2 = new JLabel("1.0.0");
        version2.setBounds(70,70,300,60);
        version2.setFont(Resources.nsq(Resources.FONT_NORMAL, 30));

        JLabel img1 = new JLabel(Resources.getBtImage(Resources.IMG_VERSION, 100,100));
        img1.setBounds(180, 20,100,100);

        panel1.add(img1);
        panel1.add(version1);
        panel1.add(version2);
        window.add(panel1);




        JPanel panel2 = new JPanel();
        panel2.setBounds(0,162,340,160);
        panel2.setLayout(null);

        JLabel developer1 = new JLabel("개발자");
        developer1.setBounds(190,20,300,60);
        developer1.setFont(Resources.nsq(Resources.FONT_BOLD, 30));

        JLabel developer2 = new JLabel("정재준 김태준 김유선");
        developer2.setBounds(160,60,300,60);
        developer2.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel developer3 = new JLabel("강세이 김민선");
        developer3.setBounds(190,80,300,60);
        developer3.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img2 = new JLabel(Resources.getBtImage(Resources.IMG_DEVELOPER, 102,94));
        img2.setBounds(40, 25,100,100);

        panel2.add(img2);
        panel2.add(developer1);
        panel2.add(developer2);
        panel2.add(developer3);
        window.add(panel2);




        JPanel panel3 = new JPanel();
       //panel3.setLayout(new GridLayout(2,1,2,2));
        panel3.setBounds(0,324,340,160);
        panel3.setLayout(null);

        JLabel credit1 = new JLabel("크레딧");
        credit1.setBounds(70,20,300,60);
        //credit1.setHorizontalAlignment(JLabel.CENTER);
        credit1.setFont(Resources.nsq(Resources.FONT_BOLD, 30));

        JLabel credit2 = new JLabel("무료");
        credit2.setBounds(70,70,300,60);
        //credit2.setHorizontalAlignment(JLabel.CENTER);
        credit2.setFont(Resources.nsq(Resources.FONT_NORMAL, 25));

        JLabel img3 = new JLabel(Resources.getBtImage(Resources.IMG_CREDIT, 90, 90));
        img3.setBounds(180, 25,100,100);

        panel3.add(img3);
        panel3.add(credit1);
        panel3.add(credit2);
        window.add(panel3);

        return window;
    }
}