
package Modelo;

public class Matricula {
    
    private String carnet="";
    private String sigla="";
    
    public Matricula(String carnet, String sigla){
    this.carnet=carnet;
    this.sigla=sigla;
    }
    
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

   
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

   
    public String getCarnet() {
        return carnet;
    }

    
    public String getSigla() {
        return sigla;
    }
    
    
}//FIN