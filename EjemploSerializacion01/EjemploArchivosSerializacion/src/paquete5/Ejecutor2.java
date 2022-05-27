/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;




public class Ejecutor2 {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/Hospital.data";
        String id_buscar = "1111110";
        Hospital hospital_buscar;
        LecturaArchivosSecuencial lectura = 
                new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerIdentificador(id_buscar);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.printf("%s",hospital_buscar);
        }else{
            System.out.println("Hospital no encontrado");
        }
        
    }
}
