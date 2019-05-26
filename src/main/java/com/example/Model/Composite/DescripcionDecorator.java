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
public class DescripcionDecorator extends Decorator {

    private String descripcion;

    public DescripcionDecorator(String descripcion, Transporte C) {
        super(C);
        this.descripcion = descripcion;
    }

    public DescripcionDecorator(Transporte C) {
        super(C);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String consultarAtributos() {
        return C.consultarAtributos() + " Descripción : " + this.getDescripcion() + " -";
    }

    public void cambiarAtributo(String caracteristica, String nuevo) {
        C.cambiarAtributo(caracteristica, nuevo);
        if (caracteristica.equalsIgnoreCase("descripcion")) {
            this.setDescripcion(nuevo);
        }
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
        return C.consultarAtributos() + "La descripción es " + this.getDescripcion() + ";";
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
