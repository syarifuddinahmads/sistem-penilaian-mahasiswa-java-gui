/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import sistempenilaianmahasiswa.model.MataKuliah;

/**
 *
 * @author udin
 */
public class ComponentView extends JFrame {

    JButton btnViewNilai = new JButton("View Nilai");
    JButton btnInputNilai = new JButton("Input Nilai");

    // Insert View Component
    JLabel lblNpmMhs = new JLabel("NPM : ");
    JLabel lblNamaMhs = new JLabel("Nama : ");
    JLabel lblNilaiMhs = new JLabel("Nilai : ");
    JLabel lblMatKulMhs = new JLabel("Matakuliah : ");
    JTextField jtNpmMhs = new JTextField();
    JTextField jtNamaMhs = new JTextField();
    JTextField jtNilaiMhs = new JTextField();
    JComboBox<MataKuliah>jcMatKulMhs = new JComboBox<>();
    
    // View Nilai Component
    JTable jtblNilaiMhs = new JTable();
}
