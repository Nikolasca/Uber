/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Valentina
 */
public class Individual implements Transporte {

    private String nombre;
    private String tipo;
    private String placa;
    private String cantidadpuestos;
    private String marca;
    private String ano;
    private String referencia;

    public Individual(String nombre, String tipo, String placa, String cantidadpuestos, String marca, String ano, String referencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.placa = placa;
        this.cantidadpuestos = cantidadpuestos;
        this.marca = marca;
        this.ano = ano;
        this.referencia = referencia;
    }


    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getCantidadPuesto() {
        return this.cantidadpuestos;
    }

    public void setCantidadPuesto(String cantidadpuesto) {
        this.cantidadpuestos = cantidadpuesto;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    public String ConsultarNombre(String nombre) {
        String informacion = "Nombre: " + this.getNombre() + " - Placa: " + this.getPlaca() + " - Tipo: " + this.getTipo() + " - Marca: " + this.getMarca()
                + " - Referencia: " + this.getReferencia() + " - Año: " + this.getAno() + " - Cantidad de puestos: " + this.getCantidadPuesto();
        return informacion;
    }

    public String consultarAtributos() {
         String informacion = "Nombre: " + this.getNombre() + " - Placa: " + this.getPlaca() + " - Tipo: " + this.getTipo() + " - Marca: " + this.getMarca()
                + " - Referencia: " + this.getReferencia() + " - Año: " + this.getAno() + " - Cantidad de puestos: " + this.getCantidadPuesto();
        return informacion;
    }

    public void cambiarAtributo(String caracteristica, String nuevo) {
          if (caracteristica.equalsIgnoreCase("nombre")){
            this.setNombre(nombre);
        }
    }

    @Override
    public void Crear(Transporte t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
