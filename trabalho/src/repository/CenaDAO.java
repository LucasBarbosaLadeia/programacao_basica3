package repository;

import model.Cena;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CenaDAO {
    public static Cena findCenaById(Integer id) throws SQLException {
        Connection conn = MySql.getConnection();
        String sql = "SELECT * FROM cenas WHERE id_cena = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Cena cena = new Cena();
            cena.setIdCena(rs.getInt("id_cena"));
            cena.setDescricao(rs.getString("descricao"));

        }
        return 
    }
}
