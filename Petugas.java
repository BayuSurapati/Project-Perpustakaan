/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPerpusOOP;
import java.util.ArrayList;
/**
 *
 * @author JeanLaptop
 */
public class Petugas implements Pengguna{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    Petugas(){
        this.namaKaryawan.add("admin JoJo");
        this.alamat.add("Jepun");
        this.telepon.add("81675625621");
    }
    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }
    @Override
    public void setNama(String namaKaryawan){
        this.namaKaryawan.add(namaKaryawan);
    }
    
    @Override
    public void setAlamat(String alamat){
        this.namaKaryawan.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon){
        this.namaKaryawan.add(telepon);
    }
    
    @Override
    public String getNama(int idKaryawan){
        return this.namaKaryawan.get(idKaryawan);
    }
    
    @Override
    public String getAlamat(int idKaryawan){
        return this.alamat.get(idKaryawan);
    }
    
    @Override
    public String getTelepon(int idKaryawan){
        return this.telepon.get(idKaryawan);
    }
    
}
