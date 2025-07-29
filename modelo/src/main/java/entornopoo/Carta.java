package entornopoo;

public class Carta {

    private String nombre;
    private int numero;
    private String palo;
    private String material;
    private double precio;
    private boolean esFigura;


    // // Constructor Vacio
    // public Carta() {
    //     this.nombre = "Cinco";
    //     this.numero = 5;
    //     this.palo = "Picas";
    //     this.esFigura = false;
    //     this.material = "Carton";
    //     this.precio = 3000;
    // }

    // Por defecto??
    // public Carta() {}

    public Carta(String nombre, int numero, String palo, String material, double precio, boolean esFigura) {
        this.nombre = nombre;
        this.numero = numero;
        this.palo = palo;
        this.material = material;
        this.precio = precio;
        this.esFigura = esFigura;
    }



    public String getNombre() {
        return this.nombre;
    }
    public int getNumero() {
        return this.numero;
    }
    public String getPalo() {
        return this.palo;
    }
    public String getMaterial() {
        return this.material;
    }
    public double getPrecio() {
        return this.precio;
    }
    public boolean isEsFigura() {
        return this.esFigura;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumero(int numero) {
        if (numero < 1 || numero > 13) {
            throw new IllegalArgumentException("El número de la carta debe estar entre 1 y 13.");
        }
        this.numero = numero;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setPrecio(double precio) {
        if (precio >= 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }
    public void setEsFigura(boolean esFigura) {
        this.esFigura = esFigura;
    }

@Override
    public String toString() {
        return("Carta :" +
                ", nombre :'" + nombre  +
                ", numero :" + numero +
                ", palo :" + palo  +
                ", material :" + material  +
                ", precio :" + precio + 
                ", esFigura :" + esFigura );
    }



}
