package com.example.Controller;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio")
public class UsuarioController{
    @RequestMapping(method = RequestMethod.GET)
    public String  Hola() {
        return "Hola Níkolas";
        
    }



}
    
