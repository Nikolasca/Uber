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
public class PagoGrupo {

    private ArrayList<Pago> componentes;

    public PagoGrupo() {
        this.componentes = new ArrayList<Pago>();;
    }

    public void AnadirGrupito(Pago r) {
        this.componentes.add(r);
    }

    public void EliminarAlGrupito(Pago r) {
        this.componentes.remove(r);
    }

    public void ModificarConcepto(String id, String Concepto) {
        for (int i = 0; i < this.componentes.size(); i++) {
            if (id.compareTo(this.componentes.get(i).getId()) == 0) {
                this.componentes.get(i).setConcepto(Concepto);
            }

        }
    }

    public String LeerPago(String id) {
        String nombre = "";
        for (int i = 0; i < this.componentes.size(); i++) {
            if (id.compareTo(this.componentes.get(i).getId()) == 0) {
                nombre = "Nombre: " + this.componentes.get(i).getNombre();
                nombre = nombre + ", id: " + this.componentes.get(i).getId() + ", monto: " + this.componentes.get(i).getPago() + ", fecha: " + this.componentes.get(i).getFecha() + ", concepto: " + this.componentes.get(i).getConcepto();
            }

        }
        return nombre;
    }

    public Pago ObtenerPago(String id) {
        Pago p = new Pago();
        for (int i = 0; i < this.componentes.size(); i++) {
            if (id.compareTo(this.componentes.get(i).getId()) == 0) {
                p = this.componentes.get(i);
            }
        }
        return p;
    }

}
