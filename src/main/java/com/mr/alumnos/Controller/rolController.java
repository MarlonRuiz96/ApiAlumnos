package com.mr.alumnos.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mr.alumnos.DaoRol.Impl.IDaoRol;
import com.mr.alumnos.Entity.Persona;


@RestController
@RequestMapping(value = ("/temporal"))
public class rolController {
	
	@Autowired
    private IDaoRol daoRol;
	
	@GetMapping(value = "/mostrar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> getClientes() {
		return daoRol.findAll();
	}
	
	@PostMapping(value = "/mostrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Persona saveCliente(@RequestBody Persona persona) {
		return daoRol.save(persona);
		
	}
	
	@PutMapping(value = "/mostrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Persona update(@RequestBody Persona persona){
		return daoRol.update(persona);
	}
	
	

}
