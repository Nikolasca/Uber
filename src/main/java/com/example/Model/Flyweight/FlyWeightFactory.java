/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

import java.util.ArrayList;

/**
 *
 * @author Valentina
 */
public class FlyWeightFactory {

    private ArrayList<FlyWeight> Fly = new ArrayList<FlyWeight>();
    private String NumTarj="";
    private String CVV="";
    private String fechaVenc="";
    private String NumTarjD="";

    public FlyWeightFactory() {
    }

    public void CrearPagoEfectivo(int id, String nombrePasajero, String nombreConductor, float monto, String otros) {
        FlyWeight f = new PagoEfectivo(id, nombrePasajero, nombreConductor, monto, otros);
        int agregar = 1;
        for (int a = 0; a < Fly.size(); a++) {
            if (Fly.get(a).getId() == id) {
                agregar = 0;
            }
        }
        if (agregar > 0) {
            this.Fly.add(f);
        }
    }

    public void CrearPagoTarjeta(int id, String nombrePasajero, String nombreConductor, float monto, String otros) {
        FlyWeight f = new PagoTarjeta(id, nombrePasajero, nombreConductor, monto, otros);
        int agregar = 1;
        for (int a = 0; a < Fly.size(); a++) {
            if (Fly.get(a).getId() == id) {
                agregar = 0;
            }
        }
        if (agregar > 0) {
            this.Fly.add(f);
        }
    }

    public String verSaldosFavor(String nombreU) {
        String favor = "";

        return favor;
    }

    public String verSaldosPagos(String nombreU) {
        String pagado = "";

        return pagado;
    }

    public void AgregarPago(FlyWeight i) {
        int agregar = 1;
        for (int a = 0; a < Fly.size(); a++) {
            if (Fly.get(a).getId() == i.getId()) {
                agregar = 0;
            }
        }
        if (agregar > 0) {
            Fly.add(i);
        }
    }

    public ArrayList<FlyWeight> getFly() {
        return Fly;
    }

    public void setFly(ArrayList<FlyWeight> Fly) {
        this.Fly = Fly;
    }

    public FlyWeight Getpago(int id) {
        FlyWeight s = null;
        for (int i = 0; i < Fly.size(); i++) {
            if (id == Fly.get(i).getId()) {
                s = Fly.get(i);
            }
        }
        return s;
    }

    public void EliminarPago(FlyWeight i) {
        Fly.remove(i);

    }

    public void ModificarPago(int i, String NuevoValor, String NuevoValor2, String NuevoValor3,String NuevoValor4) {
        Fly.get(i).setOtros(NuevoValor, NuevoValor2, NuevoValor3,NuevoValor4);
    }

    public String LeerPagoEoC(int id) {
        String info = "";
        for (int i = 0; i < Fly.size(); i++) {
            if (id == Fly.get(i).getId()) {
                info = Fly.get(i).toString() + "\n";
            }
        }
        return info;
    }

    public String toStringPagosPasajero(String nombreP) {
        String info = "";
        for (int i = 0; i < Fly.size(); i++) {
            if (Fly.get(i).getNombrePasajero().equalsIgnoreCase(nombreP)) {
                info += Fly.get(i).toString() + "\n";
            }
        }
        return info;
    }

    public String toStringPagosConductor(String nombreC) {
        String info = "";
        for (int i = 0; i < Fly.size(); i++) {
            if (Fly.get(i).getNombreConductor().equalsIgnoreCase(nombreC)) {
                info += Fly.get(i).toString() + "\n";
            }
        }
        return info;
    }
    public String getNumTarj() {
        return NumTarj;
    }

    public void setNumTarj(String NumTarj) {
        this.NumTarj = NumTarj;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public String getNumTarjD() {
        return NumTarjD;
    }

    public void setNumTarjD(String NumTarjD) {
        this.NumTarjD = NumTarjD;
    }
}
