/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPerpusOOP;

/**
 *
 * @author JeanLaptop
 */
public class AplikasisJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Buku buku = new Buku();
            Petugas karyawan = new Petugas();
            Peminjaman peminjaman = new Peminjaman();
            Siswa siswa = new Siswa();
            Laporan laporan = new Laporan();
            // subclass pesan = new subclass(); Untuk menampilkan pesan 

            laporan.laporan(buku);
            laporan.laporan(siswa);
            laporan.laporan(peminjaman, buku);

            peminjaman.prosestransaksi(siswa, peminjaman, buku);
            laporan.laporan(peminjaman, buku);
            laporan.laporan(buku);
            laporan.laporan(siswa);

        } catch (Exception e) {
            System.out.println("Terdapat Exception! \n Info : " + e.getMessage());
        }
    }

}
