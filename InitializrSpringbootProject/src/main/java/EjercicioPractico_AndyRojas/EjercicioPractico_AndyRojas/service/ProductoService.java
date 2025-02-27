package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service;

import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.domain.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> listarProductos();
    Producto obtenerProductoPorId(Long id);
    void guardarProducto(Producto producto);
    void eliminarProducto(Long id);
}
