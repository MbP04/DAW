package lib;

public class cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public cafetera(){
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public cafetera(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

}
