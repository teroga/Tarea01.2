
package Modelo;

public class Estudiante {
    
    private String cedula;
    private String nombre;
    
    public Estudiante (String cedula, String nombre){
    this.cedula=cedula;
    this.nombre=nombre;
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

   
    
    public String getInformacion(){
    return "Cédula: "+cedula+"\nNombre: "+nombre;
    }
    
    
    
    
    
    
    
}



