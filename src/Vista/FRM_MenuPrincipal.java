package Vista;

import Controlador.Controlador_VentanaPrincipal;


public class FRM_MenuPrincipal extends javax.swing.JFrame {
    Controlador_VentanaPrincipal ventanaPrincipal;
    GUI_Estudiante ventanaEstudiante;
    GUI_Cursos ventanaCursos;
    

   
    public FRM_MenuPrincipal() {
        ventanaEstudiante=new GUI_Estudiante();
        ventanaCursos=new GUI_Cursos();
        ventanaPrincipal=new Controlador_VentanaPrincipal(this);
        initComponents();
        this.setLocation(250, 150);
        
        this.jm_estudiantes.addActionListener(ventanaPrincipal);
        this.jm_cursos.addActionListener(ventanaPrincipal);
        
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jl_fondo = new javax.swing.JLabel();
        jm_archivo = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_salir = new javax.swing.JMenu();
        jm_mantenimientos = new javax.swing.JMenu();
        jm_estudiantes = new javax.swing.JMenuItem();
        jm_cursos = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N

        jMenu1.setText("Archivo");

        jm_salir.setText("Salir");
        jMenu1.add(jm_salir);

        jm_archivo.add(jMenu1);

        jm_mantenimientos.setText("Mantenimientos");

        jm_estudiantes.setText("Estudiantes");
        jm_mantenimientos.add(jm_estudiantes);

        jm_cursos.setText("Cursos");
        jm_mantenimientos.add(jm_cursos);

        jm_archivo.add(jm_mantenimientos);

        setJMenuBar(jm_archivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_fondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel jl_fondo;
    private javax.swing.JMenuBar jm_archivo;
    private javax.swing.JMenuItem jm_cursos;
    private javax.swing.JMenuItem jm_estudiantes;
    private javax.swing.JMenu jm_mantenimientos;
    private javax.swing.JMenu jm_salir;
    // End of variables declaration//GEN-END:variables
}
