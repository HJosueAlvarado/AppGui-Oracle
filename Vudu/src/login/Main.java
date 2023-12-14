
package login;

import javax.swing.JFrame;

public class Main {


    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login LoginFrame = new Login();
                LoginFrame.setVisible(true);
                LoginFrame.pack();
                LoginFrame.setLocationRelativeTo(null);

                // Manejo de cierre
                LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    
}
