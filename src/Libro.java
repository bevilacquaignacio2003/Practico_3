import java.time.Year;
public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;

        if (añoValido(añoPublicacion)) {
            this.añoPublicacion = añoPublicacion;
        } else {
            this.añoPublicacion = Year.now().getValue();
            System.out.println("Año inválido. Se asignó el año actual.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int nuevoAño) {
        if (añoValido(nuevoAño)) {
            this.añoPublicacion = nuevoAño;
            System.out.println("Año actualizado correctamente.");
        } else {
            System.out.println("Error: El año debe estar entre 1900 y " + Year.now().getValue());
        }
    }
    private boolean añoValido(int año) {
        int añoActual = Year.now().getValue();
        return año >= 1900 && año <= añoActual;
    }

    public void mostrarInfo() {
        System.out.println("\nInformación del libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        libro1.mostrarInfo();

        System.out.println("\nIntentando cambiar a 1850 (inválido):");
        libro1.setAñoPublicacion(1850);

        System.out.println("\nIntentando cambiar a 2020 (válido):");
        libro1.setAñoPublicacion(2020);

        libro1.mostrarInfo();
    }
}