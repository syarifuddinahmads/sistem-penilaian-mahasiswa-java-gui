/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.model;

/**
 *
 * @author udin
 */
public class Nilai {
    
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int nilai;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, int nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public int getNilai() {
        return nilai;
    }
    
    
    
}
