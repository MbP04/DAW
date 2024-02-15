public class direccion {
    String calle;
    String ciudad;
    String codigo;
    String pais;

    public direccion() {
    }

    public direccion(String calle, String ciudad, String codigo, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigo = codigo;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigo Postal=" + codigo + ", pais=" + pais
                + "]";
    }

}
