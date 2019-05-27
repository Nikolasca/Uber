package com.example.Controller;

import java.util.ArrayList;
import AdapterPackage.Adapter;
import AdapterPackage.Administrador;
import AdapterPackage.Conductor;
import AdapterPackage.Pasajero;
import AdapterPackage.Usuario;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import servlet.Singleton;
import Proxy.Proxy;
@Controller
@RequestMapping("/servicio")
public class UsuarioController{
    private Singleton s = Singleton.getSingle();
    private Proxy proxy = new Proxy();

    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    @ResponseBody
    public String  Register(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("telefono") int telefono, @RequestParam("pass") String pass, @RequestParam("type") String type) {
        String mensaje = "";
        if (type.compareTo("Conductor") == 0) {
            Usuario user = new Conductor();
            user.setId(s.getUsuarios().size() + 1);
            user.setTipo_Usuario(type);
            user.setUsuario(name);
            user.setPassword(pass);
            user.setEmail(email);
            user.setTelefono(telefono);

            LALALA();
            s.Add(user);
             mensaje = "Conductor Creado"+"Nombre: "+name;
            return  mensaje;

        } else if (type.compareTo("Pasajero") == 0) {
            Usuario user = new Pasajero();
            user.setId(s.getUsuarios().size() + 1);
            user.setTipo_Usuario(type);
            user.setUsuario(name);
            user.setPassword(pass);
            user.setEmail(email);
            user.setTelefono(telefono);
            s.Add(user);
            LALALA();
             mensaje = "Pasajero Creado";
            return  mensaje;
        } else if (type.compareTo("Administrador") == 0) {
            Usuario user = new Adapter();
            user.setId(s.getUsuarios().size() + 1);
            user.setTipo_Usuario(type);
            user.setUsuario(name);
            user.setPassword(pass);
            user.setEmail(email);
            user.setTelefono(telefono);
            s.Add(user);
            mensaje = "Administrador Creado";
            return  mensaje;
        }
        return mensaje;
   
    }
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    @ResponseBody
    public String Login(@RequestParam("user") String user, @RequestParam("pass") String pass){
           
        String mensaje= "Vacio";
        boolean x = false;
        ArrayList<Usuario> usuarios = s.getUsuarios();
        if(usuarios.size()==0){
        return mensaje;
        }
        mensaje = String.valueOf(usuarios.size());
        for (Usuario usuario : usuarios) {
            if ((usuario.getUsuario().compareTo(user) == 0) && (usuario.getPassword().compareTo(pass) == 0)) {
                x = true;
                return mensaje = "UsuarioAceptado,"+usuario.getUsuario()+","+usuario.getPassword()+","+usuario.getTipo_Usuario()+","+usuario.getEmail()+","+usuario.getId()+",";
            }

        }
        if (x == false) {
              return mensaje = "No se encontro usuario - Revisar Usuario y contraseña";
        }


        return mensaje;

    }
     
    @RequestMapping(value = "/Conductores", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList <Usuario> TraerConductores (){
        Usuario so = new Conductor();
        so.setUsuario("Prueba");
        so.setTipo_Usuario("Conductor");
        so.setPassword("123");
        so.setLat(37.41745719539887);
        so.setLong(-122.084046);
        ArrayList <Usuario> c = new ArrayList();
        c.add(so);
        
        return c;

    }
    @RequestMapping(value = "/UpdateL", method = RequestMethod.POST)
    @ResponseBody
    public String ActualizarLocation (@RequestParam("id") int ID, @RequestParam("Lat") double Lat, @RequestParam("Long") double Long){
        s.AnadirCoordenadas(ID,Lat,Long);
        return "Posicion Actualizada";
    }

    public void LALALA(){
        Usuario so = new Conductor();
        so.setUsuario("Prueba");
        so.setTipo_Usuario("Conductor");
        so.setPassword("123");
        so.setLat(37.41745719539887);
        so.setLong(-122.084046);
        s.Add(so);

        
    }
    
    @RequestMapping(value = "/Acceso", method = RequestMethod.POST)
    @ResponseBody
    public String AccesoGeneral(@RequestParam("cadena") String Acceso) throws NoSuchMethodException{
        String res = "Nada";
        try{
        res = proxy.llamarMetodoGeneral(Acceso);
        }
        catch(Exception E){
            res = E.getMessage();
        }
        finally {
        return res;
        }

      
    }

    @RequestMapping(value = "/Crear", method = RequestMethod.POST)
    @ResponseBody
    public String Crear(@RequestParam("nombre") String nombre, @RequestParam("pass") String pass, @RequestParam("tipo") String tipo, @RequestParam("nombreCompleto") String nombreCompleto,@RequestParam("telefono")int telefono, @RequestParam("documento")String documento,@RequestParam("email")String email) throws NoSuchMethodException{

       proxy.crearUsuario(nombre, pass, tipo,nombreCompleto,telefono,documento,email);
        
       return "Se creo el usuario";


      
    }
}


    
