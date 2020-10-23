package clase20201019;

public class Liquidos {
    private String categoria;
    
    public Liquidos(){        
    }
    
    public Liquidos(String c){
        setCategoria(c);   
    }
    
    
    public void setCategoria(String c){
        if (c.equals("Lacteos") || c.equals("Gaseoso") || c.equals("agua")) {
            categoria=c;
        }
        
    }
    
}
