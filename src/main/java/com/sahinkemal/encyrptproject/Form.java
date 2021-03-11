package com.sahinkemal.encyrptproject;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileSystemView;

public class Form extends javax.swing.JFrame {
    
    ImageIcon icon;
    public Form() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        initComponents();
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        SwingUtilities.updateComponentTreeUI(this);
        pnlEncryptFile.setVisible(true);
        pnlDecryptFile.setVisible(false);
        this.setSize(355, 470);
        icon = new ImageIcon("icon/encrypted.png");
        setIconImage(icon.getImage());
        btnGroup.add(rdEnc);
        btnGroup.add(rdDec);
        ImageIcon seedIcon = new ImageIcon("icon/gear.png");
        btnSetSeed.setIcon(seedIcon);
        setLocationRelativeTo(null);
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Form().setVisible(true);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btnGroup = new javax.swing.ButtonGroup();
        pnlEncryptFile = new javax.swing.JPanel();
        btnChoose = new javax.swing.JButton();
        lblFilePath = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEncryptedPath = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnChooseEncrypted = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();
        pswForEncryption = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pnlDecryptFile = new javax.swing.JPanel();
        btnDecrypt = new javax.swing.JButton();
        lblOutPath = new javax.swing.JLabel();
        btnChoDecPath = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnChoEnToDec = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblFilePathh = new javax.swing.JLabel();
        pswForDecryption = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdEnc = new javax.swing.JRadioButton();
        rdDec = new javax.swing.JRadioButton();
        btnSetSeed = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA Encryption Project");

        pnlEncryptFile.setPreferredSize(new java.awt.Dimension(315, 375));

        btnChoose.setText("Select file");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        lblFilePath.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFilePath.setText("Waiting for file ...");

        jLabel6.setText("The file you want to encrypt:");

        lblEncryptedPath.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEncryptedPath.setText("Waiting for path to be saved...");

        jLabel8.setText("The path you want to save:");

        btnChooseEncrypted.setText("Select path");
        btnChooseEncrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseEncryptedActionPerformed(evt);
            }
        });

        btnEncrypt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEncrypt.setText("ENCRYPT");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        pswForEncryption.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("YOUR PASSWORD MUST BE 22 CHARACTERS LENGTH!");

        javax.swing.GroupLayout pnlEncryptFileLayout = new javax.swing.GroupLayout(pnlEncryptFile);
        pnlEncryptFile.setLayout(pnlEncryptFileLayout);
        pnlEncryptFileLayout.setHorizontalGroup(
            pnlEncryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncryptFileLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlEncryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnChooseEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEncryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncryptFileLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlEncryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEncryptedPath, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnEncrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pswForEncryption, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlEncryptFileLayout.setVerticalGroup(
            pnlEncryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncryptFileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pswForEncryption, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEncryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnlEncryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseEncrypted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEncryptedPath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel8.getAccessibleContext().setAccessibleName("");

        pnlDecryptFile.setPreferredSize(new java.awt.Dimension(315, 375));

        btnDecrypt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDecrypt.setText("DECRYPT");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        lblOutPath.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblOutPath.setText("Waiting for path to be saved...");

        btnChoDecPath.setText("Select path");
        btnChoDecPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoDecPathActionPerformed(evt);
            }
        });

        jLabel7.setText("The file you want to decrypt:");
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 16));

        btnChoEnToDec.setText("Select file");
        btnChoEnToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoEnToDecActionPerformed(evt);
            }
        });

        jLabel9.setText("The path you want to save:");

        lblFilePathh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFilePathh.setText("Waiting for file ...");

        pswForDecryption.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("YOUR PASSWORD MUST BE 22 CHARACTERS LENGTH!");

        javax.swing.GroupLayout pnlDecryptFileLayout = new javax.swing.GroupLayout(pnlDecryptFile);
        pnlDecryptFile.setLayout(pnlDecryptFileLayout);
        pnlDecryptFileLayout.setHorizontalGroup(
            pnlDecryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDecryptFileLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDecryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDecryptFileLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChoDecPath, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDecryptFileLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChoEnToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswForDecryption)
                    .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilePathh, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOutPath, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlDecryptFileLayout.setVerticalGroup(
            pnlDecryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDecryptFileLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pswForDecryption, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(pnlDecryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChoEnToDec, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFilePathh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDecryptFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoDecPath, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutPath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        rdEnc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rdEnc.setSelected(true);
        rdEnc.setLabel("ENCRYPT FILE");
        rdEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdEncActionPerformed(evt);
            }
        });

        rdDec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rdDec.setLabel("DECRYPT FILE");
        rdDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDecActionPerformed(evt);
            }
        });

        btnSetSeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetSeedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(pnlEncryptFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDecryptFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdDec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdEnc))
                .addGap(18, 18, 18)
                .addComponent(btnSetSeed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rdEnc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSetSeed, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlEncryptFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDecryptFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
        int r = j.showSaveDialog(null); 
  
        if (r == JFileChooser.APPROVE_OPTION) 
            lblFilePath.setText(j.getSelectedFile().getAbsolutePath()); 
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnChooseEncryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseEncryptedActionPerformed
        
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = j.showSaveDialog(null); 
  
        if (r == JFileChooser.APPROVE_OPTION) 
            lblEncryptedPath.setText(j.getSelectedFile().getAbsolutePath()); 
    }//GEN-LAST:event_btnChooseEncryptedActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////
    public static String s1 = "1234567812345678";
    //byte[] bytess = s1.getBytes();
    //IvParameterSpec ivParameterSpec = new IvParameterSpec(bytess);
    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        //JOptionPane.showMessageDialog(null,bytess.toString());
        if (pswForEncryption.getText().length() == 0) {
            JOptionPane.showMessageDialog(null,"YOU CAN'T CONTINUE WITHOUT ENTERING THE PASSWORD!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            SecretKey key = FileEncryption.StringToKey(pswForEncryption.getText());
            if (key.getEncoded().length == 16)
            {
                JOptionPane.showMessageDialog(null, "PASSWORD ACCEPTED");
                String algorithm = "AES/CBC/PKCS5Padding";
                File inputFile = new File(lblFilePath.getText());
                File outputFile = new File(lblEncryptedPath.getText()+"\\"+inputFile.getName());
                try {
                    FileEncryption.encryptFile(algorithm, key, FileEncryption.generateIv(s1), inputFile, outputFile);
                } catch (IOException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchPaddingException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidAlgorithmParameterException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeyException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "PASSWORD IS INVALID!");
                } catch (BadPaddingException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalBlockSizeException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
                pswForEncryption.setText("");
                JOptionPane.showMessageDialog(null, "ENCRYPTION COMPLETED.");
            }      
            else
            {
            JOptionPane.showMessageDialog(null,"THE PASSWORD MUST CONSIST OF 22 CHARACTERS!","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEncryptActionPerformed
    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        if (pswForDecryption.getText().length() == 0) {
            JOptionPane.showMessageDialog(null,"YOU CAN'T CONTINUE WITHOUT ENTERING THE PASSWORD!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            SecretKey key = FileEncryption.StringToKey(pswForDecryption.getText());
            if (key.getEncoded().length == 16) {
                try {
                    String algorithm = "AES/CBC/PKCS5Padding";
                    File inputFile = new File(lblFilePathh.getText());
                    File outputFile = new File(lblOutPath.getText()+"\\"+inputFile.getName());
                    FileEncryption.decryptFile(algorithm, key, FileEncryption.generateIv(s1), inputFile, outputFile);      
                    JOptionPane.showMessageDialog(null, "DECRYPTION COMPLETED.");
                    
                } catch (IOException | NoSuchPaddingException | NoSuchAlgorithmException | InvalidAlgorithmParameterException | IllegalBlockSizeException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeyException | BadPaddingException ex) {
                    JOptionPane.showMessageDialog(null,"INCORRECT PASSWORD!","ERROR",JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
            JOptionPane.showMessageDialog(null,"THE PASSWORD MUST CONSIST OF 22 CHARACTERS!","ERROR",JOptionPane.ERROR_MESSAGE);
            }
              
        }
        
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnChoDecPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoDecPathActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = j.showSaveDialog(null); 
            
        if (r == JFileChooser.APPROVE_OPTION) 
            lblOutPath.setText(j.getSelectedFile().getAbsolutePath()); 
    }//GEN-LAST:event_btnChoDecPathActionPerformed

    private void btnChoEnToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoEnToDecActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int r = j.showSaveDialog(null); 
  
        if (r == JFileChooser.APPROVE_OPTION) 
            lblFilePathh.setText(j.getSelectedFile().getAbsolutePath()); 
    }//GEN-LAST:event_btnChoEnToDecActionPerformed
    
    private void rdDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDecActionPerformed
        pnlEncryptFile.setVisible(false);
        pnlDecryptFile.setLocation(pnlEncryptFile.getLocation());
        pnlDecryptFile.setVisible(true);
        
    }//GEN-LAST:event_rdDecActionPerformed

    private void rdEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdEncActionPerformed
        pnlDecryptFile.setVisible(false);
        pnlEncryptFile.setVisible(true);
    }//GEN-LAST:event_rdEncActionPerformed

    private void btnSetSeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetSeedActionPerformed
        try {
            new SetSeed().setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSetSeedActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoDecPath;
    private javax.swing.JButton btnChoEnToDec;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnChooseEncrypted;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSetSeed;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEncryptedPath;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JLabel lblFilePathh;
    private javax.swing.JLabel lblOutPath;
    private javax.swing.JPanel pnlDecryptFile;
    private javax.swing.JPanel pnlEncryptFile;
    private javax.swing.JTextField pswForDecryption;
    private javax.swing.JTextField pswForEncryption;
    private javax.swing.JRadioButton rdDec;
    private javax.swing.JRadioButton rdEnc;
    // End of variables declaration//GEN-END:variables
}