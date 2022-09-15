package edu.ar.unlu.pruebalibro;

public class Libro {
	private String autor;
	private String titulo;
	private String isbn;
	private int cantEjemplaresDisponibles;
	private int cantPrestados;
	private int cantPaginas;
	static private int cantPrestamosTotales;

	public Libro(String autor, String titulo, int cantEjemplares, int cantPaginas, String isbn) {
		this.autor = autor;
		this.titulo = titulo;
		this.cantEjemplaresDisponibles = cantEjemplares;
		this.cantPaginas = cantPaginas;
		this.cantPrestados = 0;
		this.isbn = isbn;
	}

	public Libro(String autor, String titulo, int cantEjemplares, int cantPaginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.cantEjemplaresDisponibles = cantEjemplares;
		this.cantPaginas = cantPaginas;
	}

	static public int getcantPrestamosTotales() {
		return cantPrestamosTotales;
	}

	public String descripcion() {
		String resultado;
		resultado = ("El libro " + this.titulo + " creado por el autor " + this.autor + " tiene " + this.cantPaginas
				+ " paginas, quedan " + this.cantEjemplaresDisponibles + " disponibles y se prestaron "
				+ this.cantPrestados + ".");
		return resultado;
	}

	public String getAutor() {
		return this.autor;

	}

	public String getTitulo() {
		return this.titulo;

	}

	public String getIsbn() {
		return this.isbn;

	}

	public int getCantPaginas() {
		return this.cantPaginas;
	}

	public int getCantidadEjemplares() {
		return this.cantEjemplaresDisponibles;
	}

	public int getCantidadDePrestamos() {
		return this.cantPrestados;
	}

	public boolean prestamo() {
		if (this.cantEjemplaresDisponibles > 1) {
			this.cantPrestados++;
			this.cantEjemplaresDisponibles--;
			cantPrestamosTotales++;
			return true;

		} else {
			return false;
		}
	}

	public void devolucion() {
		this.cantEjemplaresDisponibles++;
		this.cantPrestados--;

	}

	public int getCantidadTotalesDeEjemplares() {
		return this.cantEjemplaresDisponibles + this.cantPrestados;
	}

	public void agregarCantEjemplares(int cantEjemplaresAAgregar) {
		this.cantEjemplaresDisponibles += cantEjemplaresAAgregar;
	}

	public void eliminarCantEjemplares(int cantEjemplaresAEliminar) {
		this.cantEjemplaresDisponibles -= cantEjemplaresAEliminar;
	}

	public boolean buscarPorAutor(String autor) {
		if (this.autor == autor) {
			return true;
		} else {
			return false;
		}

	}

	public boolean buscarPorTitulo(String titulo) {
		if (this.titulo == titulo) {
			return true;

		} else {
			return false;
		}
	}
	
	public boolean buscarPorIsbn(String isbn) {
		if(this.isbn == isbn) {
			return true;
		}else {
			return false;
		}
	}

}
