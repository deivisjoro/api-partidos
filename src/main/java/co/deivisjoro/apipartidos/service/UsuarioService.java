package co.deivisjoro.apipartidos.service;

import org.springframework.stereotype.Service;

import co.deivisjoro.apipartidos.entity.Usuario;

@Service
public interface UsuarioService {
	
	Usuario registar(Usuario usuario);
	Usuario login(Usuario usuario);

}
