public class Gallina {
    private String nombre;
    private int huevosPuestos;
    private int edad;

    public Gallina(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            this.nombre = nuevoNombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío");
        }
    }

    public void ponerHuevo() {
        if (edad >= 1) {
            huevosPuestos++;
            System.out.println(nombre + " ha puesto un huevo. Total: " + huevosPuestos);
        } else {
            System.out.println(nombre + " es demasiado joven para poner huevos");
        }
    }

    public void cumplirAños() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años");
    }


    public void mostrarInfo() {
        System.out.println("\n=== INFORMACIÓN DE LA GALLINA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }


    public static void main(String[] args) {
        Gallina miGallina = new Gallina("Clarita", 0);

        miGallina.mostrarInfo();

        miGallina.ponerHuevo();

        miGallina.cumplirAños();
        miGallina.cumplirAños();

        miGallina.ponerHuevo();
        miGallina.ponerHuevo();

        miGallina.mostrarInfo();
    }
}