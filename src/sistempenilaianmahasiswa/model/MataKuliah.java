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
public class MataKuliah {
    int id;
    String namaMatkul;
    int sksMatkul;

    public MataKuliah(int id, String namaMatkul, int sksMatkul) {
        this.id = id;
        this.namaMatkul = namaMatkul;
        this.sksMatkul = sksMatkul;
    }

    public int getId() {
        return id;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSksMatkul() {
        return sksMatkul;
    }
    
}
