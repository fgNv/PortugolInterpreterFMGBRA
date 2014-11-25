/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.LanguageManager;
import domain.Symbols;
import domain.TokensProvider;
import domain.listeners.BipAssemblyListener;
import domain.listeners.IAssemblyGeneratorListener;
import helpers.AssemblyGenerator;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyleSpans;
import org.fxmisc.richtext.StyleSpansBuilder;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class MainViewController implements Initializable {

    @FXML
    public ListView errors;
    @FXML
    public ListView warnings;
    @FXML
    public TableView functions;
    @FXML
    public TableView variables;
    @FXML
    public CodeArea codeArea;
    @FXML
    public TableView parameters;
    @FXML
    public Label assembly;
    
    private final Pattern keywordPattern = TokensProvider.getTokensPattern();
    
    private final LanguageManager manager = new LanguageManager();

    private Task<Void> buildUpdateTask(String newValue) {
        Task<Void> task = new Task() {
            @Override
            protected Void call() throws Exception {
                Symbols symbols = obterSimbolos(newValue);
                
                AssemblyGenerator generator = new AssemblyGenerator(new BipAssemblyListener(), symbols, newValue);
                assembly.setText(generator.generateAssembly());
                return null;
            }
        };
        return task;
    }
    
    private Task<Void> buildHighlightTask(String newValue) {
        Task<Void> task = new Task() {
            @Override
            protected Void call() throws Exception {
                codeArea.setStyleSpans(0, computeHighlighting(newValue));
                return null;
            }
        };
        return task;
    }

    private void SetupCodeArea() {
        String stylesheet = getClass().getResource("mainview.css").toExternalForm();
        IntFunction<String> format = (digits -> " %" + digits + "d ");

        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea, format, stylesheet));
        codeArea.textProperty().addListener((obs, oldText, newText) -> {
            Task<Void> task = buildHighlightTask(newText);
            task.run();
        });

        codeArea.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            Task<Void> task = buildUpdateTask(newValue);
            task.run();
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SetupCodeArea();
    }

    private Symbols obterSimbolos(String input) {
        Symbols symbols = manager.GetVariableList(input);
        variables.setItems(FXCollections.observableList(symbols.variables));
        functions.setItems(FXCollections.observableList(symbols.functions));
        parameters.setItems(FXCollections.observableList(symbols.parameters));
        warnings.setItems(FXCollections.observableList(symbols.warnings));
        errors.setItems(FXCollections.observableList(symbols.errors));
        return symbols;
    }

    private StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = keywordPattern.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
        while (matcher.find()) {
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton("keyword"), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }
}
