package com.mr.alumnos.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	import lombok.Data;



@Data
@Entity
@Table(name = "rol")
public class Persona {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_rol")
    private Long id_rol;

	private String rol;

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
