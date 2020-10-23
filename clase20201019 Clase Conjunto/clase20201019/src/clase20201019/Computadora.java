package clase20201019;

import java.util.ArrayList;

public class Computadora {
    //Atributos
    private String marca;
    private int ram;
    private int disco;    
    //atributo tipo conjunto
    private ArrayList<String> programas=new ArrayList(); //siempre instanciar el arraylist
    
    //constructores
    public Computadora(){        
    }
    
    public Computadora(String m){
        marca=m;
    }
    
    public Computadora(String m, int r, int d){
        marca=m;
        ram=r;
        disco=d;
    }
    
    //mutadores
    public void setMarca(String m){
        marca=m;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setRam(int r){
        ram=r;
    }
    
    public int getRam(){
        return ram;
    }
    
    public void setDisco(int d){
        disco=d;
    }
    
    public int getDisco(){
        return disco;
    }
    
    public void setProgramas(ArrayList<String> p){
        programas=p;
    }
    
    public void setPrograma(String p){
        programas.add(p);
    }
    
    public ArrayList<String> getProgramas(){
        return programas;
    }
    
    public String getPrograma(int p){
        if (p>=0 && p<programas.size()) {
            return programas.get(p);
        }
        return "";
    }
    
    //MA
    @Override
    public String toString(){
        return "Marca:"+marca+" Ram:"+ram+" Disco:"+disco;
    }
    
    
    
}
