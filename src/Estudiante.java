public class Estudiante {

    private String apellido;
    private String nombre;
    private String curso;
    private double calificacion;


    public Estudiante(String apellido, String nombre, String curso, double calificacion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.curso = curso;
        this.calificacion = calificacion;
    }


    public void mostrarInfo() {
        System.out.println("Información del estudiante:");
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion = Math.min(10, calificacion + puntos);
            System.out.println("Calificación aumentada a: " + calificacion);
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion = Math.max(0, calificacion - puntos);
            System.out.println("Calificación disminuida a: " + calificacion);
        }
    }


    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Pérez", "Juan", "Programación", 7.5);


        estudiante1.mostrarInfo();


        estudiante1.subirCalificacion(1.5);  // Subirá a 9.0
        estudiante1.subirCalificacion(2.0);  // Solo subirá a 10.0 (no supera el máximo)


        estudiante1.bajarCalificacion(3.0);  // Bajará a 7.0
        estudiante1.bajarCalificacion(8.0);   // Solo bajará a 0.0 (no baja del mínimo)


        estudiante1.mostrarInfo();
    }
}