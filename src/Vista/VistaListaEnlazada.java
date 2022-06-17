
package Vista;

import Controlador.listaEnlazada;
import java.util.Scanner;

public class VistaListaEnlazada {
listaEnlazada listaEnlazada;
    Scanner teclado;
    public VistaListaEnlazada() {
        listaEnlazada = new listaEnlazada();
        teclado = new Scanner(System.in);
    }
    public void menu(){
        int opc = 0;
        do{
            System.out.println("1. Generar numeros\n2. Ingresar Inicio\n3. Ingresar Medio\n4. Ingresar Fin\n5. Buscar\n6. Eliminar\n7.Listar\n0.Salir");
            opc = teclado.nextInt();
            switch(opc){
                case 1: numeroAleatorio();break;
                case 2: ingresarInicio(); break;
                case 3: ingresarMedio();break;
                case 4: ingresarFin(); break;
                case 5: buscar(); break;
                case 6: eliminar(); break;
                case 7: listaEnlazada.imprimir();break;
            }
        }while(opc!=0);
    }
    public int numeroAleatorio(){
        int numAleatorio = 0;
        numAleatorio = (int) (Math.random() *6);
        return numAleatorio;
    }
    
    public void ingresarInicio(){
        System.out.println("Ingrese un valor");
        int dato = teclado.nextInt();
        listaEnlazada.ingresarInicio(dato);
    }
        private void ingresarMedio() {
        System.out.println("Ingrese un valor");
        int dato= teclado.nextInt();
        listaEnlazada.ingresarMedio(dato, dato);
    }
    public void ingresarFin(){
        System.out.println("Ingrese un valor");
        int dato = teclado.nextInt();
        listaEnlazada.ingresarFin(dato);
    }
    public void buscar(){
        System.out.println("Ingrese un valor");
        int dato = teclado.nextInt();
        System.out.println(listaEnlazada.buscarNodo(dato));
    }
    public void eliminar(){
        System.out.println("Ingrese un valor");
        int dato = teclado.nextInt();
        listaEnlazada.eliminarNodo(dato);
    }


    
}


