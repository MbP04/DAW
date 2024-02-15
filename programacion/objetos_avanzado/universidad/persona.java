public class persona {
    String nombre;
    String apellidos;
    direccion direccion;
    String nif;

    public persona(String nombre, String apellidos, String nif, direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;
    }

    public persona(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = new direccion(null, null, null, null);
    }

    @Override
    public String toString() {
        return "persona [nombre=" + nombre + ", apellidos=" + apellidos + ", " + direccion + ", nif=" + nif
                + "]";
    }

}
