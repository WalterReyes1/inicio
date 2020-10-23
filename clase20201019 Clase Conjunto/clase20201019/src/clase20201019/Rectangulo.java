package clase20201019;
public class Rectangulo {
    //atributos
    private double largo;
    private double ancho;
    
    //contructores
    public Rectangulo(){}
    
    public Rectangulo(double l){
        largo=l;
    }
    
    public Rectangulo(double l, double ancho){
        largo=l;
        this.ancho=ancho;        
    }
    
    //mutadores
    public void setLargo(double l){
        largo=l;
    }
    
    public double getLargo(){
        return largo;
    }
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
       
    //MA
    @Override
    public String toString(){
        return "Ancho:"+ancho+" Largo:"+largo;
    }
    
    public double area(){
        return largo*ancho;
    }
    
    public double perimetro(){
        return largo*2+ancho*2;
    }
    
    
    
}
