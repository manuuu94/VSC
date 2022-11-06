package JavaEstructuras;

public class tipoLavado {
    private int id;
    private String descripcion;
    private double precio;

    public tipoLavado() {
    }

    public tipoLavado(int id, String descripcion, double precio) {
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
        return "IDLavado: " + id + ", " + descripcion + ". Precio: $" + precio;
    }
    
    
}

