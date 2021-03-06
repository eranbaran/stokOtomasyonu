
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *g
 * @author lerha
 */
public class girisEkrani extends javax.swing.JFrame {
    urunİslemleri UrunIslemleri = new urunİslemleri();
    /**
     * Creates new form girisEkrani
     */
    public girisEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        kullaniciAdi_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mesaj_alani = new javax.swing.JLabel();
        giris_butonu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        parola_alani = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/person-icon.png"))); // NOI18N
        jLabel2.setText(" Kullanıcı adı :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 130, 50));

        kullaniciAdi_alani.setBackground(new java.awt.Color(16, 113, 193));
        getContentPane().add(kullaniciAdi_alani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User-Interface-Password-2-icon.png"))); // NOI18N
        jLabel3.setText(" Parola :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 110, 40));

        mesaj_alani.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        mesaj_alani.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(mesaj_alani, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 290, 50));

        giris_butonu.setBackground(new java.awt.Color(255, 204, 204));
        giris_butonu.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        giris_butonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sign-LogOff-icon.png"))); // NOI18N
        giris_butonu.setText("    Giriş Yap");
        giris_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonuActionPerformed(evt);
            }
        });
        getContentPane().add(giris_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 760, 160, 50));

        jLabel5.setFont(new java.awt.Font("Wide Latin", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("  Uygulamamıza Hosgeldiniz ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 480, 150));

        parola_alani.setBackground(new java.awt.Color(16, 113, 193));
        getContentPane().add(parola_alani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ecommerce-Move-By-Trolley-icon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 110, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stokGiris.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 1140));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void hosgeldinizAudio(){
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("hosgeldiniz.wav"));
            
            Clip clip =AudioSystem.getClip();
            clip.open(stream);
            clip.start();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
public void girisHataliAudio(){
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("hataliGiris.wav"));
            
            Clip clip =AudioSystem.getClip();
            clip.open(stream);
            clip.start();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    private void giris_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonuActionPerformed
       mesaj_alani.setText("");
       String kullanici_adi = kullaniciAdi_alani.getText();
       String parola = new String (parola_alani.getPassword());
       boolean giris =UrunIslemleri.girisYap(kullanici_adi, parola);
       if(giris){
           hosgeldinizAudio();
           urunEkrani Urunekrani = new urunEkrani(this, true);
           setVisible(false);
           Urunekrani.setVisible(true);
           System.exit(0);
       }else{
           mesaj_alani.setText("Hatalı giriş yaptınız, lütfen tekrar deneyiniz !");
           girisHataliAudio();
       }
    }//GEN-LAST:event_giris_butonuActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kullaniciAdi_alani;
    private javax.swing.JLabel mesaj_alani;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables
}
