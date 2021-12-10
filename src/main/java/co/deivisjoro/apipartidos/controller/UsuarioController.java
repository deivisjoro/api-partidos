package co.deivisjoro.apipartidos.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.deivisjoro.apipartidos.entity.Usuario;
import co.deivisjoro.apipartidos.filter.RequestFilter;
import co.deivisjoro.apipartidos.service.UsuarioService;
import co.deivisjoro.apipartidos.util.UsuarioUtil;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	private Usuario addUsuario(@RequestBody Usuario usuario) {
		return this.usuarioService.registar(usuario);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	private UsuarioUtil login(@RequestBody Usuario usuario) {
		Usuario u = this.usuarioService.login(usuario);  
		if(u==null) {
			return new UsuarioUtil();
		}
		else {
			UsuarioUtil usuarioUtil = new UsuarioUtil();
			usuarioUtil.setId(u.getId());
			usuarioUtil.setNombre(u.getNombre());
			usuarioUtil.setCorreo(u.getCorreo());
			usuarioUtil.setUsername(u.getUsername());
			
			
			long tiempo = System.currentTimeMillis();
			String token = Jwts.builder()
					           .signWith(SignatureAlgorithm.HS256, RequestFilter.KEY)
					           .setSubject(u.getUsername())
					           .setIssuedAt(new Date(tiempo))
					           .setExpiration(new Date(tiempo + 900000))
					           .claim("username", u.getUsername())
					           .claim("correo", u.getCorreo())
					           .claim("id", u.getId())
					           .compact();
					           
		
			usuarioUtil.setToken(token);
			return usuarioUtil;
		}
	}


}
