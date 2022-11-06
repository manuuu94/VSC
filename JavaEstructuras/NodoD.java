package JavaEstructuras;

public class NodoD {
    
    private Inventario_Pauto dato;
    private NodoD next;
    private NodoD back;

    public NodoD(Inventario_Pauto dato) {
        this.dato = dato;
    }

   @Override
    public String toString() {
        return " " + dato ;
    }
     
    

    public Inventario_Pauto getDato() {
        return dato;
    }

    public void setDato(Inventario_Pauto dato) {
        this.dato = dato;
    }

    public NodoD getNext() {
        return next;
    }

    public void setNext(NodoD next) {
        this.next = next;
    }

    public NodoD getBack() {
        return back;
    }

    public void setBack(NodoD back) {
        this.back = back;
    }
    
    
}

