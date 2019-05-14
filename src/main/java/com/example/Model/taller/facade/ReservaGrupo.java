/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.facade;

import java.util.ArrayList;

/**
 *
 * @author Nikolas
 */
public class ReservaGrupo {

    private ArrayList<Reserva> componentes;
    
    public ReservaGrupo() {
        this.componentes = new ArrayList<Reserva>();;
    }
    
    public void AnadirGrupito(Reserva r) {
        this.componentes.add(r);
    }
    
    public void EliminarAlGrupito(Reserva r) {
        this.componentes.remove(r);
    }
    
    public void ModificarLugar(String id, String Nuevo_Lugar) {
        for (int i = 0; i < this.componentes.size(); i++) {
            if (id.compareTo(this.componentes.get(i).getId()) == 0) {
                this.componentes.get(i).setLugar(Nuevo_Lugar);
            }
            
        }
    }

    public int CantidadReservas() {
        return this.componentes.size();
        
    }
    
    public String LeerReserva(String id) {
        String nombre = "";
        for (int i = 0; i < this.componentes.size(); i++) {
            if (componentes.get(i).getId().equalsIgnoreCase(id)) {
                nombre = "Nombre: " + this.componentes.get(i).getNombre();
                nombre = nombre + ", id: " + this.componentes.get(i).getId() + ", fecha: " + this.componentes.get(i).getFecha() + ", concepto: " + this.componentes.get(i).getConcepto() + ", lugar: " + this.componentes.get(i).getLugar();
                
            }
            
        }
        return nombre;
    }

    public Reserva ObtenerReserva(String id) {
        Reserva p = null;
        for (int i = 0; i < this.componentes.size(); i++) {
            if (id.compareTo(this.componentes.get(i).getId()) == 0) {
                p = this.componentes.get(i);
            }
        }
        return p;
    }
}
