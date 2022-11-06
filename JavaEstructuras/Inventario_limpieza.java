package JavaEstructuras;

public class Inventario_limpieza {
    private int id;
    private String Descripcion;
    private double precio;

    public Inventario_limpieza(int id, String Descripcion, double precio) {
        this.id = id;
        this.Descripcion = Descripcion;
        this.precio = precio;
    }

    
    
    
    @Override
    public String toString() {
        return  "id: " + id +","+ ", Descripcion: " + Descripcion+ ", precio: $ " + precio +"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
