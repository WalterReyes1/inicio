package clase20201019;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import javafx.print.Collation;
import javax.swing.JOptionPane;
public class Clase20201019 {
    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        int opcion=0;
        while (opcion != 7) { 
            opcion=Integer.parseInt(
                    JOptionPane.showInputDialog("1- Agregar un rectangulo\n" +
                                                "2- Agregar un Televisor\n" +
                                                "3- listar todo\n" +
                                                "4- Modificar la marca del TV\n" +
                                                "5- listar Televisores\n" +
                                                "6- Eliminar del arrayList\n"
                            
                                               + "8- agregar computadora\n" +
                                                "9- agregar programa a una computadora\n" +
                                                "10- listar programas de una computadora\n" +
                                                "11- modificar un programa de una computadora\n" +
                                                "12- eliminar un programa de una computadora\n" +
                            
                                                "7- salir")
                   );
            if (opcion == 1) {
                int l,a;
                l=Integer.parseInt(
                    JOptionPane.showInputDialog("largo")
                   );
                a=Integer.parseInt(
                    JOptionPane.showInputDialog("ancho")
                   );
                lista.add(new Rectangulo(l,a));
            }
            
            if (opcion == 2) {
                String m;
                m=JOptionPane.showInputDialog("Marca");
                lista.add(new Televisor(m,Color.black,new Date()));
            }
            
            if (opcion == 3) {
                String salida="";
                for (Object t : lista) {
                    salida+=""+lista.indexOf(t)+"- "+t+"\n";
                }
                JOptionPane.showMessageDialog(null, salida);
            }
            
            if (opcion == 4) {
                int p;
                String nm;
                p=Integer.parseInt(
                    JOptionPane.showInputDialog("Posicion del TV a modificar")
                   );
                if (p>=0 && p<lista.size()) {
                    if (lista.get(p)  instanceof  Televisor) {
                        nm=JOptionPane.showInputDialog("Ingrese la nueva Marca");
                        ((Televisor)lista.get(p)).setMarca(nm);
                        JOptionPane.showMessageDialog(null, "Televisor modificado exitosamente");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Posicion seleccionada no es un TV");
                    }                    
                }else{
                    JOptionPane.showMessageDialog(null, "Posicion fuera de rango");
                }
                
                
            }
            if (opcion == 5) {
                String salida="";
                for (Object t : lista) {
                    if (t instanceof Televisor) {
                        salida+=""+lista.indexOf(t)+"- "+t+"\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }
            
            
             if (opcion == 6) {
                int p;                
                p=Integer.parseInt(
                    JOptionPane.showInputDialog("Posicion del TV a Eliminar")
                   );
                if (p>=0 && p<lista.size()) {
                    lista.remove(p);
                    JOptionPane.showMessageDialog(null, "Elemento eliminado exitosamente");          
                }else{
                    JOptionPane.showMessageDialog(null, "Posicion fuera de rango");
                }
            }
             
             
            if (opcion == 8) {
                String m;
                int r, d;
                m=  JOptionPane.showInputDialog("Marca");                  
                r=Integer.parseInt(
                    JOptionPane.showInputDialog("Ram")
                   );
                d=Integer.parseInt(
                    JOptionPane.showInputDialog("Disco")
                   );
                lista.add( new Computadora(m,r,d) );
            } 
            
            
             if (opcion == 9) {
                String prog;
                int p;
                p=Integer.parseInt(
                    JOptionPane.showInputDialog("Posicion de la computadora")
                   );
                 if (p>=0 && p<lista.size() ) {
                     if (lista.get(p)  instanceof Computadora  ) {
                         prog=  JOptionPane.showInputDialog("nombre del programa");  
                         ((Computadora)lista.get(p)).getProgramas().add(prog);
                          JOptionPane.showMessageDialog(null, "Programa agregado exitosamente");
                     }else{
                         JOptionPane.showMessageDialog(null, "en la posicion no es una computadora");
                     }
                     
                 }else{
                     JOptionPane.showMessageDialog(null, "Posicion Fuera de Rango");
                 }
            } 
            
             
             if (opcion == 10) {
                String salida="";
                int p;
                 p=Integer.parseInt(
                    JOptionPane.showInputDialog("Posicion de la computadora")
                   );
                if (p>=0 && p<lista.size() ) {
                     if (lista.get(p)  instanceof Computadora  ) {
                         ArrayList<String> l=   ((Computadora)lista.get(p)).getProgramas();
                         
                         for (String t : l) {
                            salida+=""+l.indexOf(t)+"- "+t+"\n";
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        
                     }else{
                         JOptionPane.showMessageDialog(null, "en la posicion no es una computadora");
                     }
                     
                 }else{
                     JOptionPane.showMessageDialog(null, "Posicion Fuera de Rango");
                 }  
                
            }
             
             
             
             if (opcion == 11) {               
                int p;
                 p=Integer.parseInt(
                    JOptionPane.showInputDialog("Posicion de la computadora")
                   );
                if (p>=0 && p<lista.size() ) {
                     if (lista.get(p)  instanceof Computadora  ) {
                         int pp;
                         pp=Integer.parseInt(
                                JOptionPane.showInputDialog("Posicion del programa a modificar")
                               );
                         if (pp>=0 && pp<  ((Computadora)lista.get(p)).getProgramas().size() ) {
                             String prog;
                             prog=  JOptionPane.showInputDialog("Nuevo nombre del programa");  
                             
                             ((Computadora)lista.get(p)).getProgramas().set(pp, prog);
                             
                         }else{
                             JOptionPane.showMessageDialog(null, "Posicion del programa Fuera de Rango");
                         }
                        
                     }else{
                         JOptionPane.showMessageDialog(null, "en la posicion no es una computadora");
                     }
                     
                 }else{
                     JOptionPane.showMessageDialog(null, "Posicion Fuera de Rango");
                 }  
                
            }
             
             
             
              if (opcion == 12) {               
                int p;
                 p=Integer.parseInt(
                    JOptionPane.showInputDialog("Posicion de la computadora")
                   );
                if (p>=0 && p<lista.size() ) {
                     if (lista.get(p)  instanceof Computadora  ) {
                        
                         
                            Collections.shuffle(  ( (Computadora)lista.get(p) ).getProgramas() );
                             
                        
                     }else{
                         JOptionPane.showMessageDialog(null, "en la posicion no es una computadora");
                     }
                     
                 }else{
                     JOptionPane.showMessageDialog(null, "Posicion Fuera de Rango");
                 }  
                
            }
            
           
             
             
             
        }
        
    }
}
