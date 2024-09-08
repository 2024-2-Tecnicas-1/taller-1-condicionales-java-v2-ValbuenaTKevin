
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        LocalDate currentDate = LocalDate.now();
                LocalDate birthDate = LocalDate.of(anno, mes, dia);
                Period age = Period.between(birthDate, currentDate);
        
        return "Usted tiene " + age.getYears() + " años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}