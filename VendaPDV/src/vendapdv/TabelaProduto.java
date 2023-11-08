package vendapdv;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TabelaProduto extends AbstractTableModel {
    private static final int COLUNA_NOME = 0;
    private static final int COLUNA_PRECO = 1;
    private static final int COLUNA_QUANTIDADE = 2;

    private String[] colunas = new String[]{"Nome", "Preço", "Quantidade"};
    private List<Produto> produtos;

    public TabelaProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Produto produto = produtos.get(row);
        switch (col) {
            case COLUNA_NOME:
                return produto.obterNomeProduto();
            case COLUNA_PRECO:
                return produto.obterPreco();
            case COLUNA_QUANTIDADE:
                return produto.obterQuantidadeEstoque();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        Produto produto = produtos.get(row);
        switch (column) {
            case COLUNA_NOME:
                produto.atualizarNomeProduto(aValue.toString());
                break;
            case COLUNA_PRECO:
                produto.atualizarPreco((Double) aValue);
                break;
            case COLUNA_QUANTIDADE:
                produto.atualizarQuantidadeEstoque((Integer) aValue);
                break;
        }
    }

    public Produto obterProduto(int indice) {
        return produtos.get(indice);
    }

    public void incluirProduto(Produto produto) {
        produtos.add(produto);
        int ultimo = getRowCount() - 1;
        fireTableRowsInserted(ultimo, ultimo);
    }

    public void atualizarProduto(int indice, Produto produto) {
        produtos.set(indice, produto);
        fireTableRowsUpdated(indice, indice);
    }

    public void excluirProduto(int indice) {
        produtos.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}
