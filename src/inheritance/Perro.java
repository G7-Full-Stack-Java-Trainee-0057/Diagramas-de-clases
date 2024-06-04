package inheritance;

public class Perro extends Animal {
    
    // Constructor heredado.
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Metodo propio de la clase.
    public void ladrar() {
        System.out.println("El perro ladra.");
    }

    // Metodo heredado.
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace un sonido.");
    }
}
