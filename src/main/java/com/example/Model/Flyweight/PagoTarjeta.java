/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author Valentina
 */
public class PagoTarjeta implements FlyWeight {
    
    private int id;
    private String nombrePasajero;
    private String nombreConductor;
    private float monto;
    private String otros;
 
    public PagoTarjeta(int id, String nombrePasajero, String nombreConductor, float monto, String otros) {
        this.id = id;
        this.nombrePasajero = nombrePasajero;
        this.nombreConductor = nombreConductor;
        this.monto = monto;
        this.otros = otros;
    }
   
    @Override
    public int getId() {
        return this.id;
    }
 
    @Override
    public void setId(int id) {
        this.id = id;
    }
 
    @Override
    public String getNombrePasajero() {
        return this.nombrePasajero;
    }
    
    @Override
    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }
 
    @Override
    public String getNombreConductor() {
        return this.nombreConductor;
    }
 
    @Override
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }
 
    @Override
    public float getMonto() {
        return this.monto;
    }
 
    @Override
    public void setMonto(float monto) {
        this.monto = monto;
    }
 
    @Override
    public String getOtros() {
        return this.otros;
    }
    
    @Override
    public void setOtros(String dato1, String dato2, String dato3) {
        this.otros="numeroTarjeta: "+dato1+", CVV: "+dato2+", fechaVencimiento: "+dato3;
    }
 
    @Override
    public String toString() {
        return "Datos crédito{" + "id=" + id + ", nombrePasajero=" + nombrePasajero + ", nombreConductor=" + nombreConductor + ", monto=" + monto + ", otros=" + otros + '}';
    }
}
