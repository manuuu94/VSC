package JavaEstructuras;

public class NodoListaSimple {
    private Inventario_limpieza dato;
    private NodoListaSimple next;

    public NodoListaSimple(Inventario_limpieza dato) {
        this.dato = dato;
    }

    public Inventario_limpieza getDato() {
        return dato;
    }

    public void setDato(Inventario_limpieza dato) {
        this.dato = dato;
    }

    public NodoListaSimple getNext() {
        return next;
    }

    public void setNext(NodoListaSimple next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodoListaSimple: " + "dato= " + dato ;
    }
    
    
    
}

