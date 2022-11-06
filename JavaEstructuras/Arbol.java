package JavaEstructuras;

public class Arbol {
    
    private NodoArbol raiz;
    
    public void inserta(int x, String pedido){
        if(raiz == null){
            raiz = new NodoArbol(x, pedido);
        }else{
            insertaR(raiz, x, pedido);
        }
    }
    
    private void insertaR(NodoArbol n, int x, String pedido){
        if(x <= n.getId()){ //si el valor de x es menor y debe ir a la izquierda
            if(n.getHijoIzq() == null){
                n.setHijoIzq(new NodoArbol(x, pedido)); //si no existe el HijoIzq, lo creo.
            } else {
                insertaR(n.getHijoIzq(),x, pedido); //si existe, llama al HijoIzq y realiza el mismo proceso hasta insertarlo de manera recursiva
            }            
        } else { // si el valor de x es mayor y debe ir a la derecha
            if(n.getHijoDer() == null){
                n.setHijoDer(new NodoArbol(x, pedido));// si no existe el hijoDer, lo creo.
            } else { 
                insertaR(n.getHijoDer(),x, pedido);//si existe, llama al hijoDer y recursivamente con el mismo metodo
            }
        }
    }

//permite mostrar los elementos ordenados a partir del criterio de entrada. ordenados ascendentemente
//Recorrido en inorden
//Recorrer el subárbol izquierdo
//Visitar la raíz
//Recorrer el subárbol derecho    
    public void inOrden(){
        if(raiz!=null){
            inOrdenR(raiz);
        }else{
            System.out.println("Arbol vacio...");
        }
    }
//Inorden
//15, 20, 30, 33, 40, 50, 60, 75, 80, 82, 90
//•    
    private void inOrdenR(NodoArbol n){
        if(n!=null){
            inOrdenR(n.getHijoIzq());
            System.out.print(n.getId()+", ");
            inOrdenR(n.getHijoDer());
        }
    }
//Recorrido en preorden
//Visitar la raíz
//Recorrer el subárbol izquierdo
//Recorrer el subárbol derecho
    public void preOrden(){
        if(raiz!=null){
            preOrdenR(raiz);
        }else{
            System.out.println("Arbol vacio...");
        }
    }    
    private void preOrdenR(NodoArbol n){
        if(n!=null){
            System.out.print(n.getId()+", ");                       
            preOrdenR(n.getHijoIzq());
            preOrdenR(n.getHijoDer());
        }
    }
//Recorrido en postorden
//Recorrer el subárbol izquierdo
//Recorrer el subárbol derecho
//Visitar la raíz
    public void posOrden(){
        if(raiz!=null){
            posOrdenR(raiz);
        }else{
            System.out.println("Arbol vacio...");
        }
    }
    
    private void posOrdenR(NodoArbol n){
        if(n!=null){
            posOrdenR(n.getHijoIzq());
            posOrdenR(n.getHijoDer());
            System.out.print(n.getId()+", ");
        }
    }
//Preorden
//50, 20, 15, 30, 40, 33, 80, 60, 75, 90, 82
//•

//Posorden
//15, 33, 40, 30, 20, 75, 60, 82, 90,80, 50    
   
//este metodo cuenta cuántos nodos existen. primero los del lado izq y  luego lado der.  
    public void CuentaNodos(){
        if(raiz != null){
            System.out.println("La cantidad de nodos del arbol es "+ CuentaNodosR(raiz));
        } else {
            System.out.println("Arbol vacio...");
        }
    }    
    private int CuentaNodosR(NodoArbol n){
        if(n == null){
            return 0;
        }else{
            return 1 + CuentaNodosR(n.getHijoIzq()) + CuentaNodosR(n.getHijoDer());
            //los return son los contadores
        }
    }

//hoja menor
    public void imprimeMenor(){ 
        if(raiz != null){
            System.out.println("El elemento menor del arbol es "+ imprimeMenorR(raiz));
        } else {   
            System.out.println("Arbol vacio...");
        } 
}
    private int imprimeMenorR(NodoArbol n){
        if(n.getHijoIzq() == null){
            return n.getId();
        }else{
            return imprimeMenorR(n.getHijoIzq());
        }
    }

    //metodo para imprimir solo las hojas (izq y der null)
    public void imprimeHojas(){
        if(raiz!=null){
            imprimeHojasR(raiz);
        }else{
            System.out.println("Arbol vacio...");
        }
    }    
    private void imprimeHojasR(NodoArbol n){
        if(n!=null){
            if(n.getHijoIzq() == null && n.getHijoDer() == null) {
                System.out.print(n.getId() + ", ");
            }
            imprimeHojasR(n.getHijoIzq());
            imprimeHojasR(n.getHijoDer());
        }
    }    

    //imprime los grados de nodo (raiz == 0)
    public void imprimeNivel(int n){
        if (raiz != null){
            imprimeNivelR(raiz, n, 0);
        } else{
            System.out.println("Arbol vacio...");
        }
    }
    private void imprimeNivelR(NodoArbol n, int niv, int contador){
        if(n!=null){
            if( niv == contador){
            System.out.print(n.getId()+", ");    
            }
            imprimeNivelR(n.getHijoIzq(), niv, contador+1);
            imprimeNivelR(n.getHijoDer(), niv, contador+1);
        }
    }
    
    
}