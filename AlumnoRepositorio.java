package com.example.repositorio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.example.dominio.Alumno;

public class AlumnoRepositorio {
	Alumno[] data = {
		new Alumno("Oscar", "Diaz","Candia", 16),
		new Alumno("juana", "Castro","Osco", 13),
		new Alumno("Josefina", "Ruiz","Rodriguez", 18),
		new Alumno("Marco", "Chujutalli","Valencia", 14),
		new Alumno("Luz", "Vasquez","Salas", 11),
		new Alumno("Ana","Lopez","Suarez",20)
	};
	
	
//	public class AlumnoPromedioComparator implements Comparator<Alumno>{
//		public int compare(Alumno o1, Alumno o2) {
//			return o1.promedio.compareTo(o2.promedio);
//		}
//	}
//
//	public class AlumnoNombreComparator implements Comparator<Alumno> {
//		  public int compare( Alumno o1, Alumno o2) {
//		    return o1.nombres.compareTo(o2.nombres);
//		  }
//	}
//	
//	
//	public class AlumnoApellidoPaternoComparator implements Comparator<Alumno> {
//		  public int compare( Alumno o1, Alumno o2) {
//		    return o1.apellidoPaterno.compareTo(o2.apellidoPaterno);
//		  }
//	}
//	
//	
//	public List<Alumno> listarNombre() {
//		Arrays.sort(data, new AlumnoNombreComparator());
//		return Arrays.asList(data);
//	}
//
//	
//	public List<Alumno> listarApellido() {
//		Arrays.sort(data, new AlumnoApellidoPaternoComparator());
//		return Arrays.asList(data);
//	}
	
	public List<Alumno> listar() {

		return Arrays.asList(data);
	}
	
	
}
