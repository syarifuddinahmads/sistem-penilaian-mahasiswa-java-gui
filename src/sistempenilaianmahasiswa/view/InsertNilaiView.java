/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import sistempenilaianmahasiswa.controller.ViewController;
import sistempenilaianmahasiswa.model.MataKuliah;
import sistempenilaianmahasiswa.service.ProsesServiceImpl;

/**
 *
 * @author udin
 */
public class InsertNilaiView extends ComponentView{

    public InsertNilaiView() {
        
        ProsesServiceImpl prosesServiceImpl = new ProsesServiceImpl();
        prosesServiceImpl.initDataMataKuliah();
        
        lblNpmMhs.setBounds(25, 45, 100, 28);
        add(lblNpmMhs);
        jtNpmMhs.setBounds(150, 45, 250, 28);
        add(jtNpmMhs);
        
        lblNamaMhs.setBounds(25, 90, 100, 28);
        add(lblNamaMhs);
        jtNamaMhs.setBounds(150, 90, 250, 28);
        add(jtNamaMhs);
        
        lblNilaiMhs.setBounds(25, 135, 100, 28);
        add(lblNilaiMhs);
        jtNilaiMhs.setBounds(150, 135, 250, 28);
        add(jtNilaiMhs);
        
        lblMatKulMhs.setBounds(25, 180, 100, 28);
        add(lblMatKulMhs);
        jcMatKulMhs.setBounds(150, 180, 250, 28);
        add(jcMatKulMhs);
        
        btnInputNilai.setBounds(250, 250, 150, 35);
        add(btnInputNilai);
        btnInputNilai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int npm = Integer.parseInt(jtNpmMhs.getText());
                String nama = jtNamaMhs.getText();
                int nilai = Integer.parseInt(jtNilaiMhs.getText());
                MataKuliah mataKuliah = jcMatKulMhs.getItemAt(0);
                prosesServiceImpl.insertNilai(npm, nama,mataKuliah, nilai);
            }
        });
        
        
        setTitle("Sistem Penilaian Mahasiswa");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    
    
}
