/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPackage;

import Flyweight.FlyWeight;
import Flyweight.FlyWeightFactory;
import java.util.ArrayList;

/**
 *
 * @author Nikolas
 */
public abstract class Usuario {

    private String usuario;
    private String password;
    private String tipo_Usuario;
    private String nombre;
    private int telefono;
    private String documento;
    private String email;
    private int id;
    private double Lat;
    private double Long;
    private String estado;
    private ArrayList<Double> Ubicaciones = new ArrayList<>();
        
    public Usuario(String usuario, String password, String nombre, int telefono, String documento, String email, int id) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.telefono = telefono;
        this.documento = documento;
        this.email = email;
        this.id = id;
    }

   
    public Usuario(String Usuario, String Password, int id) {
        this.usuario = Usuario;
        this.password = Password;
        this.id = id;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public String getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(String Tipo_Usuario) {
        this.tipo_Usuario = Tipo_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String Permisos();

    public abstract FlyWeightFactory getFactory();

    public abstract void AnadirPago(FlyWeight i);

    public abstract String getPago(int id);

    public abstract String getPagos(String nombre);
    
    public abstract void crearTarjeta(String Num,String CVV, String FV);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double Lat) {
        this.Lat = Lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double Long) {
        this.Long = Long;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicaciones() {
        String ubicaciones="";
        for(int i=0;i<Ubicaciones.size();i+=2){
            ubicaciones+=Ubicaciones.get(i)+"/"+Ubicaciones.get(i+1)+"\n";
        }
        return ubicaciones;
    }

    public void setUbicaciones(double U1,double U2) {
        Ubicaciones.add(U1);
        Ubicaciones.add(U2);
    }
}
