/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendapdv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author tatip
 */
  public class Pessoa {
      
        private String nomeCliente;
        private String telefone;
        private String email;
        private String estado;
        private String cidade;
        private String cep;
        private String rua;

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        public String obterNome(){
        return nomeCliente;
        }
        public String obterTelefone(){
        return telefone;
        }
        public String obterEmail(){
        return email;
        }
        
        public String obterRua(){
        return rua;
        }

        public String obterCidade(){
        return cidade;
        }

        public String obterEstado(){
        return estado ;
        }
        public String obterCep(){
        return cep;
        }
        public void atualizarNome(String nome){
        this.nomeCliente = nome;
        }

        public void atualizarTelefone(String telefone){
        this.telefone = telefone;
        }

        public void atualizarEmail(String email){
        this.email = email;
        }

        public void atualizarRua(String rua){
        this.rua = rua;
        }

        public void atualizarCidade(String cidade){
        this.cidade = cidade;
        }

        public void atualizarEstado(String estado){
        this.estado = estado;
        }

        public void atualizarCep(String cep){
        this.cep =cep ;
        }
        
        private Connection connection;

        public Pessoa(Connection connection) {
            this.connection = connection;
        }
        
        public void salvar() {
            String sql = "INSERT INTO cliente (nomeCliente, telefone, email, rua, cidade, estado, cep) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, this.nomeCliente);
                preparedStatement.setString(2, this.telefone);
                preparedStatement.setString(3, this.email);
                preparedStatement.setString(4, this.rua);
                preparedStatement.setString(5, this.cidade);
                preparedStatement.setString(6, this.estado);
                preparedStatement.setString(7, this.cep);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Dados da pessoa inseridos no banco de dados com sucesso.");
                } else {
                    System.out.println("Falha ao inserir dados da pessoa no banco de dados.");
                }
            } catch (SQLException ex) {
                System.err.println("Erro ao salvar dados da pessoa: " + ex.getMessage());
            }
        }
        
         public boolean atualizarNoBancoDeDados() {
        // Configurar a conexão com o banco de dados (substitua as informações apropriadas)
        String url = "jdbc:mysql://localhost:3306/vendapdv";
        String usuario = "root";
        String senha = "123456";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            // Construir a consulta SQL para atualização (substitua "sua_tabela" e campos apropriados)
            String sql = "UPDATE cliente SET nomeCliente = ?, telefone = ?, email = ?, rua= ?, cidade= ?, estado= ?, cep= ?";

            // Preparar a declaração SQL
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            // Preencher os valores dos parâmetros com os dados da pessoa
             preparedStatement.setString(1, this.nomeCliente);
                preparedStatement.setString(2, this.telefone);
                preparedStatement.setString(3, this.email);
                preparedStatement.setString(4, this.rua);
                preparedStatement.setString(5, this.cidade);
                preparedStatement.setString(6, this.estado);
                preparedStatement.setString(7, this.cep);// Substitua pelo campo de identificação da pessoa

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

