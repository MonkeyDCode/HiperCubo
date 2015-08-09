
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame {
    int bandera=0;

    public Ventana() {
        initComponents();
        paint(this.panelDibujo.getGraphics());
        this.jButton1.setEnabled(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDibujo = new javax.swing.JPanel();
        botonTrazar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        colorOrigen = new javax.swing.JLabel();
        colorDestno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonTrazar.setText("Trazar ruta");
        botonTrazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrazarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Origen");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Destino");

        txtOrigen.setBackground(new java.awt.Color(255, 255, 0));
        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrigenKeyTyped(evt);
            }
        });

        txtDestino.setBackground(new java.awt.Color(51, 255, 51));
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoKeyTyped(evt);
            }
        });

        jButton1.setText("limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("0");

        jLabel4.setText("1");

        jLabel5.setText("2");

        jLabel6.setText("3");

        jLabel7.setText("4");

        jLabel8.setText("6");

        jLabel9.setText("5");

        jLabel10.setText("7");

        jLabel11.setText("15");

        jLabel12.setText("13");

        jLabel13.setText("12");

        jLabel14.setText("14");

        jLabel15.setText("10");

        jLabel16.setText("11");

        jLabel17.setText("8");

        jLabel18.setText("9");

        javax.swing.GroupLayout panelDibujoLayout = new javax.swing.GroupLayout(panelDibujo);
        panelDibujo.setLayout(panelDibujoLayout);
        panelDibujoLayout.setHorizontalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDibujoLayout.createSequentialGroup()
                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDibujoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorOrigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDibujoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(13, 13, 13))))
                    .addGroup(panelDibujoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDibujoLayout.createSequentialGroup()
                        .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDibujoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(panelDibujoLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelDibujoLayout.createSequentialGroup()
                        .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDibujoLayout.createSequentialGroup()
                                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(panelDibujoLayout.createSequentialGroup()
                                        .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5))
                                        .addGap(25, 25, 25)))
                                .addGap(18, 18, 18)
                                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDibujoLayout.createSequentialGroup()
                                        .addComponent(colorDestno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)))
                            .addGroup(panelDibujoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDibujoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18)
                                    .addComponent(botonTrazar)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87))
                            .addGroup(panelDibujoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(102, 102, 102))))))
        );
        panelDibujoLayout.setVerticalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDibujoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonTrazar)
                        .addComponent(jLabel1)
                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(colorOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorDestno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDibujoLayout.createSequentialGroup()
                        .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel17))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDibujoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(47, 47, 47)))
                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(89, 89, 89)
                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDibujo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.paint(this.getGraphics());
        this.txtDestino.setText("");
        this.txtOrigen.setText("");
        this.jButton1.setEnabled(false);
        this.botonTrazar.setEnabled(true);
        bandera =0;
        this.paint(this.getGraphics());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyTyped
        char car = evt.getKeyChar();
        if(txtDestino.getText().length()>=2) evt.consume();
        if(txtDestino.getText().length()>0)
        {
            if (txtDestino.getText().equals("1"))
            {
                if((car<'0' || car>'5')) evt.consume();
            }
            else evt.consume();
        }
        else if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyTyped
        char car = evt.getKeyChar();
        if(txtOrigen.getText().length()>=2) evt.consume();
        if(txtOrigen.getText().length()>0)
        {
            if (txtOrigen.getText().equals("1"))
            {
                if((car<'0' || car>'5')) evt.consume();
            }
            else evt.consume();
        }
        else if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtOrigenKeyTyped

    private void botonTrazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrazarActionPerformed

        if(!this.txtDestino.getText().equals("") && !this.txtOrigen.getText().equals(""))
        {

            bandera=1;
            this.paint(this.getGraphics());
            this.jButton1.setEnabled(true);
            this.botonTrazar.setEnabled(false);

        }
    }//GEN-LAST:event_botonTrazarActionPerformed

    
    @Override
    public void paint( Graphics g)
    {
        super.paint(g);
        
        g.setColor(Color.red);
        //primer cuadro
        Lineas.hacerLinea(g, 40, 140 ,200, 140);
        Lineas.hacerLinea(g, 40, 140 ,40, 300);
        Lineas.hacerLinea(g, 40, 300 ,200, 300);
        Lineas.hacerLinea(g, 200, 300 ,200, 140);
        g.setColor(Color.MAGENTA);
        g.fillOval(33, 133, 14, 14);
        g.fillOval(193, 133, 14, 14);
        g.fillOval(33, 293, 14, 14);
        g.fillOval(193, 293, 14, 14);
        //segundo cuadro
        g.setColor(Color.red);
        Lineas.hacerLinea(g, 100, 200 ,260, 200);
        Lineas.hacerLinea(g, 100, 200 ,100, 360);
        Lineas.hacerLinea(g, 100, 360 ,260, 360);
        Lineas.hacerLinea(g, 260, 360 ,260, 200);
        g.setColor(Color.MAGENTA);
        g.fillOval(93, 193, 14, 14);
        g.fillOval(253, 193, 14, 14);
        g.fillOval(93, 353, 14, 14);
        g.fillOval(253, 353, 14, 14);
        //union del los cuadros uno y dos
        g.setColor(Color.red);
        Lineas.hacerLinea(g, 40, 140 ,100, 200);
        Lineas.hacerLinea(g, 200, 140 ,260, 200);
        Lineas.hacerLinea(g, 40, 300 ,100, 360);
        Lineas.hacerLinea(g, 200, 300 ,260, 360);

        //tercer cuadro
        g.setColor(Color.red);
        Lineas.hacerLinea(g, 340, 140 ,500, 140);
        Lineas.hacerLinea(g, 340, 140 ,340, 300);
        Lineas.hacerLinea(g, 340, 300 ,500, 300);
        Lineas.hacerLinea(g, 500, 300 ,500, 140);
        g.setColor(Color.MAGENTA);
        g.fillOval(333, 133, 14, 14);
        g.fillOval(493, 133, 14, 14);
        g.fillOval(333, 293, 14, 14);
        g.fillOval(493, 293, 14, 14);
        //cuarto cuadro
        g.setColor(Color.red);
        Lineas.hacerLinea(g, 400, 200 ,560, 200);
        Lineas.hacerLinea(g, 400, 200 ,400, 360);
        Lineas.hacerLinea(g, 400, 360 ,560, 360);
        Lineas.hacerLinea(g, 560, 360 ,560, 200);
        g.setColor(Color.MAGENTA);
        g.fillOval(393, 193, 14, 14);
        g.fillOval(553, 193, 14, 14);
        g.fillOval(393, 353, 14, 14);
        g.fillOval(553, 353, 14, 14);
        //union del los cuadros uno y dos
        g.setColor(Color.red);
        Lineas.hacerLinea(g, 340, 140 ,400, 200);
        Lineas.hacerLinea(g, 500, 140 ,560, 200);
        Lineas.hacerLinea(g, 340, 300 ,400, 360);
        Lineas.hacerLinea(g, 500, 300 ,560, 360);
        
        
        Lineas.hacerCurva(g, 40, 140, 340, 140);
        Lineas.hacerCurva(g, 100, 200, 400, 200);
        Lineas.hacerCurva(g, 200, 140, 500, 140);
        Lineas.hacerCurva(g, 260, 200, 560, 200);
        Lineas.hacerCurva(g, 40, 300, 340, 300);
        Lineas.hacerCurva(g, 100, 360, 400, 360);
        Lineas.hacerCurva(g, 200, 300, 500, 300);
        Lineas.hacerCurva(g, 260, 360, 560, 360);
        
        
        if(bandera ==1)
        {
            int cO = Integer.parseInt(this.txtOrigen.getText());
            int cD = Integer.parseInt(this.txtDestino.getText());
            
            String cOB =Coordenadas.decimalABinario(cO);
            String cDB =Coordenadas.decimalABinario(cD);
            
            g.setColor(Color.yellow);
            Lineas.hacerOrigen(g,Coordenadas.getX(cO) ,Coordenadas.getY(cO) );
            
            g.setColor(Color.blue);
            char a=cOB.charAt(3);
            char b = cDB.charAt(3);

            if(a!=b){
                Lineas.hacerLinea(g, Coordenadas.getX(cO),Coordenadas.getY(cO), Coordenadas.getHorizontalX(cO), Coordenadas.getHorizontalY(cO));
                g.fillOval(Coordenadas.getHorizontalX(cO)-7, Coordenadas.getHorizontalY(cO)-7, 14, 14);
                cO=Coordenadas.getNextHorizontal(cO);
            }
            a=cOB.charAt(2);
            b = cDB.charAt(2);
           
            if(a!=b){
                Lineas.hacerLinea(g, Coordenadas.getX(cO),Coordenadas.getY(cO), Coordenadas.getDiagonalX(cO), Coordenadas.getDiagonalY(cO));
                g.fillOval(Coordenadas.getDiagonalX(cO)-7, Coordenadas.getDiagonalY(cO)-7, 14, 14);
                cO=Coordenadas.getNextDiagonal(cO);
            }
                
            a=cOB.charAt(1);
            b = cDB.charAt(1);
            
            if(a!=b)
            {
                Lineas.hacerLinea(g, Coordenadas.getX(cO),Coordenadas.getY(cO), Coordenadas.getVerticalX(cO), Coordenadas.getVerticalY(cO));
                g.fillOval(Coordenadas.getVerticalX(cO)-7, Coordenadas.getVerticalY(cO)-7, 14, 14);
                cO=Coordenadas.getNextVertical(cO);
            }
            
            a=cOB.charAt(0);
            b = cDB.charAt(0);
            if(a!=b)
            {
                 Lineas.hacerCurva(g, Coordenadas.getX(cO),Coordenadas.getY(cO), Coordenadas.getCurvaX(cO), Coordenadas.getCurvaY(cO));
                 g.fillOval(Coordenadas.getCurvaX(cO)-7, Coordenadas.getCurvaY(cO)-7, 14, 14);
            }
            
            g.setColor(Color.green);
            Lineas.hacerOrigen(g,Coordenadas.getX(cD) ,Coordenadas.getY(cD) );
            
            
        }
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonTrazar;
    private javax.swing.JLabel colorDestno;
    private javax.swing.JLabel colorOrigen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelDibujo;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
