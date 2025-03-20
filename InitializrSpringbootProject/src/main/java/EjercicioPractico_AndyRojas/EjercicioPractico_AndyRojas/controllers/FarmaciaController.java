package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FarmaciaController {
    
    @GetMapping("/categorias")
    public String categorias() {
        return "farmacia/categorias"; // Retorna src/main/resources/templates/farmacia/categorias.html
    }

    @GetMapping("/sugerencias")
    public String sugerencias() {
        return "farmacia/sugerencias"; // Retorna src/main/resources/templates/farmacia/sugerencias.html
    }
}
