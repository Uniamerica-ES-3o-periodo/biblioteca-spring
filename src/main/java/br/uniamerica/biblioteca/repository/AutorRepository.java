package br.uniamerica.biblioteca.repository;

import br.uniamerica.biblioteca.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findByNomeStartingWith(String name);
}
