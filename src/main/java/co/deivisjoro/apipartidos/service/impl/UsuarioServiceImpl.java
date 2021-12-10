package co.deivisjoro.apipartidos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.deivisjoro.apipartidos.entity.Usuario;
import co.deivisjoro.apipartidos.repository.UsuarioRepository;
import co.deivisjoro.apipartidos.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario registar(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public Usuario login(Usuario usuario) {
		return this.usuarioRepository.getByUsernameAndPassword(usuario.getUsername(), usuario.getPassword());
	}

}
