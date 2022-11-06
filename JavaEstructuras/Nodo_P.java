package JavaEstructuras;

public class Nodo_P {
    private int id; 
    private String descripcion;
    private double precio;
    private Nodo_P abajo;

    public Nodo_P(int id, String descripcion, double precio) {
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

    public Nodo_P getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo_P abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return  "ID: " + id + ", " + descripcion + ", precio=" + precio  ;
    }



  
    
    
}

