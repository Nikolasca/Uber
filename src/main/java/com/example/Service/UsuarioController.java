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

@Controller
@RequestMapping("/servicio")
public class UsuarioController{
    private Singleton s = Singleton.getSingle();
    
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String  Hola(@PathVariable("name") String name) {
        return name ;
        
    }

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
                return mensaje = "Usuario Aceptado,"+usuario.getUsuario()+","+usuario.getPassword()+","+usuario.getTipo_Usuario()+","+usuario.getEmail()+","+usuario.getId()+",";
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
        ArrayList <Usuario> c = new ArrayList();
        ArrayList<Usuario> usuarios = s.getUsuarios();
        for (Usuario usuario : usuarios) {
            if(usuario.getTipo_Usuario().compareTo("Conductor")==0){
               c.add(usuario);    
            }
            
        }
        return c;

    }
    @RequestMapping(value = "/Conductores", method = RequestMethod.POST)
    @ResponseBody
    public String ActualizarLocation (@RequestParam("id") int ID, @RequestParam("Lat") String Lat, @RequestParam("Long") String Long){
        s.AnadirCoordenadas(ID,Lat,Long);
        return "Posicion Actualizada";
    }


}


    
