import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nEelementos,pos, aux; //Instanciamos las variables junto con el arreglo correspondiente

        nEelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: ")); //Usamos ventanas emergentes para pedir datos
        arreglo = new int[nEelementos]; //Creamos el arreglo con la cantidad N de elementos ingresados

        for (int i = 0; i < nEelementos; i++) { //Pedimos y guardamos los datos dela arreglo mediante connsola
            System.out.println("Digite los numeros del arreglo: ");
            arreglo[i] = entrada.nextInt(); //Guardamos los datos en el arreglo mediante consola
        }
        for(int i=0 ; i<nEelementos ; i++){
            pos = i; //ubicamos la posicion para que se nos haga mas facil
            aux = arreglo[i]; //ubicamos el dato actual para que se nos haga mas facil

            //Nos dice que pos va verificar si el numero qu esta a la izquierda es mayor que el actual se hace cambio
            while ((pos>0) && (arreglo[pos-1]>aux)) { //Iniciamos un while para realizar el metodo de ordenamiento por insercion
                arreglo[pos] = arreglo[pos-1]; //Hacemos el cambio del dato y la posicion actual, o sea que el dato actual sera el de la izquierda
                pos--; //Hacemos que corra para seguir evaluando
            }
            arreglo[pos] = aux; //Refrezcamos el dato actual para tenerlo presente, dato acutal igual a dato en la posicion X
        }
        System.out.println("\nOrden Ascendente"); //Mostramos el arreglo ordenado por insercion de manera Creciente
        for(int i=0 ; i<nEelementos ; i++){
            System.out.println(arreglo[i]+" - ");
        }

        System.out.println("\nOrden Descendente"); //Mostramos el arreglo ordenado por insercion de manera Decreciente
        for(int i=(nEelementos-1) ; i>=0 ; i--){
            System.out.println(arreglo[i]+" - ");
        }
    }
}
