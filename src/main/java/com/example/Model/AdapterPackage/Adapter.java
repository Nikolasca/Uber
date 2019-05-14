/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPackage;

import Flyweight.FlyWeight;
import Flyweight.FlyWeightFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikolas
 */
public class Adapter extends Usuario {

    private Administrador admin;
    private FlyWeightFactory factory;

    public Adapter(String Usuario, String Password, int id) {
        super(Usuario, Password, id);
        this.admin = new Administrador();
    }

    public Adapter(String usuario, String password) {
        super(usuario, password);
    }

    
    

    public Adapter() {
        super();
        this.admin = new Administrador();
    }

    public String gettipoUsuario() {
        return this.admin.tomatuusuario();
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    @Override
    public String Permisos() {
        return admin.PP();
    }

    @Override
    public FlyWeightFactory getFactory() {
        return factory;
    }

    @Override
    public void AnadirPago(FlyWeight i) {
        this.factory.AgregarPago(i);
    }

    @Override
    public String getPago(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPagos(String nombreP) {
        return "Pagos no posibles";
    }

    

}
