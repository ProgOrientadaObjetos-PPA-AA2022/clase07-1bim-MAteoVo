/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Calificacion c1;
        Calificacion c2;
        Calificacion c3;
        
        c1 = new Calificacion(9.8,"Base de datos");
        c2 = new Calificacion(5.6,"Matematicas");
        c3 = new Calificacion(10,"Logica");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Armando Casitas", "nombramiento");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
   
        
        ArrayList <Calificacion> calificacion = new ArrayList<>();
        calificacion.add(c1); 
        calificacion.add(c2); 
        calificacion.add(c3);
        
        
        for (int i = 0; i < calificacion.size(); i++) {
            System.out.printf("%s - %s - %.2f\n", calificacion.get(i).obtenerProfesor().obtenerNombre(),
                    calificacion.get(i).obtenerNombreMateria(),calificacion.get(i).obtenerNota());
        }
    }
}
