public class Materia {
	private int codigo;
	private int nombre;
	private Curso curso;

	@Override
	public String toString() {
		return "Materia: " + nombre + " con el codigo: " + codigo
				+ " en el curso: " + curso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
