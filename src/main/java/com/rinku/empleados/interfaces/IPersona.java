package com.rinku.empleados.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rinku.empleados.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer>{

}
