package uni7.cloud.numerosprimos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uni7.cloud.numerosprimos.model.NumeroPrimoEncontrado;

@Repository
public interface NumeroPrimoEncontradoRepository extends CrudRepository<NumeroPrimoEncontrado, Long> {

}
