
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berto
 */
public class AdivinarNumero {    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        int puntaje = 100;
        do {
            System.out.println("Seleccione una Opcion:\n1-Iniciar Juego\n2-Mostrar puntaje\n3-Ver reglas\n0-Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Gracias por jugar. Adios!");
                break;
                case 1:
                {
                    Random rnd=new Random();
                    int numeroRandom = rnd.nextInt() % 100;
                    int eleccion= 0;
                    do {      
                        System.out.println("Ingrese un numero");
                        eleccion=teclado.nextInt();
                        if (numeroRandom==eleccion) {
                            System.out.println("Ganaste");
                            puntaje=puntaje+100;
                        } else if (eleccion>numeroRandom){
                            System.out.println("El numero es mas chico");
                            puntaje=puntaje-3;
                        } else if (eleccion<numeroRandom){
                            System.out.println("El numero es mas grande");
                            puntaje=puntaje-3;
                        }
                    } while (numeroRandom!=eleccion);
                }
                break;
                case 2:                
                    System.out.println("Puntaje:"+puntaje);
                break;
                case 3:
                    System.out.println("___________________________\nReglas:\nGanaras cuando llegues a 500 puntos\nperderas si llegas a 0\nempiezas con 100 puntos\n___________________________");
                break;
            }
        } while (opcion!=0);
    }
}
