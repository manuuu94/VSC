package JavaEstructuras;

public class Inventario_Pauto {
    
    private int id;
    private String descripcion;
    private double precio;

    public Inventario_Pauto(int id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }



    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

        @Override
    public String toString() {
        return "Inventario_Pauto:" + id + ", descripcion:" + descripcion + ", precio: $" + precio;
    }
}
