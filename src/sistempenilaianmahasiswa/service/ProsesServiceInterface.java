/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.service;

import sistempenilaianmahasiswa.model.MataKuliah;

/**
 *
 * @author udin
 */
public interface ProsesServiceInterface {
    
    public void insertNilai(int npm, String nama, MataKuliah mataKuliah, int nilai);
    
    public void initDataMataKuliah();
    
}
