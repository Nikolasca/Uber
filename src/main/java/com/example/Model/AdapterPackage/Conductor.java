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
    private String tipo = "Conductor";
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
    public String getTipo_Usuario() {
        return this.tipo;
    }

    @Override
    public String Permisos() {
        return "LeerPago,CrearRuta,ModificarRuta,EliminarRuta,VerRuta,VerHorario,CerrarSesión";
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}