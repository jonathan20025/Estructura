package Modelo;

public class Nodo {
    private int dato;
    private Nodo inicio;
    private Nodo siguiente;
    private Nodo medio;
    private Nodo Fin;
    private Nodo raiz;

    public Nodo(int dato, Nodo inicio, Nodo siguiente, Nodo medio, Nodo Fin, Nodo raiz) {
        this.dato = dato;
        this.inicio = inicio;
        this.siguiente = siguiente;
        this.medio = medio;
        this.Fin = Fin;
        this.raiz = raiz;
    }

    public Nodo(int dato) {
    
    }

    public Nodo(int dato, Nodo raiz) {

    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getMedio() {
        return medio;
    }

    public void setMedio(Nodo medio) {
        this.medio = medio;
    }

    public Nodo getFin() {
        return Fin;
    }

    public void setFin(Nodo Fin) {
        this.Fin = Fin;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", inicio=" + inicio + ", siguiente=" + siguiente + ", medio=" + medio + ", Fin=" + Fin + ", raiz=" + raiz + '}';
    }

     }