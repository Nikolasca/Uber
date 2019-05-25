/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import AdapterPackage.Usuario;
import java.util.ArrayList;

/**
 *
 * @author nikolasca
 */
public class Singleton {
    private static ArrayList<Usuario> usuarios;
    private static Singleton single;

    public Singleton() {
        usuarios = new ArrayList();
    }
    
    
    
    public static Singleton getSingle() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    public  ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        Singleton.usuarios = usuarios;
    }

    public void Add(Usuario user) {
        usuarios.add(user);
    }

    public Usuario getById(int id) {
        Usuario user = null;

        for (Usuario usuario : usuarios) {
            if (id == usuario.getId()) {
                user = usuario;

            }

        }
        return user;
    }

    public void AnadirCoordenadas(int id, double Lat, double Long){
        for (Usuario usuario : usuarios) {
            if (id == usuario.getId()) {
                usuario.setLat(Lat);
                usuario.setLong(Long);

            }

    }

}
}

