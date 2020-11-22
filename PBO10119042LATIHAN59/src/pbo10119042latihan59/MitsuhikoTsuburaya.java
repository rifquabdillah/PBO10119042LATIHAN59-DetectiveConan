/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan59;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * Kelas    : IF-1
 * NIM      : 10119042
 */
public class MitsuhikoTsuburaya extends DetectiveConan{
    
    private String hobi;
    private String karakter;
    
    public MitsuhikoTsuburaya(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    public String getHobi(){
        return hobi;
    }
    
    public void setHobi(String hobi){
        this.hobi = hobi;
    }
    
    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
    
}
