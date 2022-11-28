
package Formularios;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author JAIME_06
 */
public class Principal extends javax.swing.JFrame {

    ImagenFondo img = new ImagenFondo();
    
    public Principal() {
        this.setContentPane(img);
        UIManager.put("TextField.border", BorderFactory.createCompoundBorder(
            new CustomeBorder(), 
            new EmptyBorder(new Insets(4,8,4,4))));
        UIManager.put("TextArea.border", BorderFactory.createCompoundBorder(
            new CustomeBorder(), 
            new EmptyBorder(new Insets(4,8,4,4))));
     
        initComponents();
         txtCadena1.setOpaque(false);
         txtCadena2.setOpaque(false);
         btnCargar.setOpaque(false);
         txtNatural.setOpaque(false);
         txtBinario.setOpaque(false);
         txtDescripcion.setOpaque(false);
    }
    
    public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/FONDO BLANCO.png"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);   
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNatural = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txtsigno = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        txt28 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        txt42 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt34 = new javax.swing.JTextField();
        txt35 = new javax.swing.JTextField();
        txt36 = new javax.swing.JTextField();
        txt37 = new javax.swing.JTextField();
        txt38 = new javax.swing.JTextField();
        txt39 = new javax.swing.JTextField();
        txt40 = new javax.swing.JTextField();
        txtCadena1 = new javax.swing.JTextField();
        txt41 = new javax.swing.JTextField();
        btnPaso = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtCadena2 = new javax.swing.JTextField();
        txtBinario = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnNuevo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnCorrer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(109, 109, 109));
        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 109, 109));
        jLabel1.setText("descripcion formal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 295, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diagrama (1).jpeg"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        txtNatural.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 200, -1));

        jLabel4.setBackground(new java.awt.Color(109, 109, 109));
        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setText("INGRESE UN NUMERO NATURAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        btnCargar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(109, 109, 109));
        btnCargar.setText("Cargar");
        btnCargar.setContentAreaFilled(false);
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarMouseEntered(evt);
            }
        });
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        txt1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setToolTipText("");
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 25, -1));

        txt2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setToolTipText("");
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 180, 25, -1));

        txt3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setToolTipText("");
        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 180, 25, -1));

        txt4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setToolTipText("");
        txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 180, 25, -1));

        txt5.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setToolTipText("");
        txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 180, 25, -1));

        txt6.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setToolTipText("");
        txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 25, -1));

        txt7.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7.setToolTipText("");
        txt7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 180, 25, -1));

        txt8.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8.setToolTipText("");
        txt8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 180, 25, -1));

        txt15.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt15.setToolTipText("");
        txt15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 180, 25, -1));

        txt14.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt14.setToolTipText("");
        txt14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt14, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 180, 25, -1));

        txt13.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt13.setToolTipText("");
        txt13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 180, 25, -1));

        txt12.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt12.setToolTipText("");
        txt12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 180, 25, -1));

        txt11.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11.setToolTipText("");
        txt11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 25, -1));

        txtsigno.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtsigno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsigno.setText("+");
        txtsigno.setToolTipText("");
        txtsigno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtsigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 25, -1));

        txt10.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt10.setToolTipText("");
        txt10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 180, 25, -1));

        txt9.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9.setToolTipText("");
        txt9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 180, 25, -1));

        txt20.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt20.setToolTipText("");
        txt20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt20, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 180, 25, -1));

        txt18.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt18.setToolTipText("");
        txt18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 180, 25, -1));

        txt17.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt17.setToolTipText("");
        txt17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt17, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 180, 25, -1));

        txt16.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt16.setToolTipText("");
        txt16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 25, -1));

        txt19.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt19.setToolTipText("");
        txt19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt19, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 180, 25, -1));

        jLabel5.setBackground(new java.awt.Color(109, 109, 109));
        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 109, 109));
        jLabel5.setText("ESTADO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txt21.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt21.setToolTipText("");
        txt21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 25, -1));

        txt22.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22.setToolTipText("");
        txt22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt22, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 210, 25, -1));

        txt23.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt23.setToolTipText("");
        txt23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt23, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 210, 25, -1));

        txt24.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt24.setToolTipText("");
        txt24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt24, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 210, 25, -1));

        txt25.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt25.setToolTipText("");
        txt25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt25, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 210, 25, -1));

        txt26.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt26.setToolTipText("");
        txt26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 25, -1));

        txt27.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt27.setToolTipText("");
        txt27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt27, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 210, 25, -1));

        txt28.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt28.setToolTipText("");
        txt28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt28, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 210, 25, -1));

        txt29.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt29.setToolTipText("");
        txt29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt29, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 210, 25, -1));

        txt30.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt30.setToolTipText("");
        txt30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt30, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 210, 25, -1));

        txt31.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt31.setToolTipText("");
        txt31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt31, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 210, 25, -1));

        txt42.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt42.setToolTipText("");
        txt42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 25, -1));

        txt32.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt32.setToolTipText("");
        txt32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt32, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 210, 25, -1));

        txt33.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt33.setToolTipText("");
        txt33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt33, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 210, 25, -1));

        txt34.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt34.setToolTipText("");
        txt34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt34, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 210, 25, -1));

        txt35.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt35.setToolTipText("");
        txt35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt35, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 25, -1));

        txt36.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt36.setToolTipText("");
        txt36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt36, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 210, 25, -1));

        txt37.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt37.setToolTipText("");
        txt37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt37, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 210, 25, -1));

        txt38.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt38.setToolTipText("");
        txt38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt38, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 210, 25, -1));

        txt39.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt39.setToolTipText("");
        txt39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt39, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 210, 25, -1));

        txt40.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt40.setToolTipText("");
        txt40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt40, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 25, -1));

        txtCadena1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 250, -1));

        txt41.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txt41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt41.setToolTipText("");
        txt41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt41, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 25, -1));

        btnPaso.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnPaso.setForeground(new java.awt.Color(109, 109, 109));
        btnPaso.setText("Paso a Paso");
        btnPaso.setContentAreaFilled(false);
        btnPaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel6.setBackground(new java.awt.Color(109, 109, 109));
        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel6.setText("q0");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(109, 109, 109));
        jSeparator1.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109), 3));
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 55, 70, 5));

        jLabel7.setBackground(new java.awt.Color(109, 109, 109));
        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jLabel7.setText("CADENA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, -1, -1));

        txtCadena2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 120, 250, -1));

        txtBinario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 200, -1));

        btnConvertir.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnConvertir.setForeground(new java.awt.Color(109, 109, 109));
        btnConvertir.setText("Convertir a Binario");
        btnConvertir.setContentAreaFilled(false);
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        jLabel8.setBackground(new java.awt.Color(109, 109, 109));
        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setText("INGRESE DOS NUMEROS BINARIOS ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel2.setBackground(new java.awt.Color(109, 109, 109));
        jLabel2.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 109, 109));
        jLabel2.setText("MAQUINA DE TURING");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 10, 145));

        jSeparator3.setBackground(new java.awt.Color(109, 109, 109));
        jSeparator3.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109), 3));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 70, 5));

        btnNuevo.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(109, 109, 109));
        btnNuevo.setText("Nuevo");
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(109, 109, 109));
        jSeparator4.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109), 3));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 50, 5));

        jSeparator5.setBackground(new java.awt.Color(109, 109, 109));
        jSeparator5.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109), 3));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 50, 5));

        jScrollPane1.setBorder(null);

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Lenguaje =  {w/w  |   0,1*+0,1* }\nAlfabeto = { 0  , 1 }\nEstados = q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10\nEstadoFinal = q5");
        txtDescripcion.setAutoscrolls(false);
        txtDescripcion.setOpaque(false);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 410, 190));

        btnCorrer.setText("Correr");
        btnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerActionPerformed(evt);
            }
        });
        jPanel1.add(btnCorrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    String cadena1,cadena2,aux,aux1,aux2,simbolo;
    String arreglo1[];
    int longitud1,longitud2,total,est=0,apuntador=0;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        est=0;
        txtsigno.setEditable(false);
        txt1.setEditable(false);
        txt2.setEditable(false);
        txt3.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);
        txt6.setEditable(false);
        txt7.setEditable(false);
        txt8.setEditable(false);
        txt9.setEditable(false);
        txt10.setEditable(false);
        txt11.setEditable(false);
        txt12.setEditable(false);
        txt13.setEditable(false);
        txt14.setEditable(false);
        txt15.setEditable(false);
        txt16.setEditable(false);
        txt17.setEditable(false);
        txt18.setEditable(false);
        txt19.setEditable(false);
        txt20.setEditable(false);
        txt41.setEditable(false);
        txt21.setEditable(false);
        txt22.setEditable(false);
        txt23.setEditable(false);
        txt24.setEditable(false);
        txt25.setEditable(false);
        txt26.setEditable(false);
        txt27.setEditable(false);
        txt28.setEditable(false);
        txt29.setEditable(false);
        txt30.setEditable(false);
        txt42.setEditable(false);
        txt31.setEditable(false);
        txt32.setEditable(false);
        txt33.setEditable(false);
        txt34.setEditable(false);
        txt35.setEditable(false);
        txt36.setEditable(false);
        txt37.setEditable(false);
        txt38.setEditable(false);
        txt39.setEditable(false);
        txt40.setEditable(false);
        btnPaso.setEnabled(false);
        txtDescripcion.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if(txtCadena1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Debe Ingresar un Numero Binario");
            txtCadena1.grabFocus();
            return;
        }
        if(txtCadena2.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Debe Ingresar un Numero Binario");
            txtCadena2.grabFocus();
            return;
        }
        
        simbolo = txtsigno.getText();
        aux2 = txtCadena1.getText();//##001
        cadena1 = "##"+aux2; 
        aux1 = txtCadena2.getText();//001
        cadena2 = aux1+" ";
        longitud1 = cadena1.length();
        longitud2 = cadena2.length();
        total = longitud1+longitud2+1;//#001001
        arreglo1 = new String[total+1];//012
        
        for(int i=0;i<longitud1;i++){
           arreglo1[i]=""+cadena1.charAt(i);
        }
        
        arreglo1[longitud1]=""+simbolo.charAt(0);//##001+
        
        for(int j=0+1;j<=longitud2;j++){
            arreglo1[longitud1+j]=""+cadena2.charAt(j-1);//##001+001
        }
        iniciocajas();
        
        btnPaso.setEnabled(true);
        btnCargar.setEnabled(false);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnPasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasoActionPerformed
        llenarCabezal();
        switch(est){
                case 0:{q0();break;}
                case 1:{q1();break;}
                case 2:{q2();break;}
                case 3:{q3();break;}
                case 4:{q4();break;}
                case 5:{q5();break;}
                case 6:{q6();break;}
                case 7:{q7();break;}
                case 8:{q8();break;}
                case 9:{q9();break;}
                case 10:{q10();break;}
        }
    }//GEN-LAST:event_btnPasoActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        
        if(txtNatural.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar un Numero Natural");
            return;
        }
        
        int numero, exp, digito;
        int binario;
       
        String n1= txtNatural.getText();    
        numero= Integer.parseInt(n1);
        exp=0;
        binario=0;
        
        if(numero ==1){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText("000"+Integer.toString( binario) );
            }
       
        if(numero ==2){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText("00"+Integer.toString((int) binario));
           }
       
        if(numero ==3){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText("00"+Integer.toString((int) binario));
       }
       
        if(numero ==4){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText("0"+Integer.toString((int) binario));
       }
       
        if(numero ==5){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText("0"+Integer.toString((int) binario));
       }
       
        if(numero ==6){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText("0"+Integer.toString((int) binario));
       }
        
        if(numero ==7){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText("0"+Integer.toString((int) binario));
       }
       
        if(numero >7){
            while(numero!=0){

                digito = numero % 2;     
                binario = (int) (binario + digito * Math.pow(10, exp));
                exp++;
                numero = numero/2;
            }
            txtBinario.setText(Integer.toString((int) binario));
       }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnPaso.setEnabled(false);
        btnCargar.setEnabled(true);
        txtNatural.setText("");
        txtBinario.setText("");
        txtCadena1.setText("");
        txtCadena2.setText("");
        est=0;
        jLabel6.setText("q"+est);
        llenarCabezal();
        Limpiar();
        txtCadena1.grabFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseEntered
        
    }//GEN-LAST:event_btnCargarMouseEntered

    private void btnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerActionPerformed
        while(est<=11){
            llenarCabezal();
            switch(est){
                case 0:{q0();break;}
                case 1:{q1();break;}
                case 2:{q2();break;}
                case 3:{q3();break;}
                case 4:{q4();break;}
                case 5:{q5();break;}
                case 6:{q6();break;}
                case 7:{q7();break;}
                case 8:{q8();break;}
                case 9:{q9();break;}
                case 10:{q10();break;}
        }
        
        }
    }//GEN-LAST:event_btnCorrerActionPerformed

    void iniciocajas(){
        int pos=0;
        while(pos<total){
            switch(pos){
                case 0:{txt1.setText(arreglo1[0]); break; }
                case 1:{txt2.setText(arreglo1[1]); break; }
                case 2:{txt3.setText(arreglo1[2]); break; }
                case 3:{txt4.setText(arreglo1[3]); break; }
                case 4:{txt5.setText(arreglo1[4]); break; }
                case 5:{txt6.setText(arreglo1[5]); break; }
                case 6:{txt7.setText(arreglo1[6]); break; }
                case 7:{txt8.setText(arreglo1[7]); break; }
                case 8:{txt9.setText(arreglo1[8]); break; }
                case 9:{txt10.setText(arreglo1[9]); break; }
                case 10:{txt11.setText(arreglo1[10]); break; }
                case 11:{txt12.setText(arreglo1[11]); break; }
                case 12:{txt13.setText(arreglo1[12]); break; }
                case 13:{txt14.setText(arreglo1[13]); break; }
                case 14:{txt15.setText(arreglo1[14]); break; }
                case 15:{txt16.setText(arreglo1[15]); break; }
                case 16:{txt17.setText(arreglo1[16]); break; }
                case 17:{txt18.setText(arreglo1[17]); break; }
                case 18:{txt19.setText(arreglo1[18]); break; }
                case 19:{txt20.setText(arreglo1[19]); break; }
                case 20:{txt41.setText(arreglo1[20]); break; } 
            }
            pos++;
        }
        txt21.setText("^");
    }
    
    void llenarCabezal(){
        txt21.setText("-");
        txt22.setText("-");
        txt23.setText("-");
        txt24.setText("-");
        txt25.setText("-");
        txt26.setText("-");
        txt27.setText("-");
        txt28.setText("-");
        txt29.setText("-");
        txt30.setText("-");
        txt31.setText("-");
        txt32.setText("-");
        txt33.setText("-");
        txt34.setText("-");
        txt35.setText("-");
        txt36.setText("-");
        txt37.setText("-");
        txt38.setText("-");
        txt39.setText("-");
        txt40.setText("-");
        txt42.setText("-");
    }
    
    void Limpiar(){
        txt1.setText("-");
        txt2.setText("-");
        txt3.setText("-");
        txt4.setText("-");
        txt5.setText("-");
        txt6.setText("-");
        txt7.setText("-");
        txt8.setText("-");
        txt9.setText("-");
        txt10.setText("-");
        txt11.setText("-");
        txt12.setText("-");
        txt13.setText("-");
        txt14.setText("-");
        txt15.setText("-");
        txt16.setText("-");
        txt17.setText("-");
        txt18.setText("-");
        txt19.setText("-");
        txt20.setText("-");
        txt41.setText("-");
    }
    
    void moverR(){
        apuntador++;
    }
    
    void moverL(){
        apuntador--;
    }
    
    void cabezal(){
        switch(apuntador){
            case 0:{txt21.setText("^"); break; }
            case 1:{txt22.setText("^"); break; }
            case 2:{txt23.setText("^"); break; }
            case 3:{txt24.setText("^"); break; }
            case 4:{txt25.setText("^"); break; }
            case 5:{txt26.setText("^"); break; }
            case 6:{txt27.setText("^"); break; }
            case 7:{txt28.setText("^"); break; }
            case 8:{txt29.setText("^"); break; }
            case 9:{txt30.setText("^"); break; }
            case 10:{txt42.setText("^"); break; }
            case 11:{txt31.setText("^"); break; }
            case 12:{txt32.setText("^"); break; }
            case 13:{txt33.setText("^"); break; }
            case 14:{txt34.setText("^"); break; }
            case 15:{txt35.setText("^"); break; }
            case 16:{txt36.setText("^"); break; }
            case 17:{txt37.setText("^"); break; }
            case 18:{txt38.setText("^"); break; }
            case 19:{txt39.setText("^"); break; }
            case 20:{txt40.setText("^"); break; }
        }
        jLabel6.setText("q"+est);
    }
    
    void actcadena(String dat){
        switch(apuntador){
            case 0:{txt1.setText(dat); break; }
            case 1:{txt2.setText(dat); break; }
            case 2:{txt3.setText(dat); break; }
            case 3:{txt4.setText(dat); break; }
            case 4:{txt5.setText(dat); break; }
            case 5:{txt6.setText(dat); break; }
            case 6:{txt7.setText(dat); break; }
            case 7:{txt8.setText(dat); break; }
            case 8:{txt9.setText(dat); break; }
            case 9:{txt10.setText(dat); break; }
            case 10:{txt11.setText(dat); break; }
            case 11:{txt12.setText(dat); break; }
            case 12:{txt13.setText(dat); break; }
            case 13:{txt14.setText(dat); break; }
            case 14:{txt15.setText(dat); break; }
            case 15:{txt16.setText(dat); break; }
            case 16:{txt17.setText(dat); break; }
            case 17:{txt18.setText(dat); break; }
            case 18:{txt19.setText(dat); break; }
            case 19:{txt20.setText(dat); break; }
            case 20:{txt41.setText(dat); break; }
        }
    }
    
    void q0(){
        cabezal();//##001+001
        aux = arreglo1[apuntador]; 
        if(aux.equals("#")){//lee
            arreglo1[apuntador]="#";//escribe
            actcadena("#");//escribe
            moverR();//moverDERECHA
            est = 0;
        }
        else if(aux.equals("1")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverR();
         est = 0;
        }
        else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverR();
         est = 0;
        }
        else if(aux.equals("+")) 
        {
         arreglo1[apuntador]="+";
         actcadena("+");
         moverR();
         est = 0;
        }
        else if(aux.equals(" ")) 
        {
         arreglo1[apuntador]=" ";
         actcadena(" ");
         moverL();
         est = 1;
        }
    }
    
    void q1(){
        cabezal();
        aux = arreglo1[apuntador]; 
        if(aux.equals("1")) 
        {
         arreglo1[apuntador]="C";
         actcadena("C");
         moverL();
         est = 4;
        }
        else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="C";
         actcadena("C");
         moverL();
         est = 3;
        }
        else if(aux.equals("+")) 
        {
         arreglo1[apuntador]=" ";
         actcadena(" ");
         moverL();
         est = 2;
        }
    }
    
    void q2(){
        cabezal();
        aux = arreglo1[apuntador]; 
        if(aux.equals("1")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverL();
         est = 2;
        }
        else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverL();
         est = 2;
        }
        else if(aux.equals("O")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverL();
         est = 2;
        }
         else if(aux.equals("I")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverL();
         est = 2;
        }
        else if(aux.equals("#")) 
        {
         arreglo1[apuntador]="#";
         actcadena("#");
         moverR();
         est = 5;
        }
    }
   
    void q3(){
       cabezal();
        aux = arreglo1[apuntador]; 
        if(aux.equals("1")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverL();
         est = 3;
        }
        else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverL();
         est = 3;
        }
        else if(aux.equals("+")) 
        {
         arreglo1[apuntador]="+";
         actcadena("+");
         moverL();
         est = 6;
        } 
    }
    
    void q4(){
        cabezal();
        aux = arreglo1[apuntador]; 
        if(aux.equals("1")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverL();
         est = 4;
        }
        else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverL();
         est = 4;
        }
        else if(aux.equals("+")) 
        {
         arreglo1[apuntador]="+";
         actcadena("+");
         moverL();
         est = 8;
        } 
    }
    
    void q5(){
        cabezal();
        JOptionPane.showMessageDialog(rootPane, "CADENA ACEPTADA...");  
        jLabel6.setText("Q"+est);
        est=11;
        
    }
    
    void q6(){
        cabezal();
        aux = arreglo1[apuntador]; 
        if(aux.equals("I")) 
        {
         arreglo1[apuntador]="I";
         actcadena("I");
         moverL();
         est = 6;
        }
        else if(aux.equals("O")) 
        {
         arreglo1[apuntador]="O";
         actcadena("O");
         moverL();
         est = 6;
        }
         else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="O";
         actcadena("O");
         moverR();
         est = 7;
        }
        else if(aux.equals("1")) 
        {
         arreglo1[apuntador]="I";
         actcadena("I");
         moverR();
         est = 7;
        } 
        else if(aux.equals(" ")) 
        {
         arreglo1[apuntador]="O";
         actcadena("O");
         moverR();
         est = 7;
        }   
    }
    
    void q7(){
        cabezal();
        aux = arreglo1[apuntador]; 
        if(aux.equals("I")) 
        {
         arreglo1[apuntador]="I";
         actcadena("I");
         moverR();
         est = 7;
        }
        else if(aux.equals("O")) 
        {
         arreglo1[apuntador]="O";
         actcadena("O");
         moverR();
         est = 7;
        }
         else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverR();
         est = 7;
        }
        else if(aux.equals("1")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverR();
         est = 7;
        } 
        else if(aux.equals("+")) 
        {
         arreglo1[apuntador]="+";
         actcadena("+");
         moverR();
         est = 7;
        }  
        else if(aux.equals("C")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverL();
         est = 1;
        } 
    }
    
    void q8(){
        cabezal();
        aux = arreglo1[apuntador]; 
        if(aux.equals("I")) 
        {
         arreglo1[apuntador]="I";
         actcadena("I");
         moverL();
         est = 8;
        }
         else if(aux.equals("O")) 
        {
         arreglo1[apuntador]="O";
         actcadena("O");
         moverL();
         est = 8;
        }
        else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="I";
         actcadena("I");
         moverR();
         est = 10;
        }
         else if(aux.equals("#")) 
        {
         arreglo1[apuntador]="I";
         actcadena("I");
         moverR();
         est = 10;
        }
        else if(aux.equals("1")) 
        {
         arreglo1[apuntador]="O";
         actcadena("O");
         moverL();
         est = 9;
        } 
    }
    
    void q9(){
        cabezal();
         aux = arreglo1[apuntador]; 
        if(aux.equals("1")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverL();
         est = 9;
        }
         else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverR();
         est = 10;
        }
        else if(aux.equals("#")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverR();
         est = 10;
        }
    }
    
    void q10(){
         cabezal();
         aux = arreglo1[apuntador]; 
        if(aux.equals("1")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverR();
         est = 10;
        }
         else if(aux.equals("0")) 
        {
         arreglo1[apuntador]="0";
         actcadena("0");
         moverR();
         est = 10;
        }
        else if(aux.equals("+")) 
        {
         arreglo1[apuntador]="+";
         actcadena("+");
         moverR();
         est = 10;
        }
            else if(aux.equals("O")) 
        {
         arreglo1[apuntador]="O";
         actcadena("O");
         moverR();
         est = 10;
        }
        else if(aux.equals("I")) 
        {
         arreglo1[apuntador]="I";
         actcadena("I");
         moverR();
         est = 10;
        }
         else if(aux.equals("C")) 
        {
         arreglo1[apuntador]="1";
         actcadena("1");
         moverL();
         est = 1;
        }
    }
    
   @SuppressWarnings("serial")
    public static class CustomeBorder extends AbstractBorder{
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        super.paintBorder(c, g, x, y, width, height);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(null);
        Shape shape = new RoundRectangle2D.Float(0, 0, c.getWidth()-1, c.getHeight()-1,20, 20);
        g2d.draw(shape);  
    }
}
   
 
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnCorrer;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPaso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt39;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt40;
    private javax.swing.JTextField txt41;
    private javax.swing.JTextField txt42;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtBinario;
    private javax.swing.JTextField txtCadena1;
    private javax.swing.JTextField txtCadena2;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNatural;
    private javax.swing.JTextField txtsigno;
    // End of variables declaration//GEN-END:variables
}
