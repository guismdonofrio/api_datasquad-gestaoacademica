package org.example.demo3.dao;

import org.example.demo3.DatabaseConnection;
import org.example.demo3.entity.PlanejamentoDia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanejamentoDiaDao {

    public static List<PlanejamentoDia> atualizarPlanejamentoDia(Integer curso_id, Integer semestre) {
        List<PlanejamentoDia> planejamentos = new ArrayList<>();
        Connection con = null;
        try {
            con = DatabaseConnection.getConnection("organizacao_aulas_fatec", "root", "root");

            // Adicionado: (DAYOFWEEK(c_i.data_evento) - 1) AS dia_semana_indice
            // Isso retornará 0 para Domingo, 1 para Segunda, etc., conforme seu comentário no SQL.
            String select_query = "SELECT c_i.id_cronograma_i, c_i.data_evento, d.nome, t.nome, " +
                    "c_i.observacao, c_i.qtd_aulas, (DAYOFWEEK(c_i.data_evento) - 1) AS dia_semana_indice" +
                    " FROM cronograma_item AS c_i" +
                    " INNER JOIN tema AS t ON t.id_tema = c_i.tema_id" +
                    " INNER JOIN disciplina AS d ON d.id_disciplina = t.disciplina_id" +
                    " INNER JOIN cronograma AS cr ON cr.id_cronograma = c_i.cronograma_id" +
                    " INNER JOIN curso AS c ON c.id_curso = cr.curso_id" +
                    " WHERE c.id_curso = ? AND cr.semestre = ?";

            PreparedStatement pstm = con.prepareStatement(select_query);
            pstm.setInt(1, curso_id);
            pstm.setInt(2, semestre);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                PlanejamentoDia planejamento = new PlanejamentoDia();
                planejamento.setId(rs.getInt("id_cronograma_i"));

                // Pegamos a data do banco
                LocalDate dataEvento = rs.getObject("data_evento", LocalDate.class);
                planejamento.setData(dataEvento);

                // CONVERSÃO PARA STRING:
                // Pegamos o dia da semana da data e formatamos para o Português
                String diaSemanaExtenso = dataEvento.getDayOfWeek()
                        .getDisplayName(java.time.format.TextStyle.FULL, new java.util.Locale("pt", "BR"));

                // Deixa a primeira letra maiúscula (ex: "segunda-feira" -> "Segunda-feira")
                diaSemanaExtenso = diaSemanaExtenso.substring(0, 1).toUpperCase() + diaSemanaExtenso.substring(1);

                planejamento.setDia_semana(diaSemanaExtenso); // Certifique-se que o setter aceite String

                planejamento.setDisciplina(rs.getString("nome"));
                planejamento.setTema(rs.getString("nome"));
                planejamento.setObs(rs.getString("observacao"));
                planejamento.setAulas(rs.getInt("qtd_aulas"));
                planejamentos.add(planejamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar a lista!", e);
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return planejamentos;
    }
}