/*
NAMA : MUHAMMAD AZRAQI SAPUTRA
NIM : 10116397
KELAS : PBO2
 */
package uas.pbo2.pkg10116397.muhammadazraqisaputra.no4;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class UASPBO210116397MUHAMMADAZRAQISAPUTRANO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aplikasi Pendataan Wisatawan");
        System.out.println("=====================");
        Wisatawan wisatawan = new Wisatawan();
        System.out.println("Nama : ");
        wisatawan.setNama(scanner.nextLine());

        System.out.println("Kewarganegaraan : ");
        wisatawan.setKewarganegaraan(scanner.nextLine());

        System.out.println("Tujuan Wisata : ");
        wisatawan.setTujuanWisata(scanner.nextLine());

        System.out.println();
        System.out.println("Hasil Data Aplikasi Pendataan Wisatawan");
        System.out.println("=====================");
        System.out.println("Nama            : " + wisatawan.getNama());
        System.out.println("Kewarganegaraan : " + wisatawan.getKewarganegaraan());
        System.out.println("Tujuan Wisata   : " + wisatawan.getTujuanWisata());
    }
}
