package Controlador;

import Vista.FRM_MenuPrincipal;
import Vista.GUI_Estudiante;
import Vista.GUI_Cursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class Controlador_VentanaPrincipal implements ActionListener {
    FRM_MenuPrincipal menuPrincipal;
    GUI_Cursos ventanaCursos;
    GUI_Estudiante ventanaEstudiante;
    public Controlador_VentanaPrincipal(FRM_MenuPrincipal menuPrincipal){
      this.menuPrincipal = menuPrincipal;  
      ventanaEstudiante = new GUI_Estudiante();
      ventanaCursos = new GUI_Cursos();
    }

    public void actionPerformed(ActionEvent evento){
        if(evento.getActionCommand().equals("Estudiantes")){
          ventanaEstudiante.setVisible(true);
         }
        if(evento.getActionCommand().equals("Cursos")){
            JOptionPane.showMessageDialog(null, "HOLA TU");
            ventanaCursos.setVisible(true);
        
    }
    
}
}
