package es.cic.curso.grupo7.ejercicio020.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import es.cic.curso.grupo7.ejercicio020.repository.Identificable;


@Entity
@Table(name="SESION")
public class Sesion implements Identificable<Long>  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1971606077299347265L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idSesion;
	
	
	@Column(name="aforoLibre")
	private int aforoLibre;
	
	@Column(name="aforoOcupado")
	private int aforoOcupado;

	@Column(name="numeroSesion")
	private int numeroSesion;
	
	@Transient
	private boolean cerrado;
	
	@ManyToOne()
	@JoinColumn(name="id_sala")
	private Sala sala;
	
	
	//Getters and Setterss
	
	public int getAforoOcupado() {
		return aforoOcupado;
	}
	public void setAforoOcupado(int aforoOcupado) {
		this.aforoOcupado = aforoOcupado;
	}
	public int getAforoLibre() {
		return aforoLibre;
	}
	public void setAforoLibre(int aforoLibre) {
		this.aforoLibre = aforoLibre;
	}
	public void vendeEntrada(int x){
		aforoLibre -= x;
		aforoOcupado += x;
	}


	public Long getId() {
		return idSesion;
	}

	public void setId(Long id) {
		this.idSesion = id;
	}

	public boolean isCerrado() {
		return cerrado;
	}
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
	public Long getIdSesion() {
		return idSesion;
	}
	public void setIdSesion(Long idSesion) {
		this.idSesion = idSesion;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	@Override
	public String toString() {
		return "Sesion [idSesion=" + idSesion + ", aforoLibre=" + aforoLibre + ", aforoOcupado=" + aforoOcupado
				 + ", cerrado=" + cerrado + ", sala=" + sala + "]";
	}
	public int getNumeroSesion() {
		return numeroSesion;
	}
	public void setNumeroSesion(int numeroSesion) {
		this.numeroSesion = numeroSesion;
	}
	
	
	
}
