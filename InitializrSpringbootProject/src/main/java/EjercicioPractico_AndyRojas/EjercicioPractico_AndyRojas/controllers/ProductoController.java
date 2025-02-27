package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.controllers;

import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service.impl.ProductoService;
import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.getProductos());
        return "farmacia/productos";
    }

    @PostMapping("/productos/agregar")
    public String agregarProducto(@RequestParam String nombre, @RequestParam double precio) {
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        productoService.guardarProducto(producto);
        return "redirect:/productos";
    }
}
