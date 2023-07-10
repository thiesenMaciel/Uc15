package modelos;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {

    private Conexao conexao;
    private Connection conn;

    public ClientesDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void desconectar(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Voce se desconectou do banco de dados.");
            }
        } catch (SQLException ex) {
            System.out.println("Nao foi possivel desconectar do banco dados.");
        }
    }

    public void cadastrarCliente(Clientes c) {
        String sql = "INSERT INTO cliente(id, nome, endereco, telefone, cpf, rg) VALUES "
                + "(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, c.getId());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getCpf());
            stmt.setString(6, c.getRg());
            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    public Clientes buscarCliente(int id) {
        String sql = "SELECT * FROM cliente WHERE id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Clientes c = new Clientes();

            rs.next();
            c.setId(rs.getInt("ID"));
            c.setNome(rs.getString("Nome"));
            c.setEndereco(rs.getString("Endereco"));
            c.setCpf(rs.getString("Cpf"));
            c.setRg(rs.getString("Rg"));
            c.setTelefone(rs.getString("Telefone"));
            return c;

        } catch (Exception e) {
            System.out.println("erro na busca de cliente: " + e.getMessage());
            return null;
        }
    }

    public List<Clientes> getCliente() {
        String sql = "select * from cliente";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Clientes> listaClientes = new ArrayList<>();
            //verificar se a consulta encontrou o funcionário com a matrícula informada
            while (rs.next()) { // se encontrou o funcionário, vamos carregar os dados
                Clientes c = new Clientes();
                c.setId(rs.getInt("ID"));
                c.setNome(rs.getString("Nome"));
                c.setEndereco(rs.getString("Endereco"));
                c.setCpf(rs.getString("Cpf"));
                c.setRg(rs.getString("Rg"));
                c.setTelefone(rs.getString("Telefone"));
                listaClientes.add(c);
            }
            return listaClientes;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar no getcliente: " + ex.getMessage());
            return null;
        }
    }

    public void excluir(String nome) {
        //string sql com o código de exclusão para o banco de dados
        String sql = "DELETE FROM moto WHERE nome = ?";
        try {
            //esse trecho é igual ao método editar e inserir
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(2, nome);

            //Executando a query
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (SQLException ex) {
        }
    }

    public void editar(Clientes c) {
        //string sql com o código de update para o banco de dados
        String sql = "UPDATE cliente SET nome=?, endereco=?, telefone=?, cpf=?, rg=? WHERE id=?";
        try {
            //esse trecho é igual ao método inserir
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            //Setando os parâmetros

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getCpf());
            stmt.setString(5, c.getRg());
            stmt.setInt(6, c.getId());
            //Executando a query
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("Erro ao editar cliente: " + e.getMessage());
        }
    }

}
