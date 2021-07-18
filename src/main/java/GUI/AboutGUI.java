package GUI;

import javax.swing.*;
        import java.awt.*;

public class AboutGUI extends BusGUI{

    public static BusGUI about(){
        BusGUI window = new BusGUI(340, 480, "정보", null , 270, 220);
        window.setLayout(new GridLayout(3,1,3,3));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2,1,2,2));
        JLabel version1 = new JLabel("버전");
        version1.setHorizontalAlignment(JLabel.CENTER);
        version1.setFont(Resources.nsq(Resources.FONT_BOLD, 30));

        JLabel version2 = new JLabel("1.0.0");
        version2.setHorizontalAlignment(JLabel.CENTER);
        version2.setFont(Resources.nsq(Resources.FONT_NORMAL, 20));

        panel1.add(version1);
        panel1.add(version2);
        window.add(panel1);




        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,2,2,2));
        JLabel developer1 = new JLabel("개발자");
        developer1.setHorizontalAlignment(JLabel.CENTER);
        developer1.setFont(Resources.nsq(Resources.FONT_BOLD, 30));

        JLabel developer2 = new JLabel("정재준 김태준 김유선 강세이 김민선");
        developer2.setHorizontalAlignment(JLabel.CENTER);
        developer2.setFont(Resources.nsq(Resources.FONT_NORMAL, 20));

        panel2.add(developer1);
        panel2.add(developer2);
        window.add(panel2);




        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2,2,2,2));
        JLabel credit1 = new JLabel("크레딧");
        credit1.setHorizontalAlignment(JLabel.CENTER);
        credit1.setFont(Resources.nsq(Resources.FONT_BOLD, 30));

        JLabel credit2 = new JLabel("무료");
        credit2.setHorizontalAlignment(JLabel.CENTER);
        credit2.setFont(Resources.nsq(Resources.FONT_NORMAL, 20));

        panel3.add(credit1);
        panel3.add(credit2);
        window.add(panel3);



        return window;
    }
}