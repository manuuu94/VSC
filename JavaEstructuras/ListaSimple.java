package JavaEstructuras;

public class ListaSimple {
    
   
    NodoListaSimple cabeza;
    public void inserta (Inventario_limpieza p){
       if(cabeza==null){
           //inserta cuando la lista esta vacia 
           cabeza = new NodoListaSimple(p);
//        insertar a la izquierda (menor
       }else if (p.getId() < cabeza.getDato().getId()){
           NodoListaSimple aux = new NodoListaSimple(p);
           aux.setNext(cabeza);
           cabeza=aux;
           //insertar a la derecha (mayor
       }else if(cabeza.getNext()==null){
           cabeza.setNext(new NodoListaSimple(p));
           
       }else{
       NodoListaSimple aux = cabeza;
       while (aux.getNext() != null && aux.getNext().getDato().getId() < p.getId()){
           aux = aux.getNext();        
       }
       NodoListaSimple temp = new NodoListaSimple(p);
       temp.setNext(aux.getNext());
       aux.setNext(temp);
   }
   }
   
   public boolean existe(int id){
       boolean esta = false;
       if(cabeza != null){
           NodoListaSimple aux = cabeza;
           while (aux != null && aux.getDato().getId() < id){
               aux = aux.getNext();
           }
           esta = (aux != null && aux.getDato().getId() == id);
       }
       return esta;
  }
   
   public void modifica(Inventario_limpieza p){
       if (cabeza != null){
           NodoListaSimple aux = cabeza;
           while (aux != null && aux.getDato().getId() < p.getId()){
               aux = aux.getNext();
           }
           if (aux != null && aux.getDato().getId() == p.getId()){
               aux.getDato().setDescripcion(p.getDescripcion());
               aux.getDato().setPrecio(p.getPrecio());
           }
       }
   }
   
   public void elimina(int id){
       if(cabeza != null){
           if (cabeza.getDato().getId() == id) {
               cabeza = cabeza.getNext();
           }else{
               NodoListaSimple aux = cabeza;
               while (aux.getNext() != null && aux.getNext().getDato().getId() < id){
                   aux = aux.getNext();
               }
               if (aux.getNext() != null && aux.getNext().getDato().getId() == id){
                   aux.setNext(aux.getNext().getNext());
               }
           }
       }
   }

   public Inventario_limpieza pasar(int id){
       Inventario_limpieza p = null;
       if(cabeza != null){
           if (cabeza.getDato().getId() == id) {
               p = cabeza.getDato();
           }else{
               NodoListaSimple aux = cabeza;
               while (aux.getNext() != null && aux.getNext().getDato().getId() < id){
                   aux = aux.getNext();
               }
               if (aux.getNext() != null && aux.getNext().getDato().getId() == id){
                   p = aux.getNext().getDato();
                  
               }
           }
       }
       return p;
   }    
   
   public Inventario_limpieza extrae(int id){
       Inventario_limpieza p = null;
       if(cabeza != null){
           if (cabeza.getDato().getId() == id) {
               cabeza = cabeza.getNext();
           }else{
               NodoListaSimple aux = cabeza;
               while (aux.getNext() != null && aux.getNext().getDato().getId() < id){
                   aux = aux.getNext();
               }
               if (aux.getNext() != null && aux.getNext().getDato().getId() == id){
                   p = aux.getNext().getDato();
                   aux.setNext(aux.getNext().getNext());
               }
           }
       }
       return p;
   }    
   
   @Override
   public String toString(){
       NodoListaSimple aux = cabeza;
       String s = " Lista: \n";
       while (aux != null){
           s += aux + " \n";
           aux = aux.getNext();
       }
       return s;
   }
   
   
}
