package prak15_hanipp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OutputController {

    @FXML
    private Button btnNew;

    @FXML
    private Label lblAlamat;

    @FXML
    private Label lblNPM;

    @FXML
    private Label lblNama;

    @FXML
    void openForm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FormInput.fxml"));
        
        Stage stage = (Stage) btnNew.getScene().getWindow();
        stage.setScene(new Scene(root));

    }
    
    void showValue(Mahasiswa mhs){
        lblNPM.setText(mhs.getNPM());
        lblNama.setText(mhs.getNama());
        lblAlamat.setText(mhs.getAlamat());
    }

}
