package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service.impl;

import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.dao.ProductoDao;
import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.domain.Producto;
import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> getProductos() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public void guardarProducto(Producto producto) {
        productoDao.save(producto);
    }
}
