/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Valentina
 */
public class MedioTransporte implements Transporte {

    private String nombre;
    private ArrayList<Transporte> Grupo;
    // private java.util.List<Transporte> G;

    public MedioTransporte(String nombre) {
        this.nombre = nombre;
        this.Grupo = new ArrayList<>();
        // this.G = new java.util.ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String buscarNombre(String nomb, int x) {
        String nom = "";
        /*
        for (Transporte t : Grupo) {
            nom += t.getNombre() + "\n";
        }
         */
        String nombre = nomb;
        //System.out.println(nombre);
        int y = x;
        //System.out.println("1");
        for (int i = y; i < Grupo.size(); i++) {
            //  System.out.println("2");
            if (Grupo.get(i).getNombre().equalsIgnoreCase(nombre)) {
                //    System.out.println("3");
                for (int a = i; a < Grupo.size(); a++) {
                    nom += Grupo.get(a).getNombre() + "\n";
                    //      System.out.println("nom: " + nom);
                }
            }
        }

        return nom;
    }

    @Override
    public String getTipo() {
        String tipo = "";
        for (Transporte t : Grupo) {
            tipo += t.getTipo() + "\n";
        }
        return this.nombre + "\n" + tipo;
    }

    @Override
    public String getPlaca() {
        String placa = "";
        for (Transporte t : Grupo) {
            placa += t.getPlaca() + "\n";
        }
        return this.nombre + "\n" + placa;
    }

    @Override
    public String getCantidadPuesto() {
        String cantidadpuestos = "";
        for (Transporte t : Grupo) {
            cantidadpuestos += t.getCantidadPuesto() + "\n";
        }
        return cantidadpuestos;
    }

    @Override
    public String getMarca() {
        String marca = "";
        for (Transporte t : Grupo) {
            marca += t.getMarca() + "\n";
        }
        return this.nombre + "\n" + marca;
    }

    @Override
    public String getAno() {
        String ano = "";
        for (Transporte t : Grupo) {
            ano += t.getAno() + "\n";
        }
        return this.nombre + "\n" + ano;
    }

    @Override
    public String getReferencia() {
        String ref = "";
        for (Transporte t : Grupo) {
            ref += t.getReferencia() + "\n";
        }
        return this.nombre + "\n" + ref;
    }

    public String ConsultarNombre(String nombre) {
        String n = nombre;
        String nom = "";
        String nam = "";
        if (this.nombre.equalsIgnoreCase(nombre)) {
            nom = this.consultarAtributos();
        } else {
            for (int i = 0; i < Grupo.size(); i++) {
                if (Grupo.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    nom += Grupo.get(i).consultarAtributos() + "\n";
                    if (!nom.contains("-")) {
                        // System.out.println("Es un grupo!");
                        // System.out.println("Datos subgroup:" +Grupo.get(i).consultarAtributos());
                        nom = Grupo.get(i).consultarAtributos();
                    }
                }
            }
        }
        System.out.println("Nom:"+nom);
        return nom;
    }

    public void Crear(Transporte t) {
        this.Grupo.add(t);
    }

    public void Eliminar(Transporte t) {
        this.Grupo.remove(t);
    }

    public Transporte CambiarPlaca(String Nombre, String placa) {
        int porcambiar = 0;
        for (int i = 0; i < Grupo.size(); i++) {
            if (Grupo.get(i).getNombre().equalsIgnoreCase(Nombre)) {
                porcambiar = i;
            }
        }
        return Grupo.get(porcambiar);
    }

    @Override
    public void setPlaca(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String consultarAtributos() {
        String todos = "";
        for (int i = 0; i < Grupo.size(); i++) {
            todos += Grupo.get(i).consultarAtributos() + "\n";
        }
        return this.nombre + "\n" + todos;
    }

    public void cambiarAtributo(String caracteristica, String nuevo) {
        if (caracteristica.contains(";")) {
            String[] a = caracteristica.split(";");
            String nombre = a[0];
            String cara = a[1];
            for (int i = 0; i < Grupo.size(); i++) {
                System.out.println("1");
                if (Grupo.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("2");
                    Grupo.get(i).cambiarAtributo(cara, nuevo);
                }
            }
                    System.out.println("Cambiar "+cara+nuevo+nombre);
        } else {
            if (caracteristica.equalsIgnoreCase("nombreG")) {
                this.setNombre(nuevo);
            }
        }

    }
        public Transporte getGrupo(String nombre){
        Transporte t=null;
        for (int i = 0; i < Grupo.size(); i++) {
            if (Grupo.get(i).getNombre().equalsIgnoreCase(nombre)) {             
                t = Grupo.get(i);
            }
        }
        return t;
    }
}
