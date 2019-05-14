/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

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
    private final ArrayList<String> nombreUsuario = new ArrayList<String>();
    private ArrayList<String> paseUsuario = new ArrayList<String>();

    public Proxy() {
        this.facade = Facade.getFacade();
    }

    public boolean validarUsuario(String nombreU, String passwordU) {
        boolean ingreso = false;
        int encontrado = 0;
        String[] info = facade.Consultar_Usuario(nombreU).split(",");
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

    public void crearUsuario(String nombre, String pass, String tipo) {
        facade.Crear_Usuario(nombre, pass, tipo);
        nombreUsuario.add(nombre);
        paseUsuario.add(pass);
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
}
