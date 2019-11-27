/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.view;

import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class ViewNilaiView extends ComponentView{

    public ViewNilaiView() {
        
        jtblNilaiMhs.setBounds(25, 75, 450, 250);
        add(jtblNilaiMhs);
        
        setTitle("Sistem Penilaian Mahasiswa");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
