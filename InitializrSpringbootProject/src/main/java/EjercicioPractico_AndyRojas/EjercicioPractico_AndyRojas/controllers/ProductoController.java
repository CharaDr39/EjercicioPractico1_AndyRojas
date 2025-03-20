package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.controllers;

import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.domain.Producto;
import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.listarProductos());
        return "farmacia/productos"; // Retorna src/main/resources/templates/farmacia/productos.html
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("producto", new Producto());
        return "farmacia/producto_formulario"; // Retorna src/main/resources/templates/farmacia/producto_formulario.html
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/productos";
    }
}
