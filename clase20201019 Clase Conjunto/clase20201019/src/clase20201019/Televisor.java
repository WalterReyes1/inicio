package clase20201019;

import java.awt.Color;
import java.util.Date;

public class Televisor {
    //atributos
    private String marca;
    private Color color;
    private Date fecha;
    
    //constructores
    public Televisor(){}
    
    public Televisor(String m){
        marca=m;
    }
    
    public Televisor(String m, Color c, Date f){
        marca=m;
        color=c;
        fecha=f;
    }
    
    
    //mutadores
    public void setMarca(String m){
        marca=m;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setColor(Color c){
        color=c;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setFecha(Date f){
        fecha=f;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    //MA
    @Override
    public String toString(){
        return "TV Marca:"+marca+" Color:"+color+" Fecha:"+fecha;
    }
    
}
