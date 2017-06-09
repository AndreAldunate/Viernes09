
public class Colegio {
			
	private String nombre;
	private int alumnos;
	private String direccion;

    public Colegio (String n,int a,String d){
        nombre = n;
        alumnos = a;
        direccion = d;
    }


	
	public void mostrar(){
		System.out.println("El colegio es:" + nombre);
		System.out.println("Capacidad de alumnos: " + alumnos);
		System.out.println("Su direccion es" + direccion);
	}

}
