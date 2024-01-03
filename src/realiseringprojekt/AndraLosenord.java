/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package realiseringprojekt;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author leyla
 */
public class AndraLosenord extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form AndraLosenord
     */
    public AndraLosenord(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSvartBakgrund = new javax.swing.JPanel();
        lblBild = new javax.swing.JLabel();
        pnlSideBarVanster = new javax.swing.JPanel();
        lblNyttLosen = new javax.swing.JLabel();
        lblBekraftaLosen = new javax.swing.JLabel();
        txtSkrivaEpost = new javax.swing.JTextField();
        btnFornyaLosenord = new javax.swing.JButton();
        lblAndraTillNyttLosen = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        pwdNyttLosen = new javax.swing.JPasswordField();
        pwdBekraftaLosen = new javax.swing.JPasswordField();
        lblAngeDinEpost = new javax.swing.JLabel();
        lblFelMeddelande = new javax.swing.JLabel();
        lblLosenordAndrad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlSvartBakgrund.setBackground(new java.awt.Color(0, 0, 0));

        lblBild.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyla\\OneDrive\\Bilder\\Skärmbilder\\Skärmbild 2023-12-18 145806.png")); // NOI18N

        pnlSideBarVanster.setBackground(new java.awt.Color(51, 51, 51));

        lblNyttLosen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNyttLosen.setForeground(new java.awt.Color(255, 255, 255));
        lblNyttLosen.setText("Nytt lösenord");

        lblBekraftaLosen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBekraftaLosen.setForeground(new java.awt.Color(255, 255, 255));
        lblBekraftaLosen.setText("Bekräfta lösenord");

        btnFornyaLosenord.setBackground(new java.awt.Color(0, 102, 0));
        btnFornyaLosenord.setForeground(new java.awt.Color(255, 255, 255));
        btnFornyaLosenord.setText("Förnya lösenord");
        btnFornyaLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornyaLosenordActionPerformed(evt);
            }
        });

        lblAndraTillNyttLosen.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAndraTillNyttLosen.setForeground(new java.awt.Color(255, 255, 255));
        lblAndraTillNyttLosen.setText("Ändra till nytt lösenord");

        btnTillbaka.setBackground(new java.awt.Color(0, 102, 102));
        btnTillbaka.setForeground(new java.awt.Color(255, 255, 255));
        btnTillbaka.setText("Tillbaka till föregående sida");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        pwdNyttLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdNyttLosenActionPerformed(evt);
            }
        });

        lblAngeDinEpost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAngeDinEpost.setForeground(new java.awt.Color(255, 255, 255));
        lblAngeDinEpost.setText("Ange din e-postadress");

        lblFelMeddelande.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFelMeddelande.setForeground(new java.awt.Color(153, 0, 0));

        lblLosenordAndrad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLosenordAndrad.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout pnlSideBarVansterLayout = new javax.swing.GroupLayout(pnlSideBarVanster);
        pnlSideBarVanster.setLayout(pnlSideBarVansterLayout);
        pnlSideBarVansterLayout.setHorizontalGroup(
            pnlSideBarVansterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarVansterLayout.createSequentialGroup()
                .addGroup(pnlSideBarVansterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideBarVansterLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(pnlSideBarVansterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAngeDinEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSkrivaEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAndraTillNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSideBarVansterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblFelMeddelande, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pwdBekraftaLosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(pwdNyttLosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(lblBekraftaLosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(lblNyttLosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                    .addGroup(pnlSideBarVansterLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFornyaLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSideBarVansterLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblLosenordAndrad, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pnlSideBarVansterLayout.setVerticalGroup(
            pnlSideBarVansterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarVansterLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblAndraTillNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAngeDinEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSkrivaEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblBekraftaLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdBekraftaLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblFelMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSideBarVansterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFornyaLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLosenordAndrad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout pnlSvartBakgrundLayout = new javax.swing.GroupLayout(pnlSvartBakgrund);
        pnlSvartBakgrund.setLayout(pnlSvartBakgrundLayout);
        pnlSvartBakgrundLayout.setHorizontalGroup(
            pnlSvartBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSvartBakgrundLayout.createSequentialGroup()
                .addComponent(pnlSideBarVanster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(lblBild, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        pnlSvartBakgrundLayout.setVerticalGroup(
            pnlSvartBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSvartBakgrundLayout.createSequentialGroup()
                .addGroup(pnlSvartBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSvartBakgrundLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblBild, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlSideBarVanster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSvartBakgrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSvartBakgrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwdNyttLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdNyttLosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdNyttLosenActionPerformed

    private void btnFornyaLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornyaLosenordActionPerformed
        //Skapar ett nytt lösenord (funkar just nu endast för tabell agent)

        String losen1 = pwdNyttLosen.getText();
        String losen2 = pwdBekraftaLosen.getText();
        String epost = txtSkrivaEpost.getText();

        if (epost.isEmpty() || losen1.isEmpty() || losen2.isEmpty()) {
            lblFelMeddelande.setText("Du måste fylla in all information för att ändra!");
            lblLosenordAndrad.setText("");

        } else if (!losen2.equals(losen1)) {
            lblFelMeddelande.setText("Lösenorden matchar inte varandra!");
            lblLosenordAndrad.setText("");

        } else {

            try {
                String fraga = "UPDATE agent SET Losenord='" + losen1 + "' WHERE Epost='" + epost + "'";
                idb.update(fraga);
                lblLosenordAndrad.setText("Lösenordet har nu ändrats.");
                lblFelMeddelande.setText("");

            } catch (InfException fel) {
                lblFelMeddelande.setText("Ett fel uppstod vid ändringen!");
                lblLosenordAndrad.setText("");
            }
        }
    }//GEN-LAST:event_btnFornyaLosenordActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // Knappen skickar användaren tillbaka till inloggningssidan
        // Bör ändras till att skicka tillbaka till förra sidan
        Inloggning eninloggning = new Inloggning(idb);
        eninloggning.show();
        dispose();
                   
    }//GEN-LAST:event_btnTillbakaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFornyaLosenord;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblAndraTillNyttLosen;
    private javax.swing.JLabel lblAngeDinEpost;
    private javax.swing.JLabel lblBekraftaLosen;
    private javax.swing.JLabel lblBild;
    private javax.swing.JLabel lblFelMeddelande;
    private javax.swing.JLabel lblLosenordAndrad;
    private javax.swing.JLabel lblNyttLosen;
    private javax.swing.JPanel pnlSideBarVanster;
    private javax.swing.JPanel pnlSvartBakgrund;
    private javax.swing.JPasswordField pwdBekraftaLosen;
    private javax.swing.JPasswordField pwdNyttLosen;
    private javax.swing.JTextField txtSkrivaEpost;
    // End of variables declaration//GEN-END:variables
}
