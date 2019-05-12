package com.example.Controller;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@RequestMapping("/servicio")
public class UsuarioController{
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String  Hola(@PathVariable("name") String name) {
        return name ;
        
    }

}
    
