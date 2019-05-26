/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import Composite.Transporte;
import java.util.ArrayList;

/**
 *
 * @author Pedro de Jesús
 */
public abstract class Decorator implements Transporte{

    protected Transporte C;

    public Decorator(Transporte C) {
        this.C = C;
    }
    public String getNombre(){
        return C.getNombre();
    }
    public String consultarAtributos() {
        return C.consultarAtributos();
    }
    public void cambiarAtributo(String caracteristica, String nuevo) {
     C.cambiarAtributo(caracteristica, nuevo);
        }
     public String ConsultarNombre(String nombre) {
         return C.consultarAtributos();
    }
    }