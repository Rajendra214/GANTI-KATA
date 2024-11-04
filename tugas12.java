/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author NITRO V 15
 */
public class tugas12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======Program Mengganti Kata======");
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti kata: ");
        String kataLama = scanner.nextLine();

        System.out.print("Menjadi kata: ");
        String kataBaru = scanner.nextLine();

        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        System.out.println("\n======Hasil Mengganti Kata======");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}
   
}
