package com.rinku.empleados.interfaceService;

import java.util.List;
import java.util.Optional;

import com.rinku.empleados.modelo.Persona;

public interface IPersonaService {
	public List<Persona>listar();
	public Optional<Persona>listId(int id);
	public int save (Persona p);
	public void delete (int id);
}
