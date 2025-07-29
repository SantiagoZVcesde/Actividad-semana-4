package entornopoo;

public class Termo {

    private String material;
    private double capacidadLitros;
    private String color;
    private boolean tieneAislamiento;
    private String tipoTapa;
    private String marca;


    //     // Constructor Vacio
    // public Reloj(){
    //     this.capacidadLitros = 3;
    //     this.tipoTapa = "DE Rosca";
    //     this.material = "acero";
    //     this.color = "Rojo";
    //     this.marca = "Zvs";
    //     this.tieneAislaminto = false;
    // }

     // Por defecto??
    // public Termo() {}


    public Termo() {
        this.tipoTapa = "De Rosca";
        this.capacidadLitros = 3;
        this.material = "Plastico";
        this.color = "Azul";
        this.marca = "Toto";
        this.tieneAislamiento = false;
    }

    public Termo(String material, double capacidadLitros, String color, boolean tieneAislamiento, String tipoTapa,
            String marca) {
        this.material = material;
        this.capacidadLitros = capacidadLitros;
        this.color = color;
        this.tieneAislamiento = tieneAislamiento;
        this.tipoTapa = tipoTapa;
        this.marca = marca;
    }

    public String getMaterial() {
        return this.material;
    }
    public double getCapacidadLitros() {
        return this.capacidadLitros;
    }
    public String getColor() {
        return this.color;
    }
    public boolean isTieneAislamiento() {
        return this.tieneAislamiento;
    }
    public String getTipoTapa() {
        return this.tipoTapa;
    }
    public String getMarca() {
        return this.marca;
    }



    public void setMaterial(String material) {
        this.material = material;
    }
    public void setCapacidadLitros(double capacidadLitros) {
        if (capacidadLitros < 0) {
            throw new IllegalArgumentException("La capacidad en litros no puede ser negativa.");    
        }
        this.capacidadLitros = capacidadLitros;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTieneAislamiento(boolean tieneAislamiento) {
        this.tieneAislamiento = tieneAislamiento;
    }
    public void setTipoTapa(String tipoTapa) {
        this.tipoTapa = tipoTapa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Termo: " +
                "material: " + material + '\'' +
                ", capacidadLitros: " + capacidadLitros +
                ", color: '" + color + '\'' +
                ", tieneAislamiento: " + tieneAislamiento +
                ", tipoTapa:" + tipoTapa + '\'' +
                ", marca: " + marca + '\'';
    }
}
