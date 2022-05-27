/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo

        String nombreArchivo ="data/Hospital.data";
        Hospital h1 = new Hospital("Hospital UTPL",23,255.50);
        h1.establecerIdHospital("111111");
        Hospital h2 = new Hospital("Hospital del seguro",56,567.89);
        h2.establecerIdHospital("222222");
        Hospital h3 = new Hospital("Hospital del día",45,450.99);
        h3.establecerIdHospital("333333");
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        LecturaArchivosSecuencial lectura = new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
