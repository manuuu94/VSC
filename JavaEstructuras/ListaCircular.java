package JavaEstructuras;

public class ListaCircular {
    NodoListaCircular cabeza;
    NodoListaCircular ultimo;
    
    public void inserta(tipoLavado p){
        if(cabeza == null){
            cabeza = new NodoListaCircular(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
        }else if (p.getId() < cabeza.getDato().getId()){
            NodoListaCircular aux = new NodoListaCircular(p);
            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);
        }else if (ultimo.getDato().getId() <= p.getId()){
            ultimo.setNext(new NodoListaCircular(p));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
        }else{
            NodoListaCircular aux = cabeza;
            while (aux.getNext().getDato().getId() < p.getId()){
                aux = aux.getNext();
            }
            NodoListaCircular temp = new NodoListaCircular(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
        ultimo.setNext(cabeza);
    }

    public boolean existe (int id){
        boolean esta = false;
        if(cabeza != null){
            if(id >= cabeza.getDato().getId() && id <= ultimo.getDato().getId()){
                NodoListaCircular aux = cabeza;
                while(aux != ultimo && aux.getDato().getId() < id){
                    aux = aux.getNext();
                }
                esta = (aux.getDato().getId() == id);
            }
        }
        return esta;
    }
    
    public tipoLavado pasar(int id){
        tipoLavado p = null;
        if (cabeza != null){
            if ( cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if( cabeza.getDato().getId() == id){
                p = cabeza.getDato();
            }else{
                NodoListaCircular aux = cabeza;
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
    
    public String existeCarrito(int id){
        boolean esta = false;
        String existeCarrito = " ";
        if(cabeza != null){
            if(id >= cabeza.getDato().getId() && id <= ultimo.getDato().getId()){
                NodoListaCircular aux = cabeza;
                while(aux != ultimo && aux.getDato().getId() < id){
                    aux = aux.getNext();
                }
                esta = (aux.getDato().getId() == id);
                if(esta == true){
                    existeCarrito = aux.getDato().getDescripcion();
                }else{
                    System.out.println("No existe lavado con ese ID");
                }
            }            
        }
        return existeCarrito;
    }
    
    public void modifica(tipoLavado p){
        if (cabeza != null){
            if (p.getId() >= cabeza.getDato().getId() && p.getId() <= ultimo.getDato().getId()) {
                NodoListaCircular aux = cabeza;
                while (aux != ultimo && aux.getDato().getId() < p.getId()){
                        aux = aux.getNext();
            }if (aux.getDato().getId() == p.getId()) {
                aux.getDato().setDescripcion(p.getDescripcion());
                aux.getDato().setPrecio(p.getPrecio());
            }
        }
    }
    }
    
    public void elimina (int id){
        if (cabeza != null){
            if ( cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if( cabeza.getDato().getId() == id){
                cabeza = cabeza.getNext();
                ultimo.setNext(cabeza);
            }else{
                NodoListaCircular aux = cabeza;
                while (aux.getNext() != cabeza && aux.getNext().getDato().getId() < id) {
                    aux = aux.getNext();
                }
                if (aux.getNext().getDato().getId() == id){
                    if(aux.getNext() == ultimo ){
                        ultimo = aux;
                    }
                    aux.setNext(aux.getNext().getNext());
                }
            }
        }
    }
}
    
    public tipoLavado extrae (int id){
        tipoLavado p = null;
        if (cabeza != null){
            if ( cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if( cabeza.getDato().getId() == id){
                p = cabeza.getDato();
                cabeza = cabeza.getNext();
                ultimo.setNext(cabeza);
            }else{
                NodoListaCircular aux = cabeza;
                while (aux.getNext() != cabeza && aux.getNext().getDato().getId() < id) {
                    aux = aux.getNext();
                }
                if (aux.getNext().getDato().getId() == id){
                    p = aux.getNext().getDato();
                    if(aux.getNext() == ultimo ){
                        ultimo = aux;
                    }
                    aux.setNext(aux.getNext().getNext());
                }
            }
        }
    }
        return p;
}    
    
    @Override
    public String toString() {
        NodoListaCircular aux = cabeza;
        String s = "Lista: \n";
        if (aux != null){
            s += aux + ", \n";
            aux = aux.getNext();
            while (aux != cabeza){
                s += aux + ", \n";
                aux = aux.getNext();
            }
        } else {
            s += "vacía";
        }
        return s;
    }     
}
