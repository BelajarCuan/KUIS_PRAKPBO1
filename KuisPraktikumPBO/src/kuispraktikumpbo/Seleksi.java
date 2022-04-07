/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispraktikumpbo;
import kuispraktikumpbo_beasiswa.BeasiswaMahasiswa;
import kuispraktikumpbo_beasiswa.BeasiswaPelajar;


/**
 *
 * @author ASUS
 */
public class Seleksi implements BeasiswaMahasiswa,BeasiswaPelajar {
    double k,v,d,j,s,dt;
    String keterangan;
    double hasil;
    
    public Seleksi(double konten, double visual, double design,double jurnal,double data,double solving) {
        this.k = konten;
        this.v = visual;
        this.d = design;
        this.j = jurnal;
        this.dt = data;
        this.s = solving;
    }

    

    

    @Override
    public double jurnal() {
        j= j*0.5;
    return j;}

    @Override
    public double data() {
        dt = dt*0.2;
        return dt;
             
     }

    @Override
    public double solving() {
        s = s*0.3;
        return s;
    }

    @Override
    public double konten() {
        k = k*0.6;
        return k;
    }

    @Override
    public double visual() {
        v = v*0.25;
        return v;
    }

    @Override
    public double design() {
        d = d*0.15;
        return d;
    }
    
    @Override
    public double hasilmahasiswa() {
        hasil = jurnal()+data()+solving();
        return hasil;}
    
    @Override
    public double hasilpelajar() {
        hasil = konten()+visual()+design();
        return hasil;  }
}