package GUI;

import Parse.StopListSet;
import Parse.BusListSet;

import javax.swing.*;
import java.awt.*;

public class StatGUI extends BusGUI {

    public StatGUI(int width, int height, String title, String ico) {
        super(width, height, title, ico);
    }

    public StatGUI(int width, int height, String title, String ico, int startX, int startY) {
        super(width, height, title, ico, startX, startY);
    }

    public static StatGUI stat() {

        StatGUI window = new StatGUI(300,300,"통계","null");

        JLabel label1 = new JLabel(Resources.getBtImage(Resources.IMG_BUS_ORANGE, -1, 60));
        JLabel label2 = new JLabel(Resources.getBtImage(Resources.IMG_STOP1, -1, 60));
        JLabel label5 = new JLabel(Resources.getBtImage(Resources.IMG_FAV_YES, -1, 60));
        JLabel label3 = new JLabel(": "+BusListSet.size,SwingConstants.CENTER);
        JLabel label4 = new JLabel(": "+StopListSet.size,SwingConstants.CENTER);
        JLabel label6 = new JLabel(": "+BusGUI.getFav(TYPE_LINE).length,SwingConstants.CENTER);
        label1.setToolTipText("노선 수");
        label2.setToolTipText("정류장 수");
        label5.setToolTipText("즐겨찾기한 정류장 수");
        label3.setFont(Resources.nsq(Resources.FONT_NORMAL,25));
        label4.setFont(Resources.nsq(Resources.FONT_NORMAL,25));
        label6.setFont(Resources.nsq(Resources.FONT_NORMAL,25));
        window.setLayout(new BorderLayout());
        window.setLayout(new GridLayout(3,2));
        window.add(label1);
        window.add(label3);
        window.add(label2);
        window.add(label4);
        window.add(label5);
        window.add(label6);


        return window;
    }



}

    /*public static void main(String[] args)  {
        StatGUI window = new StatGUI(300,400,"통계",null);
        JLabel label1 = new JLabel("총 정류장 수:"+StopListSet.save()+"   총 노선 수:"+BusListSet.save());;
        window.add(label1);
        window.start();*/
