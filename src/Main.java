public class Main {
    public static void main(String[] args) {


        Persona persona= new Persona();

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNumero());

        System.out.println("------Ingresando Datos -----------------------------------------");
        persona.setEdad(25);
        persona.setNombre("Angel Salazar");
       persona.setNumero("561558899654");

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNumero());



    }
}

class Persona{

private int edad;
private String nombre;
private String numero;


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public int getEdad() {
        return edad;
    }


    public String getNumero() {
        return numero;
    }


    public String getNombre() {
        return nombre;
    }
}