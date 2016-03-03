package tarea3.app;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int totalLOCS;
    public static int totalITEMS;
    public static int totalPARTS;
    
    public static void main( String[] args ) throws IOException
    {
        String prueba = Calculos.ProcesarArchivos("lista1.txt", "lista3.txt");
            String[] objeto = prueba.split("#|#");
            DecimalFormat f = new DecimalFormat("##.000");
            
            System.out.println("Los valores de la prueba 1 que se espera son: \n"
                 + "b0 = -22.55  b1 = 1.7279 rxy = 0.9545 r2 = 0.9111 yk = 644.29");
            System.out.println("Los valores de la prueba 1 que resultaron son: \n"
                 + "b0 = "+ f.format(Double.parseDouble(objeto[0]))  + " b1 ="+  f.format(Double.parseDouble(objeto[2])) + " "
                 + "rxy = "+ f.format(Double.parseDouble(objeto[4])) + " r2 ="+ f.format(Double.parseDouble(objeto[6]))+ " yk = " 
                 + f.format(Double.parseDouble(objeto[8])));
            System.out.println("===============================");
            System.out.println("===============================");
            prueba = Calculos.ProcesarArchivos("lista1.txt", "lista4.txt");
            objeto = prueba.split("#|#");
            
            System.out.println("Los valores de la prueba 2 que se espera son: \n"
                 + "b0 = -4.039  b1 = 0.1681 rxy = 0.9333 r2 = .8711 yk = 60.858");
            System.out.println("Los valores de la prueba 2 que resultaron son: \n"
                 + "b0 = "+ f.format(Double.parseDouble(objeto[0]))  + " b1 ="+  f.format(Double.parseDouble(objeto[2])) + " "
                 + "rxy = "+ f.format(Double.parseDouble(objeto[4])) + " r2 ="+ f.format(Double.parseDouble(objeto[6]))+ " yk = " 
                 + f.format(Double.parseDouble(objeto[8])));
            
            System.out.println("===============================");
            System.out.println("===============================");
            prueba = Calculos.ProcesarArchivos("lista2.txt", "lista3.txt");
            objeto = prueba.split("#|#");
            System.out.println("Los valores de la prueba 3 que se espera son: \n"
                 + "b0 = -23.92  b1 = 1.43097 rxy = .9631 r2 = 0.9276 yk = 528.4294");
            System.out.println("Los valores de la prueba 3 que resultaron son: \n"
                 + "b0 = "+ f.format(Double.parseDouble(objeto[0]))  + " b1 ="+  f.format(Double.parseDouble(objeto[2])) + " "
                 + "rxy = "+ f.format(Double.parseDouble(objeto[4])) + " r2 ="+ f.format(Double.parseDouble(objeto[6]))+ " yk = " 
                 + f.format(Double.parseDouble(objeto[8])));
            
            System.out.println("===============================");
            System.out.println("===============================");
            prueba = Calculos.ProcesarArchivos("lista1.txt", "lista3.txt");
            objeto = prueba.split("#|#");
            System.out.println("Los valores de la prueba 4 que se espera son: \n"
                 + "b0 = -4.604  b1 = 0.140164 rxy = .9480 r2 = .8988 yk = 49.4994");
            System.out.println("Los valores de la prueba 5 que resultaron son: \n"
                 + "b0 = "+ f.format(Double.parseDouble(objeto[0]))  + " b1 ="+  f.format(Double.parseDouble(objeto[2])) + " "
                 + "rxy = "+ f.format(Double.parseDouble(objeto[4])) + " r2 ="+ f.format(Double.parseDouble(objeto[6]))+ " yk = " 
                 + f.format(Double.parseDouble(objeto[8])));
    }
}
