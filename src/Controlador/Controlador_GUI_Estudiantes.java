
package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.GUI_Estudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador_GUI_Estudiantes implements ActionListener {
    GUI_Estudiante ventanaEstudiante;
    MetodosEstudiantes metodosEstudiante;
    public Controlador_GUI_Estudiantes(GUI_Estudiante ventanaEstudiante){
        this.ventanaEstudiante=ventanaEstudiante;
        metodosEstudiante=new MetodosEstudiantes();
    }
    public void actionPerformed(ActionEvent evento){
        
         if(evento.getActionCommand().equals("Agregar")){
           if(!ventanaEstudiante.getJt_Cedula().equals(""))
           {
           metodosEstudiante.ingresarEstudiante(ventanaEstudiante.getJt_Cedula(), ventanaEstudiante.getJt_Nombre());
           } 
           else{
           JOptionPane.showMessageDialog(null, "Por favor digite una cédula antes de agregar.");    
           }
        }
         
                if(evento.getActionCommand().equals("Eliminar")){
           if(!ventanaEstudiante.getJt_Cedula().equals(""))
           {
           metodosEstudiante.eliminarEstudiante(ventanaEstudiante.getJt_Cedula());
           } 
           else{
           JOptionPane.showMessageDialog(null, "Por favor digite una cédula antes de eliminar.");    
           }
        }
         
         
        
         if(evento.getActionCommand().equals("Modificar")){
           if(!ventanaEstudiante.getJt_Cedula().equals(""))
           {
           metodosEstudiante.modificarEstudiante(ventanaEstudiante.getJt_Cedula(), ventanaEstudiante.getJt_Nombre());
           } 
           else{
           JOptionPane.showMessageDialog(null, "Por favor digite una cédula antes de modificar.");    
           }
        }
        
        
        if(evento.getActionCommand().equals("Buscar")){
            buscar();
        }
    }
    
    public void buscar()
   {
      if(!ventanaEstudiante.getJt_Cedula().equals(""))
           {
               if(metodosEstudiante.consultarEstudiante(ventanaEstudiante.getJt_Cedula()))
               {
                   ventanaEstudiante.setJt_Nombre(metodosEstudiante.getNombre());
               }
           }
           else
           {
           JOptionPane.showMessageDialog(null, "Por favor digite una cédula antes de buscar.");
           }
   }//Fin del método buscar
    
    
    
    
    
    
}//FIN
