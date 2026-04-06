package org.example.demo3.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyComboBox;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.demo3.dao.PlanejamentoDiaDao;
import org.example.demo3.entity.PlanejamentoDia;

import java.util.List;

public class PlanejamentoProfessorController {
    @FXML private MFXLegacyTableView<PlanejamentoDia> mfxTableView;
    @FXML private TableColumn<PlanejamentoDia, String> dataCol, disciCol, temaCol, obsCol, diaCol;
    @FXML private TableColumn<PlanejamentoDia, Integer> aulasCol;

    @FXML private MFXLegacyComboBox<Integer> comboSemestre;
    @FXML private MFXLegacyComboBox<String> comboCurso;

    @FXML private MFXButton editRow, deleteRow;

    public void initialize() {
        // 1. CONFIGURAÇÃO DAS COLUNAS
        dataCol.setCellValueFactory(new PropertyValueFactory<>("data"));
        disciCol.setCellValueFactory(new PropertyValueFactory<>("disciplina"));
        temaCol.setCellValueFactory(new PropertyValueFactory<>("tema"));
        obsCol.setCellValueFactory(new PropertyValueFactory<>("obs"));
        aulasCol.setCellValueFactory(new PropertyValueFactory<>("aulas"));
        diaCol.setCellValueFactory(new PropertyValueFactory<>("dia_semana"));

        ObservableList<PlanejamentoDia> dados = FXCollections.observableArrayList();
        List<PlanejamentoDia> planejamentos = PlanejamentoDiaDao.atualizarPlanejamentoDia(1, 2);

        for (PlanejamentoDia planejamento: planejamentos){
            dados.add(planejamento);
        }
        mfxTableView.setItems(dados);

        String [] d = {"Banco de Dados"};
        Integer [] d2 = {2};
        comboCurso.getItems().addAll(d);
        comboSemestre.getItems().addAll(d2);
    }

    public void comboAction(){
        System.out.println(comboCurso.getSelectionModel().getSelectedItem().toString());
    }
}