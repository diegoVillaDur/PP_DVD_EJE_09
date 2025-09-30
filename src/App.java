import packages.Persona;

public class App {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 30, "Masculino");
        Persona p2 = new Persona("Ana", 25);
        Persona p3 = new Persona("Luis", 40, "Masculino");

        System.out.println("Nombre: " + p1.getNombre() + ", Edad: " + p1.getEdad() + ", Genero: " + p1.getGenero());
        System.out.println("Nombre: " + p2.getNombre() + ", Edad: " + p2.getEdad() + ", Genero: " + p2.getGenero());
        System.out.println("Nombre: " + p3.getNombre() + ", Edad: " + p3.getEdad() + ", Genero: " + p3.getGenero());
    }
}
