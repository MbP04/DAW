public class profesor extends persona {
    String ndespacho;

    public profesor() {
        super("", "", "");
    }

    public profesor(String nombre, String apellidos, String nif, String ndespacho) {
        super(nombre, apellidos, nif);
        this.ndespacho = ndespacho;
    }

    public profesor(String nombre, String apellidos, String nif, direccion direccion, String ndespacho) {
        super(nombre, apellidos, nif, direccion);
        this.ndespacho = ndespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "profesor [despacho=" + ndespacho + "]";
    }

}
