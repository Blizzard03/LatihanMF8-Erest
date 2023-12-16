/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package latihanmf8.erest.Controller;

import Modellatihanmf8.erest.Mdels.Kendaraan;
import Modellatihanmf8.erest.Mdels.Pelanggan;
import Modellatihanmf8.erest.Mdels.PembaharuanHarga;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLFormPenyewaanKendaranController implements Initializable {

    Pelanggan plg = new Pelanggan();
    Kendaraan kdr = new Kendaraan();
    PembaharuanHarga pbh = new PembaharuanHarga();
    //Curency Formatter
    Locale Indonesia = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);

    @FXML
    private Tab penyewaan;
    @FXML
    private TextField txthari;
    @FXML
    private CheckBox pickup;
    @FXML
    private CheckBox sedan;
    @FXML
    private CheckBox minibus;
    @FXML
    private TextField txtnama;
    @FXML
    private CheckBox yesPerusahaan;
    @FXML
    private CheckBox noperusahaan;
    @FXML
    private Button pesanbrn;
    @FXML
    private Button hapusbtn;
    @FXML
    private Button keluarbtn;
    @FXML
    private Button ubahharga;
    @FXML
    private Tab pembaharuanharga;
    @FXML
    private TextField txt_tarif;
    @FXML
    private TextField txt_sewa;
    @FXML
    private CheckBox pickupupdate;
    @FXML
    private CheckBox sedanupdate;
    @FXML
    private CheckBox minibusupdate;
    @FXML
    private Button hapusupdbtn;
    @FXML
    private Button pembaharuanbtn;
    @FXML
    private Button batalbtn;
    @FXML
    private Tab faktur;
    @FXML
    private Label lblname;
    @FXML
    private Label lblvehicle;
    @FXML
    private Label rateprice;
    @FXML
    private Label totalratesprice;
    @FXML
    private Label tax;
    @FXML
    private Label Payments;
    @FXML
    private Label lblrentsdays;
    @FXML
    private Label rentprice;
    @FXML
    private Label totalrentprice;
    @FXML
    private TabPane penyewaanKENDARAAN;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pembaharuanharga.setDisable(true);
        faktur.setDisable(true);
    }

    @FXML
    private void pesanklik(ActionEvent event) {
        plg.setNama(txt_sewa.getText());
        penyewaan.setDisable(true);
        pembaharuanharga.setDisable(true);
        faktur.setDisable(false);

    }

    @FXML
    private void hapusklik(ActionEvent event) {
        Alert alt = new Alert(Alert.AlertType.WARNING, "Data ini akan dihapus dan tidak bisa dikembalikan!!!", ButtonType.OK);
        alt.showAndWait();
        if (alt.getResult().equals(ButtonType.OK)) {
            txthari.setText("");
            pickup.setSelected(false);
            sedan.setSelected(false);
            minibus.setSelected(false);
            txtnama.setText("");
            yesPerusahaan.setSelected(false);
            noperusahaan.setSelected(false);
        }
    }

    @FXML
    private void keluarklik(ActionEvent event) {
        Alert alt = new Alert(Alert.AlertType.CONFIRMATION, "Erest, Yakin mau keluar dari program?", ButtonType.NO, ButtonType.YES);
        alt.showAndWait();
        if (alt.getResult().equals(ButtonType.YES)) {
            System.exit(0);
        }

    }

    @FXML
    private void ubahhargaklik(ActionEvent event) {
        penyewaanKENDARAAN.getSelectionModel().select(0);
        penyewaan.setDisable(true);
        pembaharuanharga.setDisable(false);
        faktur.setDisable(true);
    }

    @FXML
    private void pembaharuanklik(ActionEvent event) {
    }

    @FXML
    private void batalklik(ActionEvent event) {
        Alert alt = new Alert(Alert.AlertType.WARNING, "Data tidak akan disimpan dan akan kembali ke menu form penyewaan", ButtonType.OK);
        alt.showAndWait();
        if (alt.getResult().equals(ButtonType.OK)) {
            txthari.setText("");
            pickup.setSelected(false);
            sedan.setSelected(false);
            minibus.setSelected(false);
            txtnama.setText("");
            yesPerusahaan.setSelected(false);
            noperusahaan.setSelected(false);
            penyewaan.setDisable(false);
            pembaharuanharga.setDisable(true);
            faktur.setDisable(true);
            penyewaanKENDARAAN.getSelectionModel().select(0);
        }
    }

}
