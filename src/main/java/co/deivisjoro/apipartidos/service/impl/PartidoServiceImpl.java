package co.deivisjoro.apipartidos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.deivisjoro.apipartidos.entity.Partido;
import co.deivisjoro.apipartidos.repository.PartidoRepository;
import co.deivisjoro.apipartidos.service.PartidoService;

@Service
public class PartidoServiceImpl implements PartidoService{

	@Autowired
	private PartidoRepository partidoRepository;
	
	@Override
	public List<Partido> getPartidos() {
		return this.partidoRepository.findAll();
	}

	@Override
	public Partido getPartido(Integer id) {
		Optional<Partido> partido = this.partidoRepository.findById(id);
		if(partido.isPresent()) {
			return partido.get();
		}
		else {
			return new Partido();
		}
	}

	@Override
	public Partido addPartido(Partido partido) {
		return this.partidoRepository.save(partido);
	}

	@Override
	public Partido editPartido(Partido partido) {
		return this.partidoRepository.save(partido);
	}

}
