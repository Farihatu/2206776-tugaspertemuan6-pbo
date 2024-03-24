/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author FARIHATU
 */

public class Tugas6 {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        System.out.println("persegiPanjang1.PersegiPanjang: panjang= " + persegiPanjang1.getPanjang() + ", lebar= " + persegiPanjang1.getLebar());
        System.out.println("Luas persegiPanjang1: " + persegiPanjang1.getLuas());
        System.out.println("Keliling persegiPanjang1: " + persegiPanjang1.getKeliling());
        System.out.println("======================================================");

        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        System.out.println("persegiPanjang2.PersegiPanjang: panjang= " + persegiPanjang2.getPanjang() + ", lebar= " + persegiPanjang2.getLebar());
        System.out.println("Luas persegiPanjang2: " + persegiPanjang2.getLuas());
        System.out.println("Keliling persegiPanjang2: " + persegiPanjang2.getKeliling());
        System.out.println("======================================================");

        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);
        System.out.println("persegiPanjang3.PersegiPanjang: panjang= " + persegiPanjang3.getPanjang() + ", lebar= " + persegiPanjang3.getLebar());
        System.out.println("Luas persegiPanjang3: " + persegiPanjang3.getLuas());
        System.out.println("Keliling persegiPanjang3: " + persegiPanjang3.getKeliling());
    }
}