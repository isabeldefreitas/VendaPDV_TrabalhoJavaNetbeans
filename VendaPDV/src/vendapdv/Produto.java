package vendapdv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String obterNome() {
        return nome;
    }

    public double obterPreco() {
        return preco;
    }

    public int obterQuantidade() {
        return quantidade;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public void atualizarPreco(double preco) {
        this.preco = preco;
    }

    public void atualizarQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void salvar(Connection connection) {
        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, this.nome);
            preparedStatement.setDouble(2, this.preco);
            preparedStatement.setInt(3, this.quantidade);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Dados do produto inseridos no banco de dados com sucesso.");
            } else {
                System.out.println("Falha ao inserir dados do produto no banco de dados.");
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar dados do produto: " + ex.getMessage());
        }
    }
    
    
    public boolean atualizarNoBancoDeDados(Connection connection) {
        // Configurar a conexão com o banco de dados (substitua as informações apropriadas)
        String url = "jdbc:mysql://localhost:3306/vendapdv";
        String usuario = "root";
        String senha = "123456";

        try {
            // Construir a consulta SQL para atualização (substitua "sua_tabela" e campos apropriados)
            String sql = "UPDATE sua_tabela SET nome = ?, preco = ?, quantidade = ? WHERE id = ?"; // Substitua "id" pelo campo de identificação do produto

            // Preparar a declaração SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Preencher os valores dos parâmetros com os dados do produto
            preparedStatement.setString(1, this.nome);
            preparedStatement.setDouble(2, this.preco);
            preparedStatement.setInt(3, this.quantidade);
            // Substitua pelo campo de identificação do produto
           

            // Executar a atualização
            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                // A atualização no banco de dados foi bem-sucedida
                return true;
            } else {
                // A atualização no banco de dados falhou
                return false;
            }
        } catch (SQLException e) {
            // Lidar com erros de SQL, se necessário
            e.printStackTrace();
            return false;
        }
    }

}
