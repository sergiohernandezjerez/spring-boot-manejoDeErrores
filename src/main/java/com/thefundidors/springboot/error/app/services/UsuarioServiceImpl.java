package com.thefundidors.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thefundidors.springboot.error.app.models.domains.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private List<Usuario> lista;
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		lista.add(new Usuario(1, "Andrés", "Guzman"));
		lista.add(new Usuario(2, "Pepa", "Gómez"));
		lista.add(new Usuario(3, "Lalo", "Pérez"));
		lista.add(new Usuario(4, "Luci", "Fernández"));
		lista.add(new Usuario(5, "Pato", "Jiménez"));
		lista.add(new Usuario(6, "Paco", "Guardiola"));
		lista.add(new Usuario(7, "Juan", "López"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario usuarioEncontrado = null;
		for (Usuario usuario : lista) {
			if(usuario.getId().equals(id)) {
				usuarioEncontrado = usuario;
				break;
			}
		}
		return usuarioEncontrado;
	}

}
