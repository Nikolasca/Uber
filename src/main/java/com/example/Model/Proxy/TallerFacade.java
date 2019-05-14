/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import AdapterPackage.Adapter;
import AdapterPackage.Usuario;
import taller.facade.Facade;

/**
 *
 * @author Nikolas
 */
public class TallerFacade {

    /**
     * @param args the command line arguments
     * @throws java.lang.NoSuchMethodException
     */
    public static void main(String[] args) throws NoSuchMethodException {
     Facade f = Facade.getFacade();
   
   f.Acceso("CrearVehiculo","Individual","123","carro1-1");
   
 //  f.Acceso("EliminarElemento","Individual","123","1");
   System.out.println(f.Acceso("VerTodos", "Hola","123",""));
    
     //f.Acceso("LeerReserva", user,"123");
    }
    
}
