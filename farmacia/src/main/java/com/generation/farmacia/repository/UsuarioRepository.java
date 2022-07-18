package com.generation.farmacia.repository;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> 6db1d0d7112d3291aeefdbbf60f5c722b2688c87

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Usuario;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
<<<<<<< HEAD
	public Optional<Usuario> findByUsuario(String usuario);
=======
>>>>>>> 6db1d0d7112d3291aeefdbbf60f5c722b2688c87

}
