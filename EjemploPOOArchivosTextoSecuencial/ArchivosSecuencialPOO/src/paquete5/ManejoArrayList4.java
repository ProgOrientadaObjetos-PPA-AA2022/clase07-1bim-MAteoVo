/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa("Ecolac","Loja");
        Empresa emp2 = new Empresa("IX Inversions","Chinguilanchi");
        Empresa emp3 = new Empresa("El pirata","Saraguro");
        Empresa emp4 = new Empresa("La polaca","Casa de Miguel");
        
        ArrayList<Empresa> empresa = new ArrayList<>();
        empresa.add(emp1);
        empresa.add(emp2);
        empresa.add(emp3);
        empresa.add(emp4);
        
        
        
        for (int i = 0; i < empresa.size(); i++) {
            System.out.printf("%s - %s\n", empresa.get(i).obtenerNombre(),
                    empresa.get(i).obtenerCiudad());
        }
    }
}
