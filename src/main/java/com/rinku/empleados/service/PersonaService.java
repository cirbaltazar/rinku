package com.rinku.empleados.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rinku.empleados.interfaceService.IPersonaService;
import com.rinku.empleados.interfaces.IPersona;
import com.rinku.empleados.modelo.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listar() {
		 return (List<Persona>)data.findAll();
		
	}

	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res=0;
		Persona persona=data.save(p);
		if(!persona.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Optional<Persona> listId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

}
