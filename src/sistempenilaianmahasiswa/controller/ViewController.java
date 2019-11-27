/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenilaianmahasiswa.controller;

import sistempenilaianmahasiswa.view.InsertNilaiView;
import sistempenilaianmahasiswa.view.MainView;
import sistempenilaianmahasiswa.view.ViewNilaiView;

/**
 *
 * @author udin
 */
public class ViewController extends AbstractViewController {

    public void goToMainView() {
        MainView mainView = new MainView();
    }

    @Override
    public void goToInsertNilai() {
        InsertNilaiView insertNilaiView = new InsertNilaiView();
    }

    @Override
    public void goToViewNilai() {
        ViewNilaiView insertNilaiView = new ViewNilaiView();
    }

}
