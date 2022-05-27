/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author Vala
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        String nombreArchivo ="Hospital.txt";
        Hospital h1 = new Hospital("Hospital UTPL",23,255.50);
        Hospital h2 = new Hospital("Hospital del seguro",56,567.89);
        Hospital h3 = new Hospital("Hospital del día",45,450.99);
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
