/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PARUL KALRA
 */
public class tictactoe extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    /**
     * Creates new form tictactoe
     */
    public tictactoe() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
    
    private void gameScore()
    {
        jbplayerx.setText(String.valueOf(xCount));
        jbplayero.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if (startGame.equalsIgnoreCase("X"))
        {
            startGame ="O";
        }
    
    else
    {
                startGame ="X";
    }
    }
    
       private void winningGame()
       {
           String b1 = jButton1.getText();
           String b2 = jButton2.getText();
           String b3 = jButton3.getText();
           
           String b4 = jButton6.getText();
           String b5 = jButton7.getText();
           String b6 = jButton8.getText();
           
           String b7 = jButton11.getText();
           String b8 = jButton12.getText();
           String b9 = jButton13.getText();
           
           if (b1==("X")&& b2==("X")&& b3==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
               
               
           }
            if (b4==("X")&& b5==("X")& b6==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
               
           }
             if (b7==("X")&& b8==("X")& b9==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
              
           }
              if (b1==("X")&& b5==("X")& b9==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
               
           }
               if (b3==("X")&& b5==("X")& b7==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
               
           }
                if (b1==("X")&& b4==("X")& b7==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
              
           }
                 if (b2==("X")&& b5==("X")& b8==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
               
           }
                  if (b3==("X")&& b6==("X")& b9==("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               xCount++;
               gameScore();
              
           }
                  if (b1==("O")&& b2==("O")&& b3==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
               
           }
                  if (b4==("O")&& b5==("O")&& b6==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
              
           }
                  if (b7==("O")&& b8==("O")&& b9==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
              
           }
                  if (b1==("O")&& b5==("O")&& b9==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
              
           }
                  if (b3==("O")&& b5==("O")&& b7==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
               
           }
                  if (b1==("O")&& b4==("O")&& b7==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
               
           }
                  if (b2==("O")&& b5==("O")&& b8==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
              
           }
                  if (b3==("O")&& b6==("O")&& b9==("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
               oCount++;
               gameScore();
               
           }
       }
       


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jbplayerx = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jbplayero = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnreset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        label1.setText("TIC TAC TOE");
        jPanel1.add(label1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Player X:");
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jbplayerx.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbplayerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jbplayerx, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 0));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 0));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 0));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 0));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 0));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jbplayero.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbplayero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jbplayero, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 0));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 0));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 0));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 0));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnreset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 0));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnexit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
       frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "TIC TAC TOE", 
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION ) 
      
       {
           System.exit(0);
           
       }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
 jButton1.setText(null);  
jButton2.setText(null);  
jButton3.setText(null);  
jButton6.setText(null);  
jButton7.setText(null);  
jButton8.setText(null);  
jButton11.setText(null);  
jButton12.setText(null);  
jButton13.setText(null);  
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        jButton1.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton1.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton2.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton3.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton6.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jButton7.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton7.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton8.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton11.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton11.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton12.setForeground(Color.GREEN);
        }
    
        else
    {
                jButton12.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton13.setForeground(Color.GREEN);
        }
    
    else
    {
                jButton13.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jbplayero;
    private javax.swing.JLabel jbplayerx;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
