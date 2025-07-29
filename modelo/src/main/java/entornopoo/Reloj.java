package entornopoo;

public class Reloj {

    private double precio;
    private String nombre;
    private String material;
    private String color;
    private String marca;
    private boolean tieneCronometro;


    // // Constructor Vacio

    // public Reloj(){
    //     this.precio = 33.000;
    //     this.nombre = "Daitona";
    //     this.material = "Oro";
    //     this.color = "Azul";
    //     this.marca = "Rolex";
    //     this.tieneCronometro = false;
    // }

    // Por defecto??
    // public Reloj() {}

    public Reloj(double precio, String nombre, String material, String color, String marca, boolean tieneCronometro) {
        this.precio = precio;
        this.nombre = nombre;
        this.material = material;
        this.color = color;
        this.marca = marca;
        this.tieneCronometro = tieneCronometro;
    }



    public double getPrecio() {
        return this.precio;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getMaterial() {
        return this.material;
    }
    public String getColor() {
        return this.color;
    }
    public String getMarca() {
        return this.marca;
    }
    public boolean isTieneCronometro() {
        return this.tieneCronometro;
    }



    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setTieneCronometro(boolean tieneCronometro) {
        this.tieneCronometro = tieneCronometro;
    }


    @Override
    public String toString() {
        return "Reloj: " +
                "precio: " + precio +
                ", nombre: '" + nombre + '\'' +
                ", material: '" + material + '\'' +
                ", color: '" + color + '\'' +
                ", marca: '" + marca + '\'' +
                ", tieneCronometro: " + tieneCronometro;
    }


}
