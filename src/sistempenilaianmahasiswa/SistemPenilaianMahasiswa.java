/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa;

import sistempenilaianmahasiswa.controller.ViewController;
import sistempenilaianmahasiswa.view.MainView;

/**
 *
 * @author udin
 */
public class SistemPenilaianMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewController viewController = new ViewController();
        viewController.goToMainView();
    }
    
}
