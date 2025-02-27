package EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.dao;

import EjercicioPractico_AndyRojas.EjercicioPractico_AndyRojas.domain.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long> {
}
