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
@RequestMapping("/servicioUbicacion")
public class TravelController{
    private Singleton s = Singleton.getSingle();

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


}