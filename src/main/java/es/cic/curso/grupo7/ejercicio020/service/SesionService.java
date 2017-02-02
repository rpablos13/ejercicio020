package es.cic.curso.grupo7.ejercicio020.service;

public interface SesionService {
	
	public void aniadirSesion(Long idSesion);
	public void modificarSesion(Long idSesion, int aforoLibre, int aforoOcupado);

}
