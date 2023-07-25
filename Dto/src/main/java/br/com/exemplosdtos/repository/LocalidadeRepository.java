package br.com.exemplosdtos.repository;

import br.com.exemplosdtos.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Integer> {

}
