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
public class Conductor extends Usuario {

    private FlyWeightFactory factory;
   // private String tipo = "Conductor";
    private String nombre;

    public Conductor(String Usuario, String Password, int ID) {
        super(Usuario, Password,ID);
        FlyWeightFactory factory = new FlyWeightFactory();
    }

    public Conductor() {
        super();
    }

    public Conductor(String usuario, String password) {
        super(usuario, password);
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
       
    }

    @Override
    public void setTipo_Usuario(String Tipo_Usuario) {
        super.setTipo_Usuario(Tipo_Usuario); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void setPassword(String Password) {
        super.setPassword(Password); //To change body of generated methods, choose Tools | Templates.
       
    
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsuario(String Usuario) {
        super.setUsuario(Usuario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsuario() {
        return super.getUsuario(); //To change body of generated methods, choose Tools | Templates.
    }
    


    @Override
    public String getTipo_Usuario() {
      return super.getTipo_Usuario();
    }

    @Override
    public String Permisos() {
        return "LeerPago,CrearRuta,ModificarRuta,EliminarRuta,VerRuta,VerHorario,CerrarSesion";
    }

    public FlyWeightFactory getFactory() {
        return factory;
    }

    public void AnadirPago(FlyWeight i) {
        this.factory.AgregarPago(i);

    }

    @Override
    public String getPago(int id) {
        return this.factory.LeerPagoEoC(id);
    }

    @Override
    public String getPagos(String nombreC) {
         return this.factory.toStringPagosConductor(nombreC);
         
    }

    public void setTipo(String tipo) {
        super.setTipo_Usuario(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }
    @Override
    public int getTelefono() {
        return super.getTelefono();
    }
    @Override
    public void setTelefono(int Telefono) {
        super.setTelefono(Telefono);
    }

    @Override
    public void setLat(double  Lat) {
        super.setLat(Lat);
    }
    @Override
    public double getLat() {
        return super.getLat();
    }

    @Override
    public void setLong(double  Long) {
        super.setLong(Long);
    }
    @Override
    public double getLong() {
        return super.getLong();
    }


}