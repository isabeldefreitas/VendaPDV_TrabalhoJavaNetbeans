package vendapdv;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class JVisualizacaoCliente extends JDialog {

    static void exibir(Pessoa clienteSelecionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JVisualizacaoCliente(Pessoa cliente) {
        initComponents();
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Define o título da janela com o nome do cliente
        setTitle("Visualização de Cliente: " + cliente.obterNome());

        // Crie rótulos para exibir informações do cliente
        JLabel nomeLabel = new JLabel("Nome: " + cliente.obterNome());
        JLabel telefoneLabel = new JLabel("Telefone: " + cliente.obterTelefone());
        JLabel emailLabel = new JLabel("Email: " + cliente.obterEmail());

        // Adicione os rótulos à janela
        getContentPane().add(nomeLabel);
        getContentPane().add(telefoneLabel);
        getContentPane().add(emailLabel);

        // Defina o layout da janela
        setLayout(null);
        nomeLabel.setBounds(20, 20, 300, 20);
        telefoneLabel.setBounds(20, 50, 300, 20);
        emailLabel.setBounds(20, 80, 300, 20);

        // Defina o tamanho da janela
        setSize(350, 150);
    }

    // Outros métodos gerados automaticamente

    public static void executar(Pessoa cliente) {
        JVisualizacaoCliente janela = new JVisualizacaoCliente(cliente);
        janela.setVisible(true);
    }

    // Variáveis da classe
}
