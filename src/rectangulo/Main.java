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
public class Main {

    public static void main(String[] args) {
        Autor autor= new Autor("Ana Lisa","Melchotto");
        Libro libro= new Libro("la mamba negra", autor, 300, 8);
        Autor autor1= new Autor("Benito","Camelo");
        Libro libro1= new Libro("El bananon", autor1, 500, 6);
        ConjuntoLibro conjunto = new ConjuntoLibro();
        conjunto.nuevoLibro(libro);
        conjunto.nuevoLibro(libro1);
        conjunto.lista();
        conjunto.mejor();
        conjunto.peor();
    }
    
}
