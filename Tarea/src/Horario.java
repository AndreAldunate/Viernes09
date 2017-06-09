
public class Horario {
	private String dias;
	private double hora;
	private String materia;

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Horario(String d, double h, String m) {
		dias = d;
		hora = h;
		materia = m;
	}

	@Override
	public String toString() {
		return materia + " " + dias + " " + hora;
	}

}