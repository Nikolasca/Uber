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
    private String Usuario;
    private String Password;
    private String Tipo_Usuario;
    private String nombreapellido;
    private String id;
    private String email;
    private String telefono;  

    public Usuario(String Usuario, String Password, String nombreapellido, String id, String email, String telefono) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.nombreapellido = nombreapellido;
        this.id = id;
        this.email = email;
        this.telefono = telefono;
    }

    public Usuario() {
    }

  

    
    



   // public abstract String getUsuario();

   // public abstract void setUsuario(String Usuario); 

   //public abstract String getPassword();

   //public abstract void setPassword(String Password);

  // public abstract void setTipo_Usuario(String Tipo_Usuario);

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTipo_Usuario() {
        return Tipo_Usuario;
    }

    public void setTipo_Usuario(String Tipo_Usuario) {
        this.Tipo_Usuario = Tipo_Usuario;
    }
    
    public abstract String Permisos();

   public abstract FlyWeightFactory getFactory();
   
    public abstract void AñadirPago(FlyWeight i);
    public abstract String getPago(int id);
    public abstract String getPagos(String nombre);
}
