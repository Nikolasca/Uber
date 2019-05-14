/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Nikolas
 */
public interface interfaceGrupo {
    
   // public void TraerAlgunDatoImportante();
    public String getTipo();
    public void setTipo(String tipo, String Nombre);
    public String getPlaca();
    public void setPlaca(String placa, String Nombre);
    public int getCapacidad();
    public void setCapacidad(int capacidad, String Nombre);
    public String getReferencia();
    public String getNombre();
    public void setReferencia(String referencia, String Nombre);
   public int getId();
   public void setNombre(String nombre);
    
   
    
}
