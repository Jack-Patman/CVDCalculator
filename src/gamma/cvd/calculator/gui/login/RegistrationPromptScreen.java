package gamma.cvd.calculator.gui.login;

import gamma.cvd.calculator.gui.GuiUtils;
import gamma.cvd.login.CVDLogin;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

/**
 *
 * @author Jack
 */
public class RegistrationPromptScreen extends javax.swing.JFrame
{
    private static final String REGISTRATION_KEY = "472KiNz8Un"; 
    private CVDLogin auth; 
    
    RegistrationPromptScreen(CVDLogin auth) 
    {
        this.auth = auth;
        
        initComponents();
        
        GuiUtils.setNativeGuiStyle(this);    
        GuiUtils.centerScreen(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistrationKey = new javax.swing.JLabel();
        txtRegistrationKey = new javax.swing.JTextField();
        btnEnterKey = new javax.swing.JButton();
        btnRegistrationClose = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtSecondName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPasswordCheck = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        lblSecondName = new javax.swing.JLabel();
        comboTitle = new javax.swing.JComboBox();
        lblTitle = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordCheck = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter your Registration Key");

        lblRegistrationKey.setText("Registration Key");

        btnEnterKey.setText("Register");
        btnEnterKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterKeyActionPerformed(evt);
            }
        });

        btnRegistrationClose.setText("Close");
        btnRegistrationClose.setActionCommand("btnClose");
        btnRegistrationClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationCloseActionPerformed(evt);
            }
        });

        lblUsername.setText("Desired Username:");

        lblPassword.setText("Desired Password:");

        lblPasswordCheck.setText("Re-type Password:");

        lblEmail.setText("Email Address:");

        lblFirstname.setText("First Name:");

        lblSecondName.setText("Second Name:");

        comboTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr", "Mrs", "Ms" }));

        lblTitle.setText("Title:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnterKey, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrationClose, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUsername)
                                    .addComponent(lblPasswordCheck)
                                    .addComponent(lblRegistrationKey))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRegistrationKey)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword)
                                    .addComponent(txtPasswordCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstname)
                                    .addComponent(lblSecondName)
                                    .addComponent(lblTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSecondName, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                        .addComponent(txtFirstName))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmailAddress)))
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrationKey)
                    .addComponent(txtRegistrationKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordCheck)
                    .addComponent(txtPasswordCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSecondName))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnterKey)
                    .addComponent(btnRegistrationClose))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterKeyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEnterKeyActionPerformed
    {//GEN-HEADEREND:event_btnEnterKeyActionPerformed
        
       if (!txtRegistrationKey.getText().equals(REGISTRATION_KEY))
       {
           JOptionPane.showMessageDialog(this, "The key entered was incorrect.", "Incorrect Key", JOptionPane.ERROR_MESSAGE);          
       }
       else
       {
           try {
               String username = txtUsername.getText();
               String password = Arrays.toString(txtPassword.getPassword());
               String passwordCheck = Arrays.toString(txtPasswordCheck.getPassword());
               
               String title = String.valueOf(comboTitle.getSelectedItem());
               String firstName = txtFirstName.getText();
               String secondName = txtSecondName.getText();
               String emailAddress = txtEmailAddress.getText();
               
               if (password == null || password.isEmpty())
               {
                   JOptionPane.showMessageDialog(this, "Password field was empty, please fill in field.", "Empty fields", JOptionPane.ERROR_MESSAGE);
               }
               else if (emailAddress == null || emailAddress.isEmpty())
               {
                   JOptionPane.showMessageDialog(this, "Email field was empty, please fill in field.", "Empty fields", JOptionPane.ERROR_MESSAGE);
               }
               else if (username == null || username.isEmpty())
               {
                   JOptionPane.showMessageDialog(this, "Username field was empty, please fill in field.", "Empty fields", JOptionPane.ERROR_MESSAGE);
               }
               else if (firstName == null || firstName.isEmpty())
               {
                   JOptionPane.showMessageDialog(this, "First Name field was empty, please fill in field.", "Empty fields", JOptionPane.ERROR_MESSAGE);
               }
               else if (secondName == null || secondName.isEmpty())
               {
                   JOptionPane.showMessageDialog(this, "Surname field was empty, please fill in field.", "Empty fields", JOptionPane.ERROR_MESSAGE);
               }
               else if (!passwordCheck.equals(password))
               {
                   JOptionPane.showMessageDialog(this, "The passwords you entered did not match", "Passwords didn't match", JOptionPane.ERROR_MESSAGE);
               }
               else
               {
                // Call Registration Method with username & password
                auth.createNewUser(username, password, title, firstName, firstName, emailAddress);
                JOptionPane.showMessageDialog(this, "Account was succesfully registered, you may now login with your new details", "Succesful Registration", JOptionPane.INFORMATION_MESSAGE);
                dispose();
               }
           } catch (InvalidKeySpecException ex) {
               Logger.getLogger(RegistrationPromptScreen.class.getName()).log(Level.SEVERE, null, ex);
           } catch (TransformerException | XPathExpressionException | GeneralSecurityException ex) {
               Logger.getLogger(RegistrationPromptScreen.class.getName()).log(Level.SEVERE, null, ex);
           } catch (UnsupportedEncodingException ex) {
               Logger.getLogger(RegistrationPromptScreen.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(RegistrationPromptScreen.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_btnEnterKeyActionPerformed

    private void btnRegistrationCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrationCloseActionPerformed
    {//GEN-HEADEREND:event_btnRegistrationCloseActionPerformed
           dispose(); 
    }//GEN-LAST:event_btnRegistrationCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterKey;
    private javax.swing.JButton btnRegistrationClose;
    private javax.swing.JComboBox comboTitle;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordCheck;
    private javax.swing.JLabel lblRegistrationKey;
    private javax.swing.JLabel lblSecondName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordCheck;
    private javax.swing.JTextField txtRegistrationKey;
    private javax.swing.JTextField txtSecondName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
