package co.deivisjoro.apipartidos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.deivisjoro.apipartidos.entity.Partido;

@Service
public interface PartidoService {
	
	List<Partido> getPartidos();
	Partido getPartido(Integer id);
	Partido addPartido(Partido partido);
	Partido editPartido(Partido partido);

}
