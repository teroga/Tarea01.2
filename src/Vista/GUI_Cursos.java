
package Vista;

import Controlador.Controlador_GUI_Cursos;


public class GUI_Cursos extends javax.swing.JFrame {
    Controlador_GUI_Cursos controlCursos;

    public GUI_Cursos() {
        controlCursos = new Controlador_GUI_Cursos(this);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(false);
            }
          });
        
        initComponents();
        this.jb_Registrar.addActionListener(controlCursos);
        this.jb_Consultar.addActionListener(controlCursos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Cedula = new javax.swing.JLabel();
        jt_cedula = new javax.swing.JTextField();
        jl_Nombre = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jb_Consultar = new javax.swing.JButton();
        jb_Registrar = new javax.swing.JButton();
        jl_nombreCurso = new javax.swing.JLabel();
        jt_nombreCurso = new javax.swing.JTextField();
        jl_Sigla = new javax.swing.JLabel();
        jt_Sigla = new javax.swing.JTextField();
        jl_creditos = new javax.swing.JLabel();
        jt_creditos = new javax.swing.JTextField();

        jl_Cedula.setText("Cédula");

        jl_Nombre.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/girasol.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jb_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jb_Consultar.setText("Consultar");

        jb_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jb_Registrar.setText("Registrar");

        jl_nombreCurso.setText("Nombre Curso:");

        jl_Sigla.setText("Sigla:");

        jl_creditos.setText("Número de Créditos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jb_Consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Registrar)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jl_Sigla)
                        .addComponent(jl_creditos))
                    .addComponent(jl_nombreCurso, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Sigla, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_nombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_nombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nombreCurso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Sigla)
                    .addComponent(jt_Sigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_creditos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Consultar)
                    .addComponent(jb_Registrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jb_Consultar;
    private javax.swing.JButton jb_Registrar;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Sigla;
    private javax.swing.JLabel jl_creditos;
    private javax.swing.JLabel jl_nombreCurso;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Sigla;
    private javax.swing.JTextField jt_cedula;
    private javax.swing.JTextField jt_creditos;
    private javax.swing.JTextField jt_nombreCurso;
    // End of variables declaration//GEN-END:variables


public String getJt_NombreCurso(){
    return jt_nombreCurso.getText();
}
    public void setJt_NombreCurso(String jt_nombreCurso){
        this.jt_nombreCurso.setText(jt_nombreCurso);
    }
public void setJt_Sigla(String jt_Sigla){
    this.jt_Sigla.setText(jt_Sigla);
}

public String getJt_Sigla(){
    return jt_Sigla.getText();
}

public void setJt_Creditos(String jt_creditos){
    this.jt_creditos.setText(jt_creditos);
}

public String getJt_Creditos(){
    return jt_creditos.getText();
}

}//FIN
