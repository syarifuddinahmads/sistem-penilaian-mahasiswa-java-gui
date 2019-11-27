/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.service;

import sistempenilaianmahasiswa.data.Data;
import sistempenilaianmahasiswa.model.Mahasiswa;
import sistempenilaianmahasiswa.model.MataKuliah;
import sistempenilaianmahasiswa.model.Nilai;

/**
 *
 * @author udin
 */
public class ProsesServiceImpl implements ProsesServiceInterface{

    @Override
    public void insertNilai(int npm, String nama, MataKuliah mataKuliah, int nilai) {
        System.out.println("NPM : "+npm+"\nNama : "+nama+"\nNilai : "+nilai);
        Mahasiswa mahasiswa = new Mahasiswa(nama, npm);
        Nilai n = new Nilai(mahasiswa, mataKuliah, nilai);
        Data.nilaiArr[0] = n;
    }

    @Override
    public void initDataMataKuliah() {
        Data.mataKuliahArr[0] = new MataKuliah(1, "Sistem Operasi", 3);
        Data.mataKuliahArr[1] = new MataKuliah(2, "PBO", 3);
        Data.mataKuliahArr[2] = new MataKuliah(3, "PAA", 3);
        Data.mataKuliahArr[3] = new MataKuliah(4, "Komputasi Numerik", 3);
        Data.mataKuliahArr[4] = new MataKuliah(5, "Kewirausahaan", 3);
    }
    
}
