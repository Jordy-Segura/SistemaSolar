/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemasolar;

import ec.edu.espoch.jordysegura2020.clases.Planet;
import ec.edu.espoch.jordysegura2020.enumeraciones.PlanetType;

/**
 *
 * @author jordy
 */
public class SistemaSolar {

    public static void main(String[] args) {
        
        Planet objPlaneta= new Planet(": Marte",2,3,4,2,4,false,PlanetType.ENANO);
               
        objPlaneta.printValues();
        
       double densidad=objPlaneta.calculateDms();
        System.out.println("La densidad es: "+densidad);
           
        
    }
}
