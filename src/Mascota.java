public class Mascota {

    private String nombre;
    private String especie;
    private int edad;


    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Información de la mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println();
    }


    public void cumplirAnios() {
        edad++;
        System.out.println("¡" + nombre + " ha cumplido un año! Ahora tiene " + edad + " años.\n");
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear una mascota
        Mascota miMascota = new Mascota("Luna", "Gato", 3);


        System.out.println("=== INFORMACIÓN INICIAL ===");
        miMascota.mostrarInfo();


        miMascota.cumplirAnios();


        System.out.println("=== INFORMACIÓN ACTUALIZADA ===");
        miMascota.mostrarInfo();
    }
}