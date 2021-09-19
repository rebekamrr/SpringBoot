package com.social.sociall.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.social.sociall.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public List<Usuario> findByIdadeAndCpf(Integer idade, String cpf);

	   @Query("SELECT u FROM Usuario u where u.idade>=60")
	   public List<Usuario> getUsuariosIdosos();
	}

