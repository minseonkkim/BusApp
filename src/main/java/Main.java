import GUI.BusGUI;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {

        // Database AutoStarter
        // https://d2.naver.com/helloworld/1113548
        String h2Dir="D:\\Program Files\\H2";

        String[] cmd= {"java", "-cp", "\""+h2Dir+"\\bin\\h2-1.4.200.jar;%H2DRIVERS%;%CLASSPATH%\"", "org.h2.tools.Console"};
        ProcessBuilder run=new ProcessBuilder(cmd);
        try { run.start(); }
        catch (IOException e) { e.printStackTrace(); }

//        // Java에서 브라우저 열기
//        try {
//            Desktop.getDesktop().browse(new URI("https://www.naver.com/"));
//        } catch (IOException | URISyntaxException e) {
//            e.printStackTrace();
//        }

        BusGUI.mainMenu().start();
    }
}
