/**
 * Created by André on 09-Jun-17.
 */
public class Main {

    public static void main(String[] args) {
        Persona p = new Persona("Andre",20,"Aldunate");
        Curso c = new Curso("Rojo", "Bloque D");
        Materia m = new Materia();
        m.setCodigo(15);
        m.setNombre(15);
        m.setCurso(c);
        Horario h= new Horario("Lunes", 12.5, m);
        Colegio col = new  Colegio("Americano",500,"Sopocachi" );
        p.mostrar();
        c.mostrar();
        System.out.println(m.toString());
        h.mostrar();
        col.mostrar();
        //hola

    }
}
