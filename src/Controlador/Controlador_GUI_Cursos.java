
package Controlador;

import Modelo.MetodosCursos;
import Vista.GUI_Cursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador_GUI_Cursos implements ActionListener {
 GUI_Cursos ventanaCursos;
 MetodosCursos metodosCursos;  
 public Controlador_GUI_Cursos(GUI_Cursos ventanaCursos){
        this.ventanaCursos=ventanaCursos;
        metodosCursos=new MetodosCursos();
    }
 
 public void actionPerformed(ActionEvent evento){
        
         if(evento.getActionCommand().equals("Registrar")){
          if(!ventanaCursos.getJt_Sigla().equals(""))
           {
           metodosCursos.ingresarCurso(ventanaCursos.getJt_NombreCurso(), ventanaCursos.getJt_Sigla(), Integer.parseInt(ventanaCursos.getJt_Creditos()));
           } 
           else{
           JOptionPane.showMessageDialog(null, "Por favor digite una sigla antes de agregar.");  
           }
         }
         
        if(evento.getActionCommand().equals("Consultar")){
            
        } 
         
         
 }
    
 
 
}//FIN
