package JavaEstructuras;

public class NodoArbol {
    
    private int id;
    private String pedido;
    
    private NodoArbol hijoIzq;
    private NodoArbol hijoDer;

    public NodoArbol(int id, String pedido) {
        this.id = id;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }
    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }
    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}

