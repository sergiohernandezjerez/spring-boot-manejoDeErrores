package com.thefundidors.springboot.error.app.services;

import java.util.List;

import com.thefundidors.springboot.error.app.models.domains.Usuario;

public interface UsuarioService {
	
	public List<Usuario> listar();
	
	public Usuario obtenerPorId(Integer id);

}
