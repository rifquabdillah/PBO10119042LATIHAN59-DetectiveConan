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
public class HiroshiAgasa extends DetectiveConan{
    
    private String kendaraan;
    private String keahlian;
    
    public HiroshiAgasa(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getKeahlian(){
        return keahlian;
    }
    
    public void setKeahlian(String keahlian){
        this.keahlian = keahlian;
    }
    
    public String getKendaraan(){
        return kendaraan;
    }
    
    public void setKendaraan(String kendaraan){
        this.kendaraan = kendaraan;
    }
    
    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
    
}
