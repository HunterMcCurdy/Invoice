import javax.swing.SwingUtilities;
public class InvoiceRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InvoiceFrame main = new InvoiceFrame();
                main.initialize();
                main.createDisplayPanel();
                main.address();
                main.total();

            }
        });
    }
}