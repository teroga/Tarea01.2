
package Vista;

import Controlador.Controlador_GUI_Estudiantes;

public class GUI_Estudiante extends javax.swing.JFrame {

    Controlador_GUI_Estudiantes controlEstudiante;
    
    
    public GUI_Estudiante() {
        controlEstudiante = new Controlador_GUI_Estudiantes(this);                
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(false);
            }
        });
        initComponents();
        this.jb_Agregar.addActionListener(controlEstudiante);
        this.jb_Modificar.addActionListener(controlEstudiante);
        this.jb_Eliminar.addActionListener(controlEstudiante);
        this.jb_buscar.addActionListener(controlEstudiante);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Cedula = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jt_cedula = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jb_buscar = new javax.swing.JButton();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_Cedula.setText("Cédula");

        jl_Nombre.setText("Nombre");

        jb_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jb_buscar.setText("Buscar");

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jb_Agregar.setText("Agregar");

        jb_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        jb_Modificar.setText("Modificar");

        jb_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jb_Eliminar.setText("Eliminar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/girasol (1).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/girasol.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_Agregar)
                        .addGap(149, 149, 149)
                        .addComponent(jb_Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_Eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Nombre)
                                .addGap(18, 18, 18)
                                .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Cedula)
                                .addGap(18, 18, 18)
                                .addComponent(jt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Cedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_buscar)
                    .addComponent(jb_Agregar)
                    .addComponent(jb_Modificar)
                    .addComponent(jb_Eliminar))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_cedula;
    // End of variables declaration//GEN-END:variables

public String getJt_Cedula(){
    return jt_cedula.getText();
}
    public void setJt_Cedula(String jt_cedula){
        this.jt_cedula.setText(jt_cedula);
    }
public void setJt_Nombre(String jt_Nombre){
    this.jt_Nombre.setText(jt_Nombre);
}

public String getJt_Nombre(){
    return jt_Nombre.getText();
}





}//FIN
