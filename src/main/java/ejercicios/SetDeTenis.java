package ejercicios;
import java.util.Scanner;
/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if (numVictoriasA == 7 && (numVictoriasB == 5 || numVictoriasB == 6)) {
            return "Ganó A";
        }else if ((numVictoriasB == 7 && (numVictoriasA == 5 || numVictoriasA == 6))) {
            return "Ganó B";
        }else if ((numVictoriasA == 6 && numVictoriasB <= 4)) {
            return "Ganó A";
        } else if ((numVictoriasB == 6 && numVictoriasA <= 4)) {
            return "Ganó B";
        }  else if ((numVictoriasA <= 6 && numVictoriasB <= 6)) {
            return "Aún no termina";
        }else if ((numVictoriasA > 7 || numVictoriasB > 7 || (numVictoriasA == 7 && numVictoriasB < 5 ))) {
            return "Inválido";
        }   
      
        return "Inválido";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganados por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganados por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
