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

public class ViajeService{
  private Singleton s = Singleton.getSingle();
@RequestMapping(value = "/Nuevo_Viaje", method = RequestMethod.POST)
@ResponseBody
   public String  RegistroViaje(String punto_inicio, String punto_final, Pasajero Cliente, Conductor conductor) {
        


        return "hola" ;
        
    }
}