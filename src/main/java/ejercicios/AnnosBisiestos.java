package ejercicios;

import java.util.Scanner;

public class AnnosBisiestos {
   public AnnosBisiestos() {
   }

   public static String evaluar(int anno) {
      if (anno % 400 == 0) {
         return anno + " es bisiesto";
      } else if (anno % 100 == 0) {
         return anno + " no es bisiesto";
      } else if (anno % 4 == 0) {
         return anno + " es bisiesto";
      } else {
         return anno + " no es bisiesto";
      }
   }

   public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      System.out.print("Año:");
      int anno = lector.nextInt();
      String respuesta = evaluar(anno);
      System.out.println(respuesta);
   }
}
