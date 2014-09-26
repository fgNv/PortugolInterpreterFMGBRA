/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.LanguageManager;
import domain.Symbols;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class MainViewController implements Initializable {

    @FXML
    public TextArea inputField;
    @FXML
    public ListView errors;
    @FXML
    public ListView functions;
    @FXML
    public TableView variables;

    private final LanguageManager manager = new LanguageManager();

    private Task<Void> buildUpdateTask(String newValue) {
        Task<Void> task = new Task() {
            @Override
            protected Void call() throws Exception {
                obterSimbolos(newValue);
                checarTretas(newValue);
                return null;
            }
        };
        return task;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inputField.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            Task<Void> task = buildUpdateTask(newValue);
            task.run();
        });
    }

    private void obterSimbolos(String input) {
        Symbols symbols = manager.GetVariableList(input);
        variables.setItems(FXCollections.observableList(symbols.variables));
        functions.setItems(FXCollections.observableList(symbols.functions));
    }

    private void checarTretas(String input) {
        List<String> errorsList;
        errorsList = manager.Validate(input);
        this.errors.setItems(FXCollections.observableList(errorsList));
    }
}
