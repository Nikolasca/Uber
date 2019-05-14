/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Nikolas
 */
public class composite implements interfaceGrupo {

    private String nombre;
    private ArrayList<interfaceGrupo> componentes;
    private int id=0;

    public composite(String Nombre) {
        
        this.nombre = Nombre;
        this.componentes = new ArrayList<interfaceGrupo>();  

    }
    public composite(String Nombre, int id) {
        this.id = id;
        this.nombre = Nombre;
        this.componentes = new ArrayList<interfaceGrupo>();  

    }

   
    public String getNombreGrupo() {
        String resultado = "";
       for (int i = 0; i < this.componentes.size(); i++) {
          resultado = resultado + this.nombre;
          resultado = resultado +" "+ this.componentes.get(i).getNombre()+" "+this.componentes.get(i).getReferencia()+" "+this.componentes.get(i).getCapacidad()+" "+this.componentes.get(i).getPlaca();
            
            }

        return resultado;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setComponentes(ArrayList<interfaceGrupo> Componentes) {
        this.componentes = Componentes;

    }

    public ArrayList<interfaceGrupo> getComponentes() {
        
        return this.componentes;
    }

    public void Anadir(interfaceGrupo componente) {
        this.getComponentes().add(componente);

    }
    public void Eliminar(interfaceGrupo componente) {
        this.getComponentes().remove(componente);

    }

    @Override
    public void setTipo(String Nombre, String Tipo) {
        for (int i = 0; i < this.componentes.size(); i++) {

            if (Nombre.compareTo(this.nombre) == 0) {
                this.componentes.get(i).setTipo(Tipo, Nombre);
            }

        }
    }

    @Override
    public String getPlaca() {
        String resultado = "";
        for (int i = 0; i < this.componentes.size(); i++) {
            resultado = resultado + this.componentes.get(i).getPlaca();

        }
        return this.nombre+" "+resultado;
    }

    @Override
    public void setPlaca(String placa, String Nombre) {
        for (int i = 0; i < this.componentes.size(); i++) {

            if (Nombre.compareTo(this.nombre) == 0) {
                this.componentes.get(i).setPlaca(placa,Nombre);
            }

        }
    }

    @Override
    public int getCapacidad() {
        int resultado = 0;
        for (int i = 0; i < this.componentes.size(); i++) {
            resultado = resultado + this.componentes.get(i).getCapacidad();

        }
        return resultado;
    }

    @Override
    public void setCapacidad(int capacidad, String Nombre) {
        for (int i = 0; i < this.componentes.size(); i++) {

            if (Nombre.compareTo(getNombreGrupo()) == 0) {
                this.componentes.get(i).setCapacidad(capacidad, Nombre);
            }

        }

    }
    public interfaceGrupo Getelemento(int L) {
        interfaceGrupo s = new composite("");
        for (int i = 0; i < this.componentes.size(); i++) {
            if (L == this.componentes.get(i).getId() || L == this.id) {
                s = (composite) this.componentes.get(i);
            }

        }
        return s;
    }

    @Override
    public String getReferencia() {
        String resultado = "";
        for (int i = 0; i < this.componentes.size(); i++) {
            resultado = resultado + this.componentes.get(i).getReferencia();

        }
        return resultado;
    }

    @Override
    public void setReferencia(String referencia, String Nombre) {
        for (int i = 0; i < this.componentes.size(); i++) {

            if (Nombre.compareTo(getNombreGrupo()) == 0) {
                this.componentes.get(i).setReferencia(referencia, Nombre);
            }

        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   

    @Override
    public String getTipo() {
          String resultado = "";
        for (int i = 0; i < this.componentes.size(); i++) {
            resultado = resultado + this.componentes.get(i).getTipo();

        }
        return resultado;
    }

    @Override
    public String toString() {
        return "composite{" + "nombre=" + nombre + ", id=" + id + '}';
    }

    

    @Override
    public String getNombre() {
        String resultado = "";
       for (int i = 0; i < this.componentes.size(); i++) {
           resultado = resultado + this.nombre;
           resultado = resultado +" "+ this.componentes.get(i).getNombre();
            
            }

        return resultado;
    }

}
