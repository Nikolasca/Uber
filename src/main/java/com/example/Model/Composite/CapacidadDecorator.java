/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import Composite.Transporte;

/**
 *
 * @author Pedro de Jesús
 */
public class CapacidadDecorator extends Decorator {
    int capacidad;
    public CapacidadDecorator(Transporte C) {
        super(C);
    }

    public CapacidadDecorator(int capacidad, Transporte C) {
        super(C);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String consultarAtributos() {
        return C.consultarAtributos()+" - Capacidad: "+this.getCapacidad()+" -";
    }
     public void cambiarAtributo(String caracteristica, String nuevo) {
        C.cambiarAtributo(caracteristica, nuevo);
          if (caracteristica.equalsIgnoreCase("capacidad")){
            this.setCapacidad(Integer.parseInt(nuevo));
        }
          System.out.println("Capacity");
    }

    public String getNombre() {
        return C.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPlaca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String getCantidadPuesto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMarca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReferencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String ConsultarNombre(String nombre) {
       return C.consultarAtributos()+"La capacidad es "+this.getCapacidad()+";";
    }

    @Override
    public void setPlaca(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Crear(Transporte t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
