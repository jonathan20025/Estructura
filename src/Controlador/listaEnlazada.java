
package Controlador;

import Modelo.Nodo;



public class listaEnlazada {
    
    private Nodo raiz;
    
    public listaEnlazada(){
        raiz= null;
  
    }
    public void ingresarInicio(int dato){
        if(raiz == null){
            raiz = new Nodo (dato);    
        }else{
            Nodo aux= new Nodo(dato,raiz);
            raiz= aux;
        }
    }
  public void ingresarMedio(int dato, int datoSiguiente){
        Nodo nuevo = new  Nodo(datoSiguiente);
        nuevo.setDato(datoSiguiente);
        buscarNodo(dato);
        Nodo aux = raiz;
            while (aux.getDato()!=dato ) {
                aux = aux.getSiguiente();
            }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
        
    }
      public void ingresarFin(int dato){
        if(raiz == null){
            raiz = new Nodo(dato);
        }else {
            Nodo aux = raiz;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
                aux.setSiguiente(new Nodo(dato));
        }
         }
         public void eliminarNodo(int dato){
        if(raiz.getDato() == dato){
            raiz = raiz.getSiguiente();
        }else{
            Nodo aux = raiz;
            while(aux.getSiguiente().getDato() != dato){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        }
            public Nodo buscarNodo(int dato){
        Nodo aux = raiz;
        while (aux.getDato() != dato) {            
            aux = aux.getSiguiente();
        }
        return aux;
    }
        public void imprimir(){
        Nodo aux = raiz;
        while (aux!= null) {            
            System.out.println(aux);
            aux = aux.getSiguiente();
        }
    }
      
 }
