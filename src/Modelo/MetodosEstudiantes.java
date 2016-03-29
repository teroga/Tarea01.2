
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;



public class MetodosEstudiantes {
    ArrayList<Estudiante> arrayEstudiantes;
    private String cedula="";
    private String nombre="";
    
    public MetodosEstudiantes(){
    arrayEstudiantes = new ArrayList <Estudiante>();

}
    
    public String[] devolverInformacion(String cedula){
    String arreglo[]=new String[2];
    for(int contador=0; contador<arrayEstudiantes.size();contador++){
    if(arrayEstudiantes.get(contador).getCedula().equals(cedula)){
    arreglo[0]=arrayEstudiantes.get(contador).getNombre();
    }
    }
    return arreglo;
    }
    
    public void ingresarEstudiante(String cedula, String nombre){
        arrayEstudiantes.add(new Estudiante(cedula, nombre));
        JOptionPane.showMessageDialog(null, "El estudiante fue agregado correctamente");
    }
    
    public void modificarEstudiante(String cedula, String nombre){
      for(int contador=0; contador<arrayEstudiantes.size();contador++){
    if(arrayEstudiantes.get(contador)!=null){
    if(arrayEstudiantes.get(contador).getCedula().equals(cedula)){
        arrayEstudiantes.get(contador).setNombre(nombre);
        JOptionPane.showMessageDialog(null, "El estudiante fue modificado correctamente");
    }
    }
    }
    }
   
    public void eliminarEstudiante(String cedula){
     for(int contador=0; contador<arrayEstudiantes.size();contador++){
    if(arrayEstudiantes.get(contador)!=null){
    if(arrayEstudiantes.get(contador).getCedula().equals(cedula)){
    arrayEstudiantes.remove(contador);
        JOptionPane.showMessageDialog(null, "El estudiante fue eliminado correctamente");
    } 
    }
    }
    }
    
    public boolean consultarEstudiante(String cedula){
    boolean encontro=false;
         for(int contador=0; contador<arrayEstudiantes.size();contador++){
             if(arrayEstudiantes.get(contador).getCedula().equals(cedula)){
    this.setCedula(cedula);
               setNombre(arrayEstudiantes.get(contador).getNombre());
               setCedula(arrayEstudiantes.get(contador).getCedula());
               encontro=true;
             }
         
         }
             if(encontro){
          JOptionPane.showMessageDialog(null, "Ha encontrado al estudiante qe perdió");
                     return true;
                 }
                 else{
                 JOptionPane.showMessageDialog(null, "Su estudiante sigue perdido");
                 return false;
                 }
                 }
    
    
        public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


 
    public String getCedula() {
        return cedula;
    }

   
    public String getNombre() {
        return nombre;
    }
    
}//FIN