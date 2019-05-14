/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.facade;

/**
 *
 * @author Nikolas
 */
public class Reserva {
    String Id;
    String Nombre;
    String Fecha;
    String Concepto;
    String Lugar;

    public Reserva(String Nombre, String id,String Fecha, String Concepto, String Lugar) {
        this.Nombre = Nombre;
        this.Id = id;
        this.Fecha=Fecha;
        this.Concepto=Concepto;
        this.Lugar=Lugar;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    
    
    
}
