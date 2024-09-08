
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        double imc = peso / (estatura * estatura);
        if (imc < 22.0 && edad <= 44) {
            return "bajo";
        }else if  (imc < 22.0 && edad >= 45) {
            return "medio";
        }else if (imc >= 22.0 && edad < 45) {
            return "medio";
        } else {
            return "alto";
        }
    }
}
