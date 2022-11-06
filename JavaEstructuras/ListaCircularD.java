package JavaEstructuras;

public class ListaCircularD {

    private NodoD cabeza;
    private NodoD ultimo;

    public void inserta(Inventario_Pauto p) {
        if( cabeza == null){
    cabeza = new NodoD(p);
    ultimo = cabeza;
    ultimo.setNext(cabeza);
    cabeza.setBack(ultimo);
        }else if (p.getId() < cabeza.getDato().getId()){
            NodoD aux = new NodoD(p);
            aux.setNext(cabeza);
            cabeza = aux;
            cabeza.getNext().setBack(cabeza);
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if (ultimo.getDato().getId() <= p.getId()){
            ultimo.setNext(new NodoD(p));
            ultimo.getNext().setBack(ultimo);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else {
            NodoD aux = cabeza;
            while (aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
            }
            NodoD temp = new NodoD(p);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
            
        }
        }
    
    public boolean existe(int id) {
        NodoD reco=cabeza;
        while (reco!=null) {
            if (reco.getDato().getId()==id)
                return true;
            reco=reco.getNext();
        }
        return false;
    }

public void modifica(Inventario_Pauto p){
        if (cabeza != null){
            if (p.getId() >= cabeza.getDato().getId() && p.getId() <= ultimo.getDato().getId()) {
                NodoD aux = cabeza;
                while (aux != ultimo && aux.getDato().getId() < p.getId()){
                        aux = aux.getNext();
            }if (aux.getDato().getId() == p.getId()) {
                aux.getDato().setDescripcion(p.getDescripcion());
                aux.getDato().setPrecio(p.getPrecio());
            }
        }
    }
    }  

    public void eliminaValor(int id) {
        if (cabeza != null) {
            NodoD aux = cabeza;
            NodoD ant = null;
            while (aux != null) {
                if (aux.getDato().getId() == id) {
                    if (ant == null) {
                        cabeza = cabeza.getNext();
                        aux.setNext(null);
                        aux = cabeza;

                    } else {
                        ant.setNext(aux.getNext());
                        aux.setNext(null);
                        aux = ant.getNext();
                    }
                } else {
                    ant = aux;
                    aux = aux.getNext();
                }
            }
        }
    }
    
    public Inventario_Pauto pasar(int id){
        Inventario_Pauto p = null;
        if (cabeza != null){
            if ( cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if( cabeza.getDato().getId() == id){
                p = cabeza.getDato();
            }else{
                NodoD aux = cabeza;
                while (aux.getNext() != cabeza && aux.getNext().getDato().getId() < id) {
                    aux = aux.getNext();
                }
                if (aux.getNext().getDato().getId() == id){
                    p = aux.getNext().getDato();
                }
            }
        }
    }
        return p;
} 

    @Override
    public String toString() {
        NodoD aux = cabeza;
        String s = "Lista: \n";
        if (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + "\n";
                aux = aux.getNext();
            }

        } else {
            s += "Vacia";
        }
        return s;
    }

}

