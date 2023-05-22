/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 * 
 */
package Entidades;

/**
 *
 * @author Wendy
 */
public class Persona {

	private String nombre;
	private String apellido;
	private int edad, documento;
	private Perro perro;

	public Persona() {

	}

	public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
		this.perro = perro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	

	@Override
	public String toString() {
		return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
	}

	public void mostrarInformacion() {
		Perro perro1 = new Perro("Chiquita", "Lobo", "Grande", 5);
		Perro perro2 = new Perro("Caspian", "Beagle", "Mediano", 13);
		Persona persona1 = new Persona("Wendy", "Alvarado", 45, 54323, perro1);
		Persona persona2 = new Persona("Gabriel", "Rodriguez", 46, 12345, perro2);
		
		
		System.out.println("PERSONA 1");
		System.out.println("NOMBRE:" + persona1.getNombre());
		System.out.println("APELLIDO:" + persona1.getApellido());
		System.out.println("EDAD:" + persona1.getEdad());
		System.out.println("DOCUMENTO:" + persona1.getDocumento());
		System.out.println("PERRO:" + persona1.getPerro().toString());
		System.out.println("");
		System.out.println("PERSONA 2");
		System.out.println("NOMBRE:" + persona2.getNombre());
		System.out.println("APELLIDO:" + persona2.getApellido());
		System.out.println("EDAD:" + persona2.getEdad());
		System.out.println("DOCUMENTO:" + persona2.getDocumento());
		System.out.println("PERRO:" + persona2.getPerro().toString());
	}
}
	


