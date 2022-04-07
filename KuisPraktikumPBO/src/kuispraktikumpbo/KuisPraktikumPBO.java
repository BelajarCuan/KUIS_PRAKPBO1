/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuispraktikumpbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import kuispraktikumpbo_beasiswa.BeasiswaPelajar;
public class KuisPraktikumPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int pil, usia;
        double konten,design,visual;
        double jurnal,data,solving;
        String nama;
        
        
        System.out.println("--------------------------------------------");
        System.out.println("|     Pendaftaran Beasiswa PT.Benang        |");
        System.out.println("--------------------------------------------");
        System.out.println("| Terdapat Dua Program Beasiswa Yang Dibuka |");
        System.out.println("| 1. Beasiswa Pelajar                       |");
        System.out.println("| 2. Beasiswa Mahasiswa                     |");
        System.out.println("--------------------------------------------");
        System.out.print("Pilihan beasiswa yang didaftar : ");
        pil = keyboard.nextInt();
        
        if (pil == 1) {
            System.out.println(" --- Form Pendaftaran --- ");
            System.out.print("Masukan Nama   : ");
            nama = keyboard.next();
            
            System.out.print("Usia           : ");
            usia = keyboard.nextInt();
            if (usia < 16 || usia > 24){
                System.out.println("MAAF UMUR ANDA TIDAK SESUAI DENGAN SYARAT YANG BERLAKU");
                System.exit(0);}
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur dan Konten Esai    : ");
                konten = keyboard.nextDouble();
                System.out.print("Nilai Teknik Visualisasi          : ");
                visual = keyboard.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking   : ");
                design = keyboard.nextDouble();
                
                } while (konten > 100 || konten < 0 || visual > 100 || visual < 0 || design < 0 || design > 100) ;
            do {
                System.out.println(" --  Menu  -- ");
                System.out.println(" 1. Tampilkan Hasil ");
                System.out.println(" 2. Ubah NIlai   ");
                System.out.println(" 3. Exit   ");
                System.out.print("Pilih : ");
                pil = keyboard.nextInt();
                if (pil == 1) {
                    double hasil;
                    Seleksi pa;
                    pa = new Seleksi (konten,visual,design);
                    hasil = pa.hasilpelajar();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 87.5) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " ( " + usia + " Tahun) TIDAK LULUS diterima pada program Beasiswa Pelajar, karena belum mencapai nilai yang diharapkan pada tahap seleksi.");
                    }
                    else if (hasil >= 87.5) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " ( " + usia + " Tahun)   dinyatakan diterima pada program Beasiswa Pelajar, karena telah mencapai nilai yang diharapkan pada tahap seleksi.");
                    
                    
                    }
                }
                else if (pil == 2) {
                    do {
                         System.out.println(" --- Form Penilaian --- ");
                         System.out.println("Ket: Nilai dari 1-100");
                         System.out.print("Stuktur dan konten Jurnal         : ");
                         konten = keyboard.nextDouble();
                         System.out.print("Relevansi data                    : ");
                         visual = keyboard.nextDouble();
                         System.out.print("Kemampuan Problem Solving         : ");
                         design = keyboard.nextDouble();
                    } while (konten > 100 || konten < 0 || visual > 100 || visual < 0 || design > 100 || design < 0);
                }
            } while (pil != 3);
            
        }
        
        else if (pil == 2) {
            System.out.println(" --- Form Pendaftaran ---");
            System.out.print("Masukan Nama   : ");
            nama = keyboard.next();
            System.out.print("Usia           : ");
            usia = keyboard.next();
            
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur dan Konten Esai    : ");
                jurnal = keyboard.nextDouble();
                System.out.print("Nilai Teknik Visualisasi          : ");
                data = keyboard.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking   : ");
                solving = keyboard.nextDouble();
            } while (jurnal > 100 || jurnal < 0 || data > 100 || data < 0 ||  solving > 100 || solving<0 );
            
             do {
                System.out.println(" --  Menu  -- ");
                System.out.println(" 1. Tampilkan Hasil ");
                System.out.println(" 2. Ubah NIlai   ");
                System.out.println(" 3. Exit   ");
                System.out.print("Pilih : ");
                pil = keyboard.nextInt();
                if (pil == 1) {
                    double hasil;
                    Seleksi ps;
                    ps = new Seleksi (jurnal ,data, solving);
                    hasil = ps.hasilmahasiswa();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 87.5) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " ( " + usia + " Tahun) tidak diterima pada program Beasiswa Pelajar, karena belum mencapai nilai yang diharapkan pada tahap seleksi.");
                     }
                    else if (hasil >= 87.5) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " ( " + usia + " Tahun)  dinyatakan diterima pada program Beasiswa Pelajar, karena telah mencapai nilai yang diharapkan pada tahap seleksi.");
                    
                    }
                }
                else if (pil == 2) {
                    do {
                        System.out.println(" --- Form Penilaian --- ");
                        System.out.println("Ket: Nilai dari 1-100");
                        System.out.print("Nilai Struktur dan Konten Esai    : ");
                        jurnal = keyboard.nextDouble();
                        System.out.print("Nilai Teknik Visualisasi          : ");
                        data = keyboard.nextDouble();
                        System.out.print("Nilai Kemampuan Design Thinking   : ");
                        solving = keyboard.nextDouble();
                    } while (jurnal > 100 || jurnal < 0 || data > 100 || data < 0 ||  solving > 100 || solving<0 );
                 }
             }while (pil != 3);
             
             
        }
    }
}
    
    
