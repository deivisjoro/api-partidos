package co.deivisjoro.apipartidos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.deivisjoro.apipartidos.entity.Equipo;
import co.deivisjoro.apipartidos.repository.EquipoRepository;
import co.deivisjoro.apipartidos.service.EquipoService;

@Service
public class EquipoServiceImpl implements EquipoService{
	
	@Autowired
	private EquipoRepository equipoRepository;

	@Override
	public List<Equipo> getEquipos() {
		return this.equipoRepository.findAll();
	}

}
