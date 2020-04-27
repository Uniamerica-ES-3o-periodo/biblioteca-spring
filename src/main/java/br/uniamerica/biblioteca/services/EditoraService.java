package br.uniamerica.biblioteca.services;

import br.uniamerica.biblioteca.domain.Editora;
import br.uniamerica.biblioteca.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraService {

    private final EditoraRepository editoraRepository;

    @Autowired
    public EditoraService(EditoraRepository editoraRepository) {
        this.editoraRepository = editoraRepository;
    }

    public Editora save(Editora editora) {
        return editoraRepository.save(editora);
    }

    public List<Editora> findAll() {
        return editoraRepository.findAll();
    }

    public Optional<Editora> findById(Long id) {
        return editoraRepository.findById(id);
    }

    public List<Editora> findByName(String name) {
        return editoraRepository.findByNomeStartingWith(name);
    }

    public Editora update(Editora editora) {
        Editora editoraSalva = new Editora();
        if (editora.getId() != null) {
            editoraSalva = this.save(editora);
        }
        return editoraSalva;
    }

    public void delete(Long id) {
        editoraRepository.deleteById(id);
    }
}
