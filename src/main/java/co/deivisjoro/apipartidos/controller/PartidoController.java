package co.deivisjoro.apipartidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.deivisjoro.apipartidos.entity.Partido;
import co.deivisjoro.apipartidos.service.PartidoService;

@RestController
@RequestMapping("/partidos")
@CrossOrigin("*")
public class PartidoController {
	
	@Autowired
	private PartidoService partidoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Partido> getPartidos(){
		return this.partidoService.getPartidos();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Partido getPartido(@PathVariable("id") Integer id) {
		return this.partidoService.getPartido(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Partido addPartido(@RequestBody Partido partido) {
		return this.partidoService.addPartido(partido);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Partido editPartido(@RequestBody Partido partido) {
		return this.partidoService.editPartido(partido);
	}

}
