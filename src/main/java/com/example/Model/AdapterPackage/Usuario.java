/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPackage;

import Flyweight.FlyWeight;
import Flyweight.FlyWeightFactory;



/**
 *
 * @author Nikolas
 */
public abstract class Usuario {

    private String usuario;
    private String password;
    private String tipo_Usuario;
    private int id;

    public Usuario(String Usuario, String Password,int id) {
        this.usuario = Usuario;
        this.password = Password;
        this.id = id;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario() {
    }

   // public abstract String getUsuario();
   // public abstract void setUsuario(String Usuario); 
   //public abstract String getPassword();
   //public abstract void setPassword(String Password);
  // public abstract void setTipo_Usuario(String Tipo_Usuario);
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public String getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(String Tipo_Usuario) {
        this.tipo_Usuario = Tipo_Usuario;
    }

    public abstract String Permisos();

    public abstract FlyWeightFactory getFactory();

    public abstract void AnadirPago(FlyWeight i);

    public abstract String getPago(int id);

    public abstract String getPagos(String nombre);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
