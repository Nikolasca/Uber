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
public class IdentificadorDecorator extends Decorator {

    private String identificador;

    public IdentificadorDecorator(String identificador, Transporte C) {
        super(C);
        this.identificador = identificador;
    }

    public IdentificadorDecorator(Transporte C) {
        super(C);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String consultarAtributos() {
        return C.consultarAtributos() + " Identificador: " + this.getIdentificador() + " -";
    }

    public void cambiarAtributo(String caracteristica, String nuevo) {
        C.cambiarAtributo(caracteristica, nuevo);
        if (caracteristica.equalsIgnoreCase("identificador")) {
            this.setIdentificador(nuevo);
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
        return C.consultarAtributos() + "El identificador es " + this.getIdentificador() + ";";
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
