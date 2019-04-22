/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author jdiazga
 */
public class ConjuntoLibro {
  private  Libro[]libros;
   public ConjuntoLibro(){
       this.libros = new Libro [10];
   }
 public boolean nuevoLibro(Libro libro1){
     int i=0;
     while (this.libros[i]==null){
         i++;
     }
     if(i<10){
     this.libros[i]=libro1;
     return true;
     }
     else{
     return false;
     }
 }
 public boolean eliminar(String nombre,String titulo){
 
 }
}
