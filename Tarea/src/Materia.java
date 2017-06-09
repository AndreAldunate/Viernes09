public class Materia {
	private int codigo;
	private int nombre;
	private Curso curso;

	@Override
	public String toString() {
		return "Materia: " + nombre + " con el codigo: " + codigo
				+ " en el curso: " + curso;
	}
}
