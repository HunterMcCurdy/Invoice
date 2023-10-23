import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;


public class InvoiceFrame {
    private JFrame window;
    private JTextArea displayTA = new JTextArea(3, 10);
    private JTextField titles = new JTextField();
    private JTextArea totalTA = new JTextArea(15, 10);
    public InvoiceFrame() {

    }


    public void initialize() {
        window = new JFrame();
        window.setTitle("Invoice");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1440, 1000);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout(10, 5));
        window.setVisible(true);
    }

    public void createDisplayPanel() {
        JPanel title = new JPanel();
        titles.setText("Invoice");
        titles.setEditable(false);
        titles.setFont(new Font("Arial", Font. BOLD, 100));
        titles.setHorizontalAlignment(JTextField.CENTER);
        title.add(titles);
        window.add(title, BorderLayout.NORTH);
    }

    public void address() {
        JPanel address = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        displayTA.setText("Sam's Small Appliances" + "\n" + "100 Main Street" + "\n" + "Anytown, CA 98765");
        displayTA.setFont(new Font("Arial", Font. PLAIN, 25));
        displayTA.setEditable(false);
        address.add(displayTA);
        displayTA.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        window.add(address, BorderLayout.WEST);
    }

    public void total() {
        JPanel total = new JPanel();
        totalTA.setFont(new Font("Arial", Font. PLAIN, 30));
        totalTA.setText("====================================================================="
                        + "\n" + "Item                                                                                                      Qty            Price          Total"
                        + "\n" + "Toaster                                                                                                    3             $29.95        $89.85"
                        + "\n" + "Hair Dryer                                                                                              1             $24.95        $24.95"
                        + "\n" + "Car Vacuum                                                                                             2             $19.99        $19.99"
                        + "\n" + "====================================================================="
                        + "\n" + "AMOUNT DUE: 154.78");
        total.add(totalTA);
        window.add(total, BorderLayout.SOUTH);


    }






}

