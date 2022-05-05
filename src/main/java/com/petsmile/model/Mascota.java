package com.petsmile.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMascota;
	
	@Column
	private Long rutDueño;
	
	@Column
	private String tipoMascota;
	
	@Column
	private Long edad;
	
	@Column
	private String nombreMascota;

	public Long getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Long idMascota) {
		this.idMascota = idMascota;
	}

	public Long getRutDueño() {
		return rutDueño;
	}

	public void setRutDueño(Long rutDueño) {
		this.rutDueño = rutDueño;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", rutDueño=" + rutDueño + ", tipoMascota=" + tipoMascota + ", edad="
				+ edad + ", nombreMascota=" + nombreMascota + "]";
	}
	
	

}
