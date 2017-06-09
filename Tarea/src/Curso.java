public class Curso {

    private String nombre;
    private String bloque;

    public Curso(String n, String b){
        nombre = n;
        bloque = b;
    }

    public void mostrar(){
        System.out.println("El nombre del curso es: " + nombre);
        System.out.println("El nombre del bloque del curso es: " + bloque);

    }
}
