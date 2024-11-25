import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI1 {
    static void login() {
        JFrame f = new JFrame();
        f.setSize(300, 150);
        JPanel p = new JPanel();
        JButton b = new JButton("Login");
        JTextField t = new JTextField();
        JPasswordField pwd = new JPasswordField();
        p.setLayout(new GridLayout(3, 2, 10, 10));
        p.add(new JLabel("User ID"));
        p.add(t);
        p.add(new JLabel("Passcode"));
        p.add(pwd);
        p.add(new JLabel(""));
        p.add(b);
        f.add(p);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ATMNumber = t.getText();
                String ATMPin = new String(pwd.getPassword());

                if (ATMNumber.equals("12345") && ATMPin.equals("123")) {
                    f.dispose();  // Đóng cửa sổ đăng nhập
                    MainScreen(); // Chuyển sang màn hình chính
                } else {
                    infoBox("Invalid account. Please try again!", "Error");
                }
            }
        });
    }
    static void Withdraw() {
        JFrame f = new JFrame();
        f.setSize(300, 150);
        JPanel p = new JPanel();
        JButton b = new JButton("Withdraw");
        JTextField t = new JTextField();
        p.setLayout(new GridLayout(3, 2, 10, 10));
        p.add(new JLabel("Withdraw Amount"));
        p.add(t);
        p.add(new JLabel(""));
        p.add(b);
        f.add(p);
        f.setVisible(true);
    }
    static void Deposit() {
        JFrame f = new JFrame();
        f.setSize(300, 150);
        JPanel p = new JPanel();
        JButton b = new JButton("Deposit");
        JTextField t = new JTextField();
        p.setLayout(new GridLayout(2, 2, 10, 10));
        p.add(new JLabel("Deposit Amount"));
        p.add(t);
        p.add(new JLabel(""));
        p.add(b);
        f.add(p);
        f.setVisible(true);
    }
    static void MainScreen(){
        JFrame ms = new JFrame();
        ms.setSize(300, 150);
        JPanel lp = new JPanel();
        JPanel tb = new JPanel();
        lp.setLayout(new BoxLayout(lp, BoxLayout.Y_AXIS));
        tb.setLayout(new FlowLayout());
        tb.add(new JLabel("PTIT S-BANK"));
        tb.add(new JLabel("ATM ID 10283"));
        tb.add(new JLabel("UID 12345 - NGUYEN TUAN MINH"));
        JPanel sel = new JPanel();
        sel.setLayout(new GridLayout(2, 2, 10, 10));
        sel.add(new JButton("View Balance - Xem so du"));
        sel.add(new JButton("Withdraw - Rut tien"));
        sel.add(new JButton("Deposit - Gui tien"));
        sel.add(new JButton("View Mini Statement - Xem sao ke gan nhat"));
        lp.add(tb);
        lp.add(sel);
        lp.add(new JButton("Exit - Thoat"));
        ms.add(lp);
        ms.setVisible(true);
    }
    static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    static void Balance(int bal)
    {
        infoBox("Your balance is/So du cua ban la: "+String.valueOf(bal)+ " VND", "So du tai khoan - Account Balance");
    }
    static void MiniStatement()
    {
        infoBox("Your mini statement", "Sao ke gan nhat - Mini Statement");
    }
    static void EndScreen()
    {
        infoBox("Thank you for using our service.", "Exit");
    }
    public static void main(String[] args) {
        login();
    }
}
