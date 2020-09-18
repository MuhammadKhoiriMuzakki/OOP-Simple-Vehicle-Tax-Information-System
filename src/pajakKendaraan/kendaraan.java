/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pajakKendaraan;

/**
 *
 * @author MuhammadKhoiriMuzaki
 */

//sebuah kelas untuk membantu membuat arraylist dari data2 yang di ambil dari database
public class kendaraan {
    private String no_kendaraan;
    private String kategori;
    private String nama;
    private String merek;
    private String warna;
    private String tahun;
    private String hbs_thn;
    private int pajak;
    private int administrasi;
    private String ket;
    
    
    public kendaraan(String No_kendaraan, String Kategori, String Nama, String Merek, String Warna, String Tahun, String Hbs_thn, int Pajak, int Administrasi, String Ket)
    {
        this.no_kendaraan = No_kendaraan;
        this.kategori = Kategori;
        this.nama = Nama;
        this.merek = Merek;
        this.warna = Warna;
        this.tahun = Tahun;
        this.hbs_thn = Hbs_thn;
        this.pajak = Pajak;
        this.administrasi = Administrasi;
        this.ket = Ket;
    }
    
    public String getNo_kendaraan()
    {
        return no_kendaraan;
    }
    
    public String getKategori()
    {
        return kategori;
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public String getMerek()
    {
        return merek;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public String getTahun(){
        return tahun;
    }
    
    public String getHbs_thn(){
        return hbs_thn;
    }
    
    public int getPajak(){
        return pajak;
    }
    
    public int getAdministrasi(){
        return administrasi;
    }
    
    public String getKet(){
        return ket;
    }
}

