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
public class laporan {
    private int id_lap;
    private String no_kendaraan;
    private String isi_lap;
    
    public laporan(int Id_lap,String No_kendaraan, String Isi_lap){
        this.id_lap = Id_lap;
        this.no_kendaraan = No_kendaraan;
        this.isi_lap = Isi_lap;
    }
    
    public int getid_lap(){
        return id_lap;
    }
    
    public String getno_kendaraan(){
        return no_kendaraan;
    }
    
    public String getisi_lap(){
        return isi_lap;
    }
}
