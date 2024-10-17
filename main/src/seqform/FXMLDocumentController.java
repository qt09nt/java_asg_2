/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seqform;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author sunflower
 */
public class FXMLDocumentController {

    @FXML
    private MenuButton numberOfBaseButton;

    @FXML
    private MenuButton spaceButton;

    @FXML
    private TextField InputSequence;

    @FXML
    private Button Submit;

    @FXML
    private TextField numberOfBases;

    @FXML
    private MenuButton caseButton;

    @FXML
    private TextArea formattedSequence;

    @FXML
    private MenuButton rowIndexButton;

    @FXML
    void handleSubmitButton(ActionEvent event) {
        System.out.println("123");
        caseButton.setText("Filtering for only valid characters");
    	String x = formattedSequence.getText();
    	String newstr = x.replaceAll("[^A-Za-z]+", "");
    	formattedSequence.setText(newstr);
    	
    }

       
    @FXML
    void onRemoveSpace(ActionEvent event) {

    }

    @FXML
    void onAddSpaces(ActionEvent event) {

    }

    /**
     * When the LowerCase menu is selected
     * @param event
     */
    @FXML
    void onLowerCase(ActionEvent event) {
    	caseButton.setText("Lowercase selected");
    	String x = formattedSequence.getText();
    	formattedSequence.setText(x.toLowerCase());
    }

    /**
     * when the Uppercase menu is selected
     * @param event
     */
    @FXML
    void onUpperCase(ActionEvent event) {
    	caseButton.setText("Uppercase selected");
    	String x = formattedSequence.getText();
    	formattedSequence.setText(x.toUpperCase());
    }

    @FXML
    void onShowRowIndex(ActionEvent event) {

    }

    @FXML
    void onHideIndex(ActionEvent event) {

    }

    @FXML
    void handleShowOriginalFormat(ActionEvent event) {

    }

    @FXML
    void onSelectPreferredSettings(ActionEvent event) {

    }
}