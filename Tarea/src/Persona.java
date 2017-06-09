/**
 * Created by adrian1 on 6/9/2017.
 */
    public class Persona {

        private String nombre;
        private int edad;
        private String apellido;

    public Persona (String n,int e,String a){
        nombre=n;
        edad=e;
        apellido=a;
    }

        public void mostrar() {
            System.out.println("El nombre de la persona es:" + nombre);
            System.out.println("La edad  de la persona es:" + edad);
            System.out.println("El apellido de la persona es:" + apellido);
    }

}
