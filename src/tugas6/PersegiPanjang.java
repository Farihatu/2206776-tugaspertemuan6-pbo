/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author FARIHATU
 */
public class PersegiPanjang {
    int panjang;
    int lebar;

    PersegiPanjang() {
        panjang = 0;
        lebar = 0;
    }

    PersegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

    int getLuas() {
        return panjang * lebar;
    }
    
    int getKeliling() {
        return 2 * (panjang + lebar);
    }

    void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    int getPanjang() {
        return panjang;
    }

    int getLebar() {
        return lebar;
    }
}