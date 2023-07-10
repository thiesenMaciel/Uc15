package modelos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MotosDao {

    private Conexao conexao;
    private Connection conn;

    public MotosDao() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Motos m) {
        String sql = "INSERT INTO moto(id, placa, cor, ano, valor_custo, valor_venda, modelo) VALUES "
                + "(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, m.getId());
            stmt.setString(2, m.getPlaca());
            stmt.setString(3, m.getCor());
            stmt.setString(4, m.getAno());
            stmt.setString(5, m.getValor_custo());
            stmt.setString(6, m.getValor_venda());
            stmt.setString(7, m.getModelo());
            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir moto: " + e.getMessage());
        }

    }

    public Motos buscaMoto(int id) {
        String sql = "SELECT * FROM moto WHERE id = ?";
        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Motos m = new Motos();

            rs.next();
            m.setId(rs.getInt("ID"));
            m.setPlaca(rs.getString("placa"));
            m.setCor(rs.getString("cor"));
            m.setAno(rs.getString("ano"));
            m.setValor_custo(rs.getString("valor_custo"));
            m.setValor_venda(rs.getString("valor_venda"));
            m.setModelo(rs.getString("modelo"));
            
            return m;
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("erro na busca de moto: " + e.getMessage());
            return null;
        }

    }

    public void excluir(int id) {
        //string sql com o código de exclusão para o banco de dados
        String sql = "DELETE FROM moto WHERE id = ?";
        try {
            //esse trecho é igual ao método editar e inserir
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);

            //Executando a query
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("Erro ao excluir moto: " + e.getMessage());
        }

    }

    public List<Motos> getMoto() {

        String sql = "SELECT * FROM moto";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Motos> listaMotos = new ArrayList<>();
            //verificar se a consulta encontrou o funcionário com a matrícula informada
            while (rs.next()) { // se encontrou o funcionário, vamos carregar os dados
                Motos m = new Motos();
                m.setId(rs.getInt("ID"));
                m.setPlaca(rs.getString("placa"));
                m.setCor(rs.getString("cor"));
                m.setAno(rs.getString("ano"));
                m.setValor_custo(rs.getString("valor_custo"));
                m.setValor_venda(rs.getString("valor_venda"));
                m.setModelo(rs.getString("modelo"));
                listaMotos.add(m);
            }
            return listaMotos;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar no getmoto: " + ex.getMessage());
            return null;
        }
    }
}
