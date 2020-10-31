package pboif2.pkg10119079.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI: berisi codingan menghitung gaji pokok
 *
 */
public class PBOIF210119079Latihan17Tunjangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String status;
        double gaji,tunjangan,totalgaji;
        
        System.out.println("======Program Tunjangan======");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        gaji = input.nextInt();
        System.out.print("Status anda? (Menikah/belum)    : ");
        status =input.next();
        if("Menikah".equals(status)){
            tunjangan = 0.35 * gaji;
        }else{ 
            tunjangan = 0;
        }
        
        totalgaji = gaji + tunjangan;
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok           : RP "+gaji);
        System.out.println("Tunjangan            : RP "+tunjangan);
        System.out.println("Total Gaji           : RP "+totalgaji);
        System.out.println("(Developed by: Rafi Khalifanan Azanan)");
    }
    
}
