package Modelo;
public class Cursos {
  
    private String nombreCurso;
    private String sigla;
    private int creditos;
    
    public Cursos(String nombreCurso, String sigla, int creditos){
    this.nombreCurso=nombreCurso;
    this.sigla=sigla;
    this.creditos=creditos;
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
    
    
   public String getInformacionCurso(){
   return "Nombre del curso: "+nombreCurso+"\nSiglas: "+sigla+"\nCréditos: "+creditos;
   } 
    
}//FIN
