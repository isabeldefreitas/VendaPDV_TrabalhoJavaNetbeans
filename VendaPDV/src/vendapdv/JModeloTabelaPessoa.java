/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendapdv;

/**
 *
 * @author tatip
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class JModeloTabelaPessoa extends AbstractTableModel {

private static final int COLUNA_NOME = 0;
private static final int COLUNA_TELEFONE = 1;
private static final int COLUNA_EMAIL = 2;
private static final int COLUNA_RUA = 3;
private static final int COLUNA_CIDADE = 4;
private static final int COLUNA_ESTADO = 5;
private static final int COLUNA_CEP = 6;


private String[] colunas = new String[]{"Nome","Telefone","Email","Logradouro","Numero","Complemento","Bairro","Cidade","Estado","Cep"};
private List<Pessoa> pessoas;

public JModeloTabelaPessoa(List<Pessoa>pessoas) {
this.pessoas = new ArrayList<Pessoa>(pessoas);
}


@Override
public int getColumnCount(){
return colunas.length;
}

@Override
public int getRowCount(){
return pessoas.size();
}

@Override
public String getColumnName(int columnIndex){
return colunas[columnIndex];
}

   @Override
public boolean isCellEditable(int rowIndex, int columnIndex){
return false;
}
  
@Override
public Object getValueAt(int row, int col){
Pessoa pessoa = pessoas.get(row);
switch(col){
case COLUNA_NOME:
return pessoa.obterNome();

case COLUNA_TELEFONE:
return pessoa.obterTelefone();

case COLUNA_EMAIL :
return pessoa.obterEmail();

case COLUNA_RUA:
return pessoa.obterRua();

case COLUNA_CIDADE:
return pessoa.obterCidade();

case COLUNA_ESTADO:
return pessoa.obterEstado();

case COLUNA_CEP:
return pessoa.obterCep();
}
return "";
}
  @Override
public void setValueAt(Object aValue, int row, int column){
Pessoa pessoa = pessoas.get(row);
switch(column){
case COLUNA_NOME:
pessoa.atualizarNome(aValue.toString());
break;
case COLUNA_TELEFONE:
pessoa.atualizarTelefone(aValue.toString());
break;
case COLUNA_EMAIL :
pessoa.atualizarEmail(aValue.toString());
break;

case COLUNA_RUA :
pessoa.atualizarRua (aValue.toString());
break;
case COLUNA_CIDADE:
pessoa.atualizarCidade(aValue.toString());
break;
case COLUNA_ESTADO:
pessoa.atualizarEstado (aValue.toString());
case COLUNA_CEP:
pessoa.atualizarCep (aValue.toString());


}
}


public Pessoa obterPessoa(int indice){
return pessoas.get(indice);
}

public void incluirPessoa(Pessoa pessoa){
pessoas.add(pessoa);
int ultimo = getRowCount()-1;
fireTableRowsInserted(ultimo, ultimo);
}

public void atualizarPessoa(int indice, Pessoa pessoa){
pessoas.set(indice, pessoa);
fireTableRowsUpdated(indice, indice);
}

public void excluirPessoa(int indice) {
        Pessoa pessoaExcluida = pessoas.remove(indice);
        fireTableRowsDeleted(indice, indice);

        
        atualizarArquivo(pessoas);
    }

private void atualizarArquivo(List<Pessoa> pessoas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Pessoa.txt"))) {
            for (Pessoa pessoa : pessoas) {
                bw.write("Nome:" + pessoa.obterNome());
                bw.newLine();
                bw.write("Telefone:" + pessoa.obterTelefone());
                bw.newLine();
                bw.write("Email:" + pessoa.obterEmail());
                bw.newLine();
                bw.write("Rua:" + pessoa.obterRua());
                bw.newLine();
                bw.write("Cidade:" + pessoa.obterCidade());
                bw.newLine();
                bw.write("Estado:" + pessoa.obterEstado());
                bw.newLine();
                bw.write("Cep:" + pessoa.obterCep());
                bw.newLine();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o arquivo: " + ex.getMessage());
        }
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas.clear(); // Limpa a lista existente
        this.pessoas.addAll(pessoas); // Adiciona as novas pessoas à lista
        fireTableDataChanged(); // Notifica a tabela sobre a mudança de dados
    }
}
 


    
