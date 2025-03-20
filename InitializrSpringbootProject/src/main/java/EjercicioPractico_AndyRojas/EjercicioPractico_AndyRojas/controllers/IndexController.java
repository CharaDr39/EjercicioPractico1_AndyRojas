package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/")
    public String index() {
        return "farmacia/index"; // Retorna src/main/resources/templates/farmacia/index.html
    }
}
