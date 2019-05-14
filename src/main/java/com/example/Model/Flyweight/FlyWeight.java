/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author Valentina
 */
public interface FlyWeight {

    public int getId();

    public void setId(int id);

    public String getNombrePasajero();

    public void setNombrePasajero(String nombrePasajero);

    public String getNombreConductor();

    public void setNombreConductor(String NombreConductor);

    public float getMonto();

    public void setMonto(float monto);

    public String getOtros();

    public void setOtros(String dato1, String dato2, String dato3);
    
   
   

    @Override
    public String toString();
}
