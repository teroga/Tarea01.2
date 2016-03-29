package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MetodosCursos {
 
    ArrayList<Cursos> arrayCursos;
    private String nombreCurso="";
    private String sigla="";
    private int creditos=0;
    
    public MetodosCursos(){
    arrayCursos = new ArrayList <Cursos>();
    }
    
    public String[] devolverInformacion(String sigla){
    String arreglo[]=new String[2];
    for(int contador=0; contador<arrayCursos.size();contador++){
    if(arrayCursos.get(contador).getSigla().equals(sigla)){
    arreglo[0]=arrayCursos.get(contador).getNombreCurso();
    arreglo[1]=""+arrayCursos.get(contador).getCreditos();
    }
    }
    return arreglo;
    }
    
    public void ingresarCurso(String nombreCurso, String sigla, int creditos){
        arrayCursos.add(new Cursos(nombreCurso, sigla, creditos));
        JOptionPane.showMessageDialog(null, "El curso fue agregado correctamente");
    }
    
    public boolean consultarCurso(String sigla){
    boolean encontro=false;
         for(int contador=0; contador<arrayCursos.size();contador++){
         if(arrayCursos.get(contador)!=null){
             if(arrayCursos.get(contador).getSigla().equals(sigla)){
    this.setSigla(sigla);
               setNombreCurso(arrayCursos.get(contador).getNombreCurso());
               setSigla(arrayCursos.get(contador).getSigla());
               setCreditos(arrayCursos.get(contador).getCreditos());
               encontro=true;
             }
         }
         }
             if(encontro){
          JOptionPane.showMessageDialog(null, "ENHORABUENA\nHa encontrado el curso qe perdió");
                     return true;
                 }
                 else{
                 JOptionPane.showMessageDialog(null, "ERROR\nSu curso sigue perdido");
                 return false;
                 }
                 }
    
       public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the nombreCurso
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }
    
    
}
