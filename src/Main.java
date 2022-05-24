/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;

        System.out.print("Armut kaç kilo ? : ");
        armut = inp.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        elma = inp.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domates = inp.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = inp.nextDouble();

        double toplamTutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.print("Toplam Tutar : " + toplamTutar + "TL");

    }
}
