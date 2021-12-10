package co.deivisjoro.apipartidos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.deivisjoro.apipartidos.entity.Equipo;
import co.deivisjoro.apipartidos.service.EquipoService;

@RestController
@RequestMapping("/equipos")
@CrossOrigin("*")
public class EquipoController {
	
	@Autowired
	private EquipoService equipoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Equipo> getEquipos(){
		return this.equipoService.getEquipos();
	}

}
