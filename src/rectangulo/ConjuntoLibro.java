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
    for(int i=0;i<libros.length;i++){
     if (libros[i]==null){
         libros[i]=libro1;
         return true;
     }
     
 }
    
    return false;
     }
 public boolean eliminar(String nombre,String titulo){
 for(int i=0;i<libros.length;i++){
     if(libros[i].getAutor().getNombre()==nombre && libros[i].getTitulo()==titulo)
     {
         libros[i]=null;
     }
 }
 return true;
 }
 public boolean mejor(){
     int s=0;
     for(int i=0;i<libros.length;i++){
         if(libros[i]!=null){
         if(libros[i].getCalificacion()>libros[s].getCalificacion()){
             s=i;
         } 
         }
     }
     System.out.println(libros[s].getCalificacion());
     return true;
 }
  public boolean peor(){
     int s=0;
     for(int i=0;i<libros.length;i++){
         if(libros[i]!=null){
             
         if(libros[i].getCalificacion()<libros[s].getCalificacion()){
             s=i;
         }
         }
     }
      System.out.println(libros[s].getCalificacion());
         return true;
 }
  public boolean lista(){
      for(int i =0;i<libros.length;i++){
          if(libros[i]!=null){
          System.out.println(libros[i].getTitulo()+"  "+libros[i].getAutor().getNombre()+"   " + libros[i].getAutor().getApellido());
      }
      }
      return true;
  }
}
