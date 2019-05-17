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
public class Pasajero extends Usuario {

    private FlyWeightFactory factory;
    private String usuario;
    private String pass;
    private String tipo="Pasajero";
    private String nombreapellido;
    private String id;
    private String email;
    private String telefono;   

    public Pasajero(String Usuario, String Password, String nombreapellido, String id, String email, String telefono) {
        super(Usuario, Password, nombreapellido, id, email, telefono);
        this.factory = new FlyWeightFactory();
    }

    public Pasajero() {
        super();
    }

    
    @Override
    public String getTipo_Usuario() {
        return this.tipo;
    }
    
    @Override
    public String Permisos() {
        return "CrearReserva,LeerReserva,ModificarLugarReserva,EliminarReserva,CrearPago,LeerPago,Consultar_Usuario,mod_Usuario,"
                + "crearCredito,crearEfectivo,VerPagos,VerTransporte,crearTarjetaCredito,crearTarjetaDebito,ModificarTarjetaCredito,ModificarTarjetaDebito,VerViajesRealizados,VerRutas,VerAyudas,GuardarUbicaciones,CerrarSesion";
    }

    public FlyWeightFactory getFactory() {
        return this.factory;
    }

    public void AñadirPago(FlyWeight i) {
        this.factory.AgregarPago(i);
    }

    @Override
    public String getPago(int id) {
        return this.factory.LeerPagoEoC(id);
    }

    @Override
    public String getPagos(String nombreP) {
        return this.factory.toStringPagosPasajero(nombreP);
    }
}
