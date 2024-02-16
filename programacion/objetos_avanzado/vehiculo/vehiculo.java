public class vehiculo {
    public static int vehiculosCreados = 0;
    public static int kilometrosTotales = 0;
    int kilometrosRecorridos;

    public vehiculo() {
        this.kilometrosRecorridos = 0;
        vehiculosCreados++;
    }

    public void and(int distancia) {
        this.kilometrosRecorridos += distancia;
        kilometrosTotales += distancia;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}