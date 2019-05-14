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

    @RequestMapping(value = "/Hola", method = RequestMethod.POST)
    @ResponseBody
    public String  Test(@RequestParam("name") String name) {
        return "Hola"+name ;
        
    }
    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    @ResponseBody
    public String  Register(@RequestParam("name") String name, @RequestParam("pass") String pass, @RequestParam("type") String type) {
        String mensaje = "";
        if (type.compareTo("Conductor") == 0) {
            Usuario user = new Conductor();
            user.setId(s.getUsuarios().size() + 1);
            user.setTipo_Usuario(type);
            user.setUsuario(name);
            user.setPassword(pass);
            s.Add(user);
             mensaje = "Conductor Creado";
            return  mensaje;

        } else if (type.compareTo("Pasajero") == 0) {
            Usuario user = new Pasajero();
            user.setId(s.getUsuarios().size() + 1);
            user.setTipo_Usuario(type);
            user.setUsuario(name);
            user.setPassword(pass);
            s.Add(user);
             mensaje = "Pasajero Creado";
            return  mensaje;
        } else if (type.compareTo("Administrador") == 0) {
            Usuario user = new Adapter();
            user.setId(s.getUsuarios().size() + 1);
            user.setTipo_Usuario(type);
            user.setUsuario(name);
            user.setPassword(pass);
            s.Add(user);
            mensaje = "Administrador Creado";
            return  mensaje;
        }
        return mensaje;
   
    }

}
    
