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
public class Mahasiswa {
    String namaMhs;
    int npmMhs;

    public Mahasiswa(String namaMhs, int npmMhs) {
        this.namaMhs = namaMhs;
        this.npmMhs = npmMhs;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public int getNpmMhs() {
        return npmMhs;
    }
    
}
