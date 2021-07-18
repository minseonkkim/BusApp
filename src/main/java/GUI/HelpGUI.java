package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class HelpGUI extends BusGUI {
    public HelpGUI(int width, int height, String title, String ico) {
        super(width, height, title, ico);
    }

    public static BusGUI help() {
        BusGUI window = new BusGUI(500, 320, "도움말", Resources.IMG_HELP, 270, 220);
        window.setBackground(Color.white);
        window.setLayout(null);

        String[] btn ={"정류장 검색은 어떻게 하나요?", "버스별 정류장은 어떻게 확인하나요?",
                "즐겨찾기란 무엇인가요?", "해당 버전은 어디서 확인하나요?"};
        JButton[] AskBt = new JButton[4];
        for(int i=0;i<4;i++){
            AskBt[i]=new JButton(btn[i]);
            AskBt[i].setMargin(new Insets(0, 0, 0, 0));
            AskBt[i].setFont(Resources.nsq(Resources.FONT_BOLD, 20));
            AskBt[i].setBackground(Color.white);
            AskBt[i].setForeground(Color.black);
            window.add(AskBt[i]);
//            for (int j = 0; j < 4; j++) window.add(emptyLabel(80, 130));
        }

        AskBt[0].setBounds(0, 35, 500, 30);
        AskBt[0].addActionListener(e -> HelpGUI.ask1().start());

        AskBt[1].setBounds(0, 80, 500, 30);
        AskBt[1].addActionListener(e -> HelpGUI.ask2().start());

        AskBt[2].setBounds(0, 125, 500, 30);
        AskBt[2].addActionListener(e -> HelpGUI.ask3().start());

        AskBt[3].setBounds(0, 170, 500, 30);
        AskBt[3].addActionListener(e -> HelpGUI.ask4().start());

        return window;
    }

    private static BusGUI ask1() {

        BusGUI window2 = new BusGUI(600, 760, "정류장 검색은 어떻게 하나요?", Resources.IMG_HELP, 400, 40);
        window2.setBackground(Color.white);
        window2.setMinimumSize(new Dimension(500, 360));
        window2.setLayout(null);

        JLabel ask1 = new JLabel("정류장 검색은 어떻게 하나요?");
        ask1.setForeground(Resources.COLOR_RED_BUS);
        ask1.setBounds(15, 15, 460, 25);
        ask1.setFont(Resources.nsq(Resources.FONT_BOLD, 25));

        JLabel answer1 = new JLabel("<html> '정류장' 을 클릭하신 후, 정류장 이름을 입력하시면 됩니다! <br>1) '정류장'을 클릭해주세요. </html>");
        answer1.setBounds(25, 60, 460, 40);
        answer1.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));


        JLabel img1 = new JLabel(Resources.getBtImage(Resources.IMG_STOPIMG1, 420, 250));
        img1.setBounds(15, 110, 420, 250);

        JLabel answer1_1 = new JLabel("<html>2) 정류장 검색란에 찾고 싶은 정류장 이름을 입력해주세요.</html>");
        answer1_1.setBounds(25, 370, 460, 15);
        answer1_1.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img2 = new JLabel(Resources.getBtImage(Resources.IMG_STOPIMG3, 200, 230));
        img2.setBounds(25, 400, 200, 230);

        JLabel answer1_2 = new JLabel("<html>3) 해당 정류장을 클릭하시면 정류장 관련 정보가 나옵니다.</html>");
        answer1_2.setBounds(25, 650, 500, 15);
        answer1_2.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));


        window2.add(ask1);
        window2.add(answer1);
        window2.add(answer1_1);
        window2.add(answer1_2);
        window2.add(img1);
        window2.add(img2);

        return window2;
    }

    private static BusGUI ask2() {
        BusGUI window3 = new BusGUI(600, 800, "버스별 정류장은 어떻게 확인하나요?", Resources.IMG_HELP, 400, 40);
        window3.setBackground(Color.white);
        window3.setMinimumSize(new Dimension(500, 360));
        window3.setLayout(null);

        JLabel ask2 = new JLabel("버스별 정류장은 어떻게 확인하나요?");
        ask2.setForeground(Resources.COLOR_RED_BUS);
        ask2.setBounds(15, 15, 460, 25);
        ask2.setFont(Resources.nsq(Resources.FONT_BOLD, 25));

        JLabel answer2 = new JLabel("<html> '노선' 을 클릭하신 후, 버스 이름을 입력하시면 됩니다! <br> 1) '노선'을 클릭해주세요. </html>");
        answer2.setBounds(25, 60, 460, 50);
        answer2.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img3 = new JLabel(Resources.getBtImage(Resources.IMG_LINEIMG1, 420, 250));
        img3.setBounds(15, 110, 420, 250);

        JLabel answer2_2 = new JLabel("<html>2) 노선 검색란에 찾고 싶은 버스를 입력해주세요.</html>");
        answer2_2.setBounds(25, 370, 460, 15);
        answer2_2.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img4 = new JLabel(Resources.getBtImage(Resources.IMG_LINEIMG2, 200, 230));
        img4.setBounds(15, 400, 200, 230);

        JLabel answer2_3 = new JLabel("<html> 3) 해당 버스를 클릭하시면 버스 관련 정보가 나옵니다. <br> <br>  ▶ 버스 정보 <br>\n " +
                "'정류장 이름' 중 한 정류장을 클릭하시면 해당 정류장 정보가 나타납니다 </html> ");
        answer2_3.setBounds(25, 650, 500, 100);
        answer2_3.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));
        window3.add(emptyLabel(30, 10));

        window3.add(ask2);
        window3.add(answer2);
        window3.add(answer2_2);
        window3.add(answer2_3);
        window3.add(img3);
        window3.add(img4);

        return window3;
    }

    private static BusGUI ask3() {
        BusGUI window4 = new BusGUI(600, 800, "즐겨찾기란 무엇인가요?", Resources.IMG_HELP, 400, 40);

        window4.setBackground(Color.white);
        window4.setMinimumSize(new Dimension(500, 360));
        window4.setLayout(null);

        JLabel ask3 = new JLabel("즐겨찾기란 무엇인가요?");
        ask3.setForeground(Resources.COLOR_RED_BUS);
        ask3.setBounds(15, 15, 460, 25);
        ask3.setFont(Resources.nsq(Resources.FONT_BOLD, 25));
        JLabel answer3 = new JLabel("<html>자주 이용하는 정류장에 정차하는 버스 도착 정보를 한눈에 확인해 볼 수 있습니다! <br><br>▶ 즐겨찾기 추가 방법\n" +
                "<br> '정류장' 상단에 있는 즐겨찾기 버튼을 누르세요.</html>");
        answer3.setBounds(15, 60, 640, 100);
        answer3.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img5 = new JLabel(Resources.getBtImage(Resources.IMG_FAVORIMG, 280, 310));
        img5.setBounds(15, 155, 280, 310);

        JLabel answer3_1 = new JLabel("<html>▶ 즐겨찾기 목록 확인 <br> 메인화면의 즐겨찾기 버튼을 누르시면 확인할 수 있습니다.</html>");
        answer3_1.setBounds(15, 480, 460, 40);
        answer3_1.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img6 = new JLabel(Resources.getBtImage(Resources.IMG_FAVORIMG2, 350, 220));
        img6.setBounds(15, 540, 350, 220);

        window4.add(ask3);
        window4.add(answer3);
        window4.add(answer3_1);
        window4.add(img5);
        window4.add(img6);
        return window4;

    }

    private static BusGUI ask4() {
        BusGUI window5 = new BusGUI(600, 500, "해당 버전은 어디서 확인하나요?", Resources.IMG_HELP, 400, 40);
        window5.setBackground(Color.white);
        window5.setMinimumSize(new Dimension(500, 360));
        window5.setLayout(null);


        JLabel ask4 = new JLabel("해당 버전은 어디서 확인하나요? ");
        ask4.setBounds(15, 15, 460, 25);
        ask4.setForeground(Resources.COLOR_RED_BUS);
        ask4.setFont(Resources.nsq(Resources.FONT_BOLD, 25));
        JLabel answer4 = new JLabel("<html>'정보'에서 확인가능합니다!</html>");
        answer4.setBounds(15, 60, 460, 25);
        answer4.setFont(Resources.nsq(Resources.FONT_NORMAL, 15));

        JLabel img6 = new JLabel(Resources.getBtImage(Resources.IMG_INFOIMG, 420, 250));
        img6.setBounds(15, 130, 420, 250);

        window5.add(ask4);
        window5.add(answer4);
        window5.add(img6);

        return window5;
    }

    private static JLabel emptyLabel(int width, int height) {
        return new JLabel(Resources.getBtImage(Resources.IMG_EMPTY, width, height));
    }

}