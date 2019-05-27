/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import AdapterPackage.Usuario;
import java.util.ArrayList;
import taller.facade.Facade;

/**
 *
 * @author Pedro de Jesús
 */
public class Proxy {
    //MostrarMenu
    //MandarTodo

    private Facade facade;
    private ArrayList<String> nombreUsuario = new ArrayList<>();
    private ArrayList<String> paseUsuario = new ArrayList<>();

    public Proxy() {
        this.facade = Facade.getFacade();
    }

    public boolean validarUsuario(String nombreU, String passwordU) {
        boolean ingreso = false;
        int encontrado = 0;
        String[] info = facade.Consultar_Usuario(nombreU,passwordU).split(",");
        for (int i = 0; i < nombreUsuario.size(); i++) {
            if (nombreUsuario.get(i).equalsIgnoreCase(nombreU) && paseUsuario.get(i).equalsIgnoreCase(passwordU) && info[0].equalsIgnoreCase(nombreU) && info[1].equalsIgnoreCase(passwordU)) {
                encontrado += 1;
            }
        }
        if (encontrado > 0) {
            ingreso = true;
            facade = new Facade();
        }
        return ingreso;
    }

   // public void crearUsuario(String nombre, String pass, String tipo,String nombreCompleto,int telefono,String documento,String email,int id) {
     //   facade.Crear_Usuario(nombre, pass, tipo,nombreCompleto,telefono,documento,email,telefono);
       // nombreUsuario.add(nombre);
       // paseUsuario.add(pass);
   // }
    
 public void crearUsuario(String nombre, String pass, String tipo, String nombreCompleto, int telefono, String documento, String email) {
        nombreUsuario.add(nombre);
        paseUsuario.add(pass);
        facade.Crear_Usuario(nombre, pass, tipo, nombreCompleto, telefono, documento, email);
    }

    public String llamarMetodoGeneral(String informacion) throws NoSuchMethodException {
        String[] info = informacion.split(",");
        String accion = info[0];
        String nombreU = info[1];
        String passU = info[2];
        String para = info[3];
        String x = facade.Acceso(accion, nombreU, passU, para);
        return x;
    }
    public ArrayList <Usuario> Traer_Usuario(){
        return this.facade.getComponentes();
    
    }
    public void ActPos(int id,double lat double lon){
     this.facade.ActPosicion(id,lat,lon);


    }

    
}
