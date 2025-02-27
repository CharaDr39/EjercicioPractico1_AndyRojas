package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service;

import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.domain.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> getProductos();
    void guardarProducto(Producto producto);
}
