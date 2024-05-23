import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Online extends JFrame {
    private JTextField nama, tanggalLahir, nomorPendaftaran, nomorTelepon, alamat, email;
    private Font labelFont = new Font("Calibri", Font.PLAIN, 12);
    private Font textFieldFont = new Font("Calibri", Font.PLAIN, 12);

    public Form_Online() {
        setTitle("Formulir Daftar Ulang Mahasiswa Baru");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        addLabel("Nama Lengkap", 20, 20);
        nama = addTextField(160, 20);

        addLabel("Tanggal Lahir", 20, 60);
        tanggalLahir = addTextField(160, 60);

        addLabel("Nomor Pendaftaran", 20, 100);
        nomorPendaftaran = addTextField(160, 100);

        addLabel("No. Telepon", 20, 140);
        nomorTelepon = addTextField(160, 140);

        addLabel("Alamat", 20, 180);
        alamat = addTextField(160, 180, 200, 40);

        addLabel("E-mail", 20, 230);
        email = addTextField(160, 230);

        JButton submitButton = new JButton("submit");
        submitButton.setFont(new Font("Calibri", Font.PLAIN, 14));
        submitButton.setBounds(260, 300, 100, 20);
        submitButton.addActionListener(new submitButton());
        add(submitButton);
    }

    private void addLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setFont(labelFont);
        label.setBounds(x, y, 120, 25);
        add(label);
    }

    private JTextField addTextField(int x, int y) {
        return addTextField(x, y, 200, 25);
    }

    private JTextField addTextField(int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setFont(textFieldFont);
        textField.setBounds(x, y, width, height);
        add(textField);
        return textField;
    }

    private class submitButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (isFormComplete()) {
                int response = JOptionPane.showConfirmDialog(
                        Form_Online.this,
                        "Apakah anda yakin data yang Anda isi sudah benar?",
                        "Konfirmasi",
                        JOptionPane.OK_CANCEL_OPTION
                );

                if (response == JOptionPane.OK_OPTION) {
                    dataMahasiswa();
                }
            } else {
                JOptionPane.showMessageDialog(
                        Form_Online.this,
                        "Semua kolom harus terisi!",
                        "Peringatan!",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        }

        private boolean isFormComplete() {
            return !nama.getText().isEmpty()
                    && !tanggalLahir.getText().isEmpty()
                    && !nomorPendaftaran.getText().isEmpty()
                    && !nomorTelepon.getText().isEmpty()
                    && !alamat.getText().isEmpty()
                    && !email.getText().isEmpty();
        }

        private void dataMahasiswa() {
            JFrame confirmationFrame = new JFrame("Data Mahasiswa");
            confirmationFrame.setSize(400, 300);
            confirmationFrame.setLocationRelativeTo(Form_Online.this);
            confirmationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel(new GridBagLayout());
            panel.setBackground(Color.WHITE);
            panel.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createEmptyBorder(20, 10, 10, 10),
                    BorderFactory.createLineBorder(Color.GRAY)
            ));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.anchor = GridBagConstraints.WEST;

            addDataLabel(panel, "Nama Lengkap", nama.getText(), gbc);
            addDataLabel(panel, "Tanggal Lahir", tanggalLahir.getText(), gbc);
            addDataLabel(panel, "No. Pendaftaran", nomorPendaftaran.getText(), gbc);
            addDataLabel(panel, "Telepon", nomorTelepon.getText(), gbc);
            addDataLabel(panel, "Alamat", alamat.getText(), gbc);
            addDataLabel(panel, "E-mail", email.getText(), gbc);

            confirmationFrame.add(panel, BorderLayout.CENTER);
            confirmationFrame.setVisible(true);
        }

        private void addDataLabel(JPanel panel, String labelText, String value, GridBagConstraints gbc) {
            gbc.gridx = 0;
            gbc.gridy = GridBagConstraints.RELATIVE;
            JLabel label = new JLabel(labelText);
            label.setFont(new Font("Calibri", Font.BOLD, 14));
            panel.add(label, gbc);

            gbc.gridx = 1;
            JLabel valueLabel = new JLabel(value);
            valueLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
            panel.add(valueLabel, gbc);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Form_Online frame = new Form_Online();
            frame.setVisible(true);
        });
    }
}
