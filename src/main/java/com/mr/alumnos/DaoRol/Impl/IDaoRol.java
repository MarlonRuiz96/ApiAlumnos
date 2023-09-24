package com.mr.alumnos.DaoRol.Impl;

import java.util.List;

import com.mr.alumnos.Entity.Persona;

public interface IDaoRol {

	public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona update(Persona persona);
}
