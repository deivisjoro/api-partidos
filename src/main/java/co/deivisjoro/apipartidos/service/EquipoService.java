package co.deivisjoro.apipartidos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.deivisjoro.apipartidos.entity.Equipo;

@Service
public interface EquipoService {
	
	List<Equipo> getEquipos();

}
