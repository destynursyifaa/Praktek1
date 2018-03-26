/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author DestyNP
 */
public class SapiAksi {
    public static void main(String[] args) {
        Sapi Ku = new Sapi();
        Sapi Pak_Lurah = new Sapi();
        Sapi Pak_RT = new Sapi();
        
        Ku.Jenis_Sapi="Sapi Perah";
        Ku.Warna_Sapi="Coklat";
        Ku.Bentuk_Sapi="Besar";
        Ku.Gigi_Sapi="Gigi Seri";
        Ku.Ekor_Sapi="Ekor Panjang";
        
        Pak_Lurah.Jenis_Sapi="Sapi Ongole";
        Pak_Lurah.Warna_Sapi="Hitam";
        Pak_Lurah.Bentuk_Sapi="Kecil";
        Pak_Lurah.Gigi_Sapi="Gigi Geraham Belakang";
        Pak_Lurah.Ekor_Sapi="Ekor Pendek";
        
        Pak_RT.Jenis_Sapi="Sapi Potong";
        Pak_RT.Warna_Sapi="Putih Bercak Hitam";
        Pak_RT.Bentuk_Sapi="Sedang";
        Pak_RT.Gigi_Sapi="Gigi Rahang";
        Pak_RT.Ekor_Sapi="Ekor Berbulu";
    }
    
}
