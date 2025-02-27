package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FarmaciaController {
    
    @GetMapping("/productos")
    public String productos() {
        return "farmacia/productos"; // Apunta a templates/farmacia/productos.html
    }

    @GetMapping("/categorias")
    public String categorias() {
        return "farmacia/categorias"; // Apunta a templates/farmacia/categorias.html
    }

    @GetMapping("/formulario")
    public String formulario() {
        return "farmacia/formulario"; // Apunta a templates/farmacia/formulario.html
    }
}
