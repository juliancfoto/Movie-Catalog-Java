package domain;

public class Pelicula {
	private String nombre;

	// Constructores
	public Pelicula() {

	}

	public Pelicula(String nombre) {
		this.nombre = nombre;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Pelicula [Nombre: " + nombre + "]";
	}

}
