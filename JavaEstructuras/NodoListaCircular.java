package JavaEstructuras;

public class NodoListaCircular {
    tipoLavado dato;
    NodoListaCircular next;

    public NodoListaCircular(tipoLavado dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

    
    public tipoLavado getDato() {
        return dato;
    }

    public void setDato(tipoLavado dato) {
        this.dato = dato;
    }

    public NodoListaCircular getNext() {
        return next;
    }

    public void setNext(NodoListaCircular next) {
        this.next = next;
    }
    
    
}
