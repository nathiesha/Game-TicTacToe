
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ticTak.java
 *
 * Created on Oct 31, 2014, 9:05:48 PM
 */


public class ticTak extends javax.swing.JFrame {
final static Logger logger = Logger.getLogger("ticTak");    
board2 brd2 = new board2();
char empty = '_';
    /** Creates new form ticTak */
    public ticTak() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setForeground(new java.awt.Color(153, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel7, 0, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel8, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, 0, 1, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(13, 13, 13)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

static  int flag=0;
public void newGame(){ 
    for (int i = 0; i < brd2.positions.length; i++) {
			brd2.positions[i] =empty;
		}
     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setForeground(new java.awt.Color(153, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/toe.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel7, 0, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel8, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, 0, 1, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(13, 13, 13)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
}
//====================================================================================

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        if(brd2.positions[0]==empty)
        {
            if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,0);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
            }
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,0);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
        }
        else
             jLabel10.setText("Try Another Location");


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 if(brd2.positions[1]==empty){
       if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
     if(flag%2==0)
       {jLabel10.setText("");
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,1);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,1);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 if((brd2.positions[2]==empty)){
       if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,2);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }
       else
       {jLabel10.setText("");
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,2);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 if(brd2.positions[3]==empty)
 {
     if(!(jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))){
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,3);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,3);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
 if(brd2.positions[4]==empty)
 {
   if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,4);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,4);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
 if(brd2.positions[5]==empty){
       if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,5);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,5);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
 if(brd2.positions[6]==empty){
       if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,6);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,6);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
 if((brd2.positions[7]==empty)){
       if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,7);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
             if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,7);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
          if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
 if((brd2.positions[8]==empty)){
       if(!((jLabel10.getText().equals("PLAYER 2  WINS")||(jLabel10.getText().equals("PLAYER 1  WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
            brd2.setMove(brd2.p1,8);
            if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 1  WINS");
                 new endWindow().setVisible(true);
					}
              if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
            flag++;
       }

       else
       {jLabel10.setText("");
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
        brd2.setMove(brd2.p2,8);
         if(brd2.checkWinning()){
                 jLabel10.setText("PLAYER 2  WINS");
                 new endWindow().setVisible(true);
					}
         if(flag>=8){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
        flag++;
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newGame();
      //  new ticTak().setVisible(true); 
     //   current.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {     
        
        java.awt.EventQueue.invokeLater(new Runnable() {     
            public void run() {
            flag=0;
            new ticTak().setVisible(true);
            }
        });
        
        logger.warning("this is warning");
        logger.info("this is file info");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
 class player2{
	private char symbol;
	private int location[];
	int i;
	public player2(char sym){
		symbol = sym;
		location = new int[5];
		i=0;

	}
	public char getSymbol(){
		return symbol;
	}
	public int[] getLocation(){
		return location;
	}
	public void addLocation(int loc){
		location[i]=loc;
		i++;
	}

}
//======================================================================================

 class board2{
	player p1;
	player p2;
	 char positions[];
	char empty = '_';
	public board2(){
		p1 = new player('X');
		p2 = new player('0');

		positions = new char[9];
		for (int i = 0; i < positions.length; i++) {
			positions[i] =empty;
		}

	}

	/***Set place after giving player and the position**/
	public void setMove(player p,int location){
		
			positions[location]= p.getSymbol();
			p.addLocation(location);	
	}

	/****Check whether game is winning***/
	public boolean checkWinning(){
		boolean state = false;

		for(int i=0;i<3;i++){
			if(positions[i]==positions[i+3] &&  positions[i+3]==positions[i+6] && positions[i]!=empty ){
				state= true;
				break;

			}
			else if(positions[3*i]==positions[3*i+1] && positions[3*i+1]==positions[3*i+2] && positions[3*i]!=empty){
				state= true;
				break;
			}
			else if(positions[0]==positions[4] && positions[4]==positions[8]&& positions[0]!=empty){
				state= true;
				break;
			}
			else if(positions[2]==positions[4] && positions[4]==positions[6]&& positions[2]!=empty){
				state = true;
				break;
			}

		}
                
		return state;
                
	}
       
}



