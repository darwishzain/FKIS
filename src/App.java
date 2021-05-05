
import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class App {
    public static void GUI(){
        JFrame frame = new JFrame("FKIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960,540);

        loginUI(frame);
    }
    public static void loginUI(JFrame frame){
        JTextField userId = new JTextField("ID",20);
        JTextField userPwd = new JTextField("Password",20);
        JButton loginBtn = new JButton("Log In");
        JPanel loginPanel = new JPanel();

        loginPanel.add(userId);
        loginPanel.add(userPwd);
        loginPanel.add(loginBtn);

        frame.getContentPane().add(loginPanel);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) throws Exception {
        GUI();//Launch the graphic user interface

        request b = new request();
        order o = new order();
        report r = new report();
        approve a = new approve();
        audit d = new audit();
        register u = new register();
        
        r.WriteReport();

        
    }
}
