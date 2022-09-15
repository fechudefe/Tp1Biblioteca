package edu.ar.unlu.pruebalibro;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro("Federico", "Una Noche Programando", 5, 300);
		Libro l2 = new Libro("Federico", "hola que haces", 1, 301);
		Libro arregloBiblioteca[] = {l1,l2}; 
		System.out.println(l1.descripcion());
		System.out.println("Los prestamos historicos de todos los libros son: " + Libro.getcantPrestamosTotales());

		// Cual de los dos libros tiene mayor cantida de paginas

		if (l1.getCantPaginas() > l2.getCantPaginas()) {
			System.out.println("El primer libro tiene mayor cantidad de paginas.");

		} else if (l1.getCantPaginas() == l2.getCantPaginas()) {
			System.out.println("Los dos libros tienen la misma cantidad de paginas.");
		} else {
			System.out.println("El segundo libro tiene mas cantidad de paginas.");
		}

		if (l2.prestamo()) {
			System.out.println("Se puedo realizar");
		} else {
			System.out.println("No se pudo realizar");
		}
		l1.prestamo();
		l1.prestamo();
		l1.prestamo();
		l1.prestamo();

		System.out.println("Cantidad de ejemplares en total: " + l1.getCantidadTotalesDeEjemplares());

		System.out.println(l1.getCantidadEjemplares());
		System.out.println(l1.getCantidadDePrestamos());
		System.out.println("Atributo de clase " + Libro.getcantPrestamosTotales());

		l1.agregarCantEjemplares(10);
		l1.eliminarCantEjemplares(10);
		System.out.println("Cantidad de ejemplare:" + l1.getCantidadEjemplares());
		System.out.println(l1.getCantidadTotalesDeEjemplares());
		
		for (Libro libro : arregloBiblioteca) {
			if (libro.buscarPorAutor("Federico")){
				System.out.println("Libros con ese autor: "+ libro.getTitulo());
			}
				
		System.out.println("Hola, soy un cambio para git");		
				
			
		
		}
		
		
	}

}