/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import sistempenilaianmahasiswa.controller.ViewController;

/**
 *
 * @author udin
 */
public class MainView extends ComponentView{

    public MainView() {
       
        
        // btnInsert
        btnInputNilai.setBounds(150, 150, 200, 35);
        add(btnInputNilai);
        btnInputNilai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewController viewController = new ViewController();
                viewController.goToInsertNilai();
            }
        });
        
        // btnView
        btnViewNilai.setBounds(150, 200, 200, 35);
        add(btnViewNilai);
        btnViewNilai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewController viewController = new ViewController();
                viewController.goToViewNilai();
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
