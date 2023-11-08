package vendapdv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/vendapdv";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123456";

    public static Connection connect() {
        Connection connection = null;
        try {
  
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    
    public static boolean salvarPessoa(Pessoa pessoa) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = obterConexao();

            if (connection != null) {
                String query = "INSERT INTO tabela_pessoas (nome, telefone, email, rua, cidade, estado, cep) VALUES (?, ?, ?, ?, ?, ?, ?)";
                stmt = connection.prepareStatement(query);
                stmt.setString(1, pessoa.obterNome());
                stmt.setString(2, pessoa.obterTelefone());
                stmt.setString(3, pessoa.obterEmail());
                stmt.setString(4, pessoa.obterRua());
                stmt.setString(5, pessoa.obterCidade());
                stmt.setString(6, pessoa.obterEstado());
                stmt.setString(7, pessoa.obterCep());

                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0;
            } else {
                System.err.println("Falha ao obter conexão com o banco de dados.");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao salvar pessoa: " + e.getMessage());
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static boolean salvarProduto(String nome, double preco, int quantidade) {
    String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";
    try (Connection connection = connect();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setString(1, nome);
        preparedStatement.setDouble(2, preco);
        preparedStatement.setInt(3, quantidade);

        int rowsAffected = preparedStatement.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    public static Connection obterConexao() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}