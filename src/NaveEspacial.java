public class NaveEspacial {
    private static final int MAX_COMBUSTIBLE = 100;
    private static final int COMBUSTIBLE_DESPEGUE = 10;
    private static final int COMBUSTIBLE_POR_DISTANCIA = 1;

    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, MAX_COMBUSTIBLE);
    }

    public boolean despegar() {
        if (combustible < COMBUSTIBLE_DESPEGUE) {
            System.out.println(nombre + " no puede despegar. Se necesitan " + COMBUSTIBLE_DESPEGUE +
                    " unidades (actual: " + combustible + ")");
            return false;
        }
        combustible -= COMBUSTIBLE_DESPEGUE;
        System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        return true;
    }

    public boolean avanzar(int distancia) {
        int combustibleNecesario = distancia * COMBUSTIBLE_POR_DISTANCIA;
        if (combustibleNecesario > combustible) {
            System.out.println(nombre + " no puede avanzar " + distancia +
                    " unidades. Se necesitan " + combustibleNecesario +
                    " (actual: " + combustible + ")");
            return false;
        }
        combustible -= combustibleNecesario;
        System.out.println(nombre + " avanzó " + distancia +
                " unidades. Combustible restante: " + combustible);
        return true;
    }

    public boolean recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println(nombre + ": La recarga debe ser mayor que 0.");
            return false;
        }
        int nuevoCombustible = combustible + cantidad;
        if (nuevoCombustible > MAX_COMBUSTIBLE) {
            int exceso = nuevoCombustible - MAX_COMBUSTIBLE;
            combustible = MAX_COMBUSTIBLE;
            System.out.println(nombre + " recargó " + (cantidad - exceso) +
                    " unidades (límite alcanzado: " + MAX_COMBUSTIBLE + ")");
        } else {
            combustible = nuevoCombustible;
            System.out.println(nombre + " recargó " + cantidad +
                    " unidades. Combustible actual: " + combustible);
        }
        return true;
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ": Combustible = " +
                combustible + "/" + MAX_COMBUSTIBLE);
    }

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Explorador-X", 50);
        nave.avanzar(60);
        nave.recargarCombustible(40);
        nave.avanzar(60);
        nave.mostrarEstado();
    }
}