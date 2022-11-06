package JavaEstructuras;

public class Nodo_arbol_inventario_limpieza {
    
    private Nodo_arbol_inventario_limpieza hijoIzq;
    private Nodo_arbol_inventario_limpieza hijoDer;
    private int id;
    private String carrito;
   
    private String nombre;
    private String cedula;

    public Nodo_arbol_inventario_limpieza(int id, String carrito,String nombre,String cedula) {
        this.id = id;
        this.carrito= carrito;
        
        this.nombre=nombre;
        this.cedula=cedula;
    }
    
    

   

    public Nodo_arbol_inventario_limpieza getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo_arbol_inventario_limpieza hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo_arbol_inventario_limpieza getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo_arbol_inventario_limpieza hijoDer) {
        this.hijoDer = hijoDer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
    @Override
    public String toString() {
        return "" + "" + "" + "id= " + id + ", " + carrito+"\n" ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCarrito() {
        return carrito;
    }

    public void setCarrito(String carrito) {
        this.carrito = carrito;
    }
}
