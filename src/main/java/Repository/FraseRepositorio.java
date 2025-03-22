package Repository;

import model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepositorio extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f ORDER BY function('RANDOM') LIMIT 1")
    Frase buscaFraseAleatoria();

}
