/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
public class ticTak12 extends javax.swing.JFrame {
public static DataBase db=DataBase.getInstance();
public static board brd = new board();
char empty = '_';
    /** Creates new form ticTak */
    public ticTak12() {
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

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel8, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   static  int flag=0;
public void newGame(){ 
    for (int i = 0; i < brd.positions.length; i++) {
			brd.positions[i] =empty;
		}
     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel8, 0, 40, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
}
//====================================================================================

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        if(brd.positions[0]==empty)
        {System.out.println(flag);
         if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
            {
            if(flag%2==0)
                {jLabel10.setText("");
                 jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
                 brd.setMove(brd.p1,0);
                   if(brd.checkWinning()){
                     jLabel10.setText("USER WINS");
                     db.init("user");
                     new endWindow().setVisible(true);
					}
                   if(flag>=9){
                    jLabel10.setText("GAME DRAW");
                    new endWindow().setVisible(true);
					}
                    flag++;
            int tem;
             if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
          setResponce(tem);
             }        
       }
        }
        }
        else
             jLabel10.setText("Try Another Location");        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 System.out.println(flag);
        if(brd.positions[1]==empty){
       if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
     if(flag%2==0)
       {jLabel10.setText("");
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,1);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");
                 db.init("user");
                 new endWindow().setVisible(true);
					}
             if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
             flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 System.out.println(flag);
        if((brd.positions[2]==empty)){
       if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,2);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");
                 db.init("user");
                 new endWindow().setVisible(true);
					}
             if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
              flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
           }      
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 System.out.println(flag);
        if(brd.positions[3]==empty)
 {
     if(!(jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))){
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,3);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");
                 db.init("user");
                 new endWindow().setVisible(true);
					}
             if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
           flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
 System.out.println(flag);
        if(brd.positions[4]==empty)
 {
   if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,4);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");
                 db.init("user");
                 new endWindow().setVisible(true);
					}
             if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
              flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
 System.out.println(flag);
        if(brd.positions[5]==empty){
       if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,5);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");
                 db.init("user");
                 new endWindow().setVisible(true);
					}
             if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
           flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
System.out.println(flag);
        if(brd.positions[6]==empty){
       if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,6);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");                 
                 db.init("user");
                 new endWindow().setVisible(true);
					}
             if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
             flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
 System.out.println(flag);
        if((brd.positions[7]==empty)){
       if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,7);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");
                 db.init("user");
                 new endWindow().setVisible(true);
					}
             if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
             flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
System.out.println(flag);
        if((brd.positions[8]==empty)){
       if(!((jLabel10.getText().equals("COMPUTER  WINS")||(jLabel10.getText().equals("USER WINS"))||(jLabel10.getText().equals("GAME DRAW")))))
        {
        if(flag%2==0)
       {jLabel10.setText("");
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tac.jpg")));
            brd.setMove(brd.p1,8);
            if(brd.checkWinning()){
                 jLabel10.setText("USER WINS");
                 db.init("user");
                 new endWindow().setVisible(true);
					}
              if(flag>=9){
                 jLabel10.setText("GAME DRAW");
                 new endWindow().setVisible(true);
					}
           flag++;
            int tem;
            if((flag<=8)&&!(jLabel10.getText().equals("USER WINS"))){
           tem= brd.AutoMove(brd.p2);
           setResponce(tem);
            }
       }
        }
 }
        else
             jLabel10.setText("Try Another Location");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          newGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
         //       board brd = new board();
              flag=0;
                new ticTak12().setVisible(true);
                //new endWindow().setVisible(true);
            }
        });

    }
public void setResponce(int j){
    switch(j){
         case 0:{jLabel10.setText("");
                  jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,0);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                 if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 1:{jLabel10.setText("");
                  jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,1);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 2:{jLabel10.setText("");
                  jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,2);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 3:{jLabel10.setText("");
                  jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,3);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 4:{jLabel10.setText("");
                  jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,4);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 5:{jLabel10.setText("");
                  jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,5);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 6:{jLabel10.setText("");
                  jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,6);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 7:{jLabel10.setText("");
                  jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,7);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }
         case 8:{jLabel10.setText("");
                  jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/tic.jpg")));
                 brd.setMove(brd.p2,8);
                 if(brd.checkWinning()){
                 jLabel10.setText("COMPUTER  WINS");
                 db.init("computer");
                 new endWindow().setVisible(true);
					}
                   if(flag>=8){
                 jLabel10.setText("GAME DRAW");
					}
                 flag++;
        break;
            }

    }
    
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

 class player{
	private char symbol;
	private int location[];
	int z=0;
	public player(char sym){
		symbol = sym;
		location = new int[9];
		z=0;

	}
	public char getSymbol(){
		return symbol;
	}
	public int[] getLocation(){
		return location;
	}
	public void addLocation(int loc){
		location[z]=loc;
		z++;
	}

}
//======================================================================================

class board{
	player p1;
	player p2;
        Random rand=new Random();
	 public static char positions[];
	char empty = '_';
	public board(){
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
public int AutoMove(player p){
		int j=0;
		
			do{j=0;
				j = rand.nextInt(8);  
                                 //System.out.print(j);
			}while((positions[j]!=empty));
			setMove(p, j);
                        return j;
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



