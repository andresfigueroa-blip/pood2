/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pood2.taller1;

/**
 *
 * @author ALUMNO#
 */
public class Taller2 {

    public static void main(String[] args) {
        int cels, fahr, multi, div, suma, suma2, multipl;
        
        cels=10;
        fahr=25;
        multi = cels * 9;
        div = multi / 5;
        suma = div + 32;
        
        multipl = (int) (fahr * 1.8);
        suma2 = multipl + 32;
                
                
        System.out.println("Los grados Celsius de villa vieja son de "+cels);
        System.out.println("Y los grados Fahrenheit son de "+fahr);
        System.out.println("Si convertimos los grados Celsius a Fahrenheit entonces )"+suma);
        System.out.println("Si convertimos los grados Fahrenheit a Celsius entonces )"+suma2);
    }
}
