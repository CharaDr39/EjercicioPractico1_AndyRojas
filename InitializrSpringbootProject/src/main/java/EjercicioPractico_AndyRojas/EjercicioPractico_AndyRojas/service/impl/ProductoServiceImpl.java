package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service.impl;

import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.dao.ProductoDao;
import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.domain.Producto;
import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service.ProductoService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoDao productoDao;

    public ProductoServiceImpl(ProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public List<Producto> listarProductos() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void guardarProducto(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoDao.deleteById(id);
    }
}
