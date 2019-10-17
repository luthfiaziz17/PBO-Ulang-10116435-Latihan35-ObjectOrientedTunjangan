/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.latihan35.objectorietedtunjangan;

import java.util.Scanner;

/**
 *
 * @author Luthfi
 * NIM  : Luthfi Aziz Al Paqih
 * NAMA : 10116435
 */
public class PBOUlang10116435Latihan35ObjectOrietedTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tun = new Tunjangan();
        Scanner scnr = new Scanner(System.in);

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        tun.gajiPokok = scnr.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        tun.status = scnr.next();

        tun.HasilHitung(tun.status,tun.gajiPokok);
    }
    
}
