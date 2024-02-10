/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package janela;

/**
 *
 * @author kaleb
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form barrinha
     */
    public JanelaPrincipal() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/janela/logo.png")).getImage());
    }

    CadastroGUI cadastro = new CadastroGUI();
    Loguin janela2 = new Loguin();
    Search janela3 = new Search();
    Sobree janela4 = new Sobree();
    SistemaLista lista = new SistemaLista();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoTecnok = new javax.swing.JLabel();
        caixaBusca = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        sistemaMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpSobre = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TecnoK Industries");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Industries");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 120, 80, 22);

        logoTecnok.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        logoTecnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/janela/tec.png"))); // NOI18N
        logoTecnok.setText("jLabel2");
        logoTecnok.setMaximumSize(new java.awt.Dimension(300, 400));
        jPanel1.add(logoTecnok);
        logoTecnok.setBounds(32, 30, 430, 114);

        caixaBusca.setForeground(new java.awt.Color(153, 153, 153));
        caixaBusca.setText("Buscar Produto...");
        caixaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(caixaBusca);
        caixaBusca.setBounds(32, 201, 430, 30);

        bBuscar.setText("Buscar");
        bBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(bBuscar);
        bBuscar.setBounds(210, 240, 80, 40);

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 330);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro");
        fileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sistemaMenuItem.setMnemonic('o');
        sistemaMenuItem.setText("Sistema");
        sistemaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(sistemaMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Usuario");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpSobre.setMnemonic('h');
        helpSobre.setText("Funções");
        helpSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Cadastrar");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpSobre.add(aboutMenuItem);

        jMenuItem1.setText("Consultar");
        helpSobre.add(jMenuItem1);

        jMenuItem2.setText("Deletar");
        helpSobre.add(jMenuItem2);

        menuBar.add(helpSobre);

        jMenu1.setText("Ajuda");

        jMenuItem3.setText("Manual");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Sobre");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void sistemaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaMenuItemActionPerformed
        // TODO add your handling code here:
        lista.setVisible(true);
        
    }//GEN-LAST:event_sistemaMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void caixaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaBuscaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_caixaBuscaActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
        janela2.setVisible(true);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        janela3.setVisible(true);
    }//GEN-LAST:event_bBuscarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        janela4.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton bBuscar;
    private javax.swing.JTextField caixaBusca;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoTecnok;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem sistemaMenuItem;
    // End of variables declaration//GEN-END:variables

}
