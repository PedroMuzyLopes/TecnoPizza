package Tabelas;

import Modelo.Produto;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Vector;

public class Produtos_Selecionados extends AbstractTableModel {
    public static final int COL_CODIGO=0;
    public static final int COL_NOME=1;
    public static final int COL_MARCA=2;
    public static final int COL_FORNECEDOR=3;
    public static final int COL_VALIDADE=4;
    public static final int COL_QTD=5;
    
    public ArrayList<Produto> lista;
    
    public Produtos_Selecionados(ArrayList<Produto>l){
        lista = new ArrayList<Produto>(l);
    }
    
    public Produtos_Selecionados() {
        throw new UnsupportedOperationException("Ainda não suportado.");
    }
   
    // adds a row   
   public void addProduto(String cod_produto, String nome_produto, String marca_produto, String fornecedor_produto, String validade_produto, int qtd_produto) {
      //lista.add();
      fireTableRowsInserted(lista.size()-1, lista.size()-1);
   }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() { /*QUANTIDADE DE COLUNAS COLUNAS*/
            return 6;
    }
    @Override
    public Object getValueAt(int linhas, int colunas) { /*CONTEUDO DAS LINHAS*/
        Produto produtos = lista.get(linhas);
        
        if (colunas == COL_CODIGO) return produtos.getCodbarras();
        if (colunas == COL_NOME) return produtos.getNome_produto();
        if (colunas == COL_MARCA) return produtos.getMarca();
        if (colunas == COL_FORNECEDOR) return produtos.getFornecedor();
        if (colunas == COL_VALIDADE) return produtos.getValidade();
        if (colunas == COL_QTD) return produtos.getQuantidade();
        return("");
    }
    
    @Override
    public String getColumnName(int colunas){ /*NOMEIA AS COLUNAS*/
        if (colunas == COL_CODIGO) return "Código de barras";
        if (colunas == COL_NOME) return "Nome";
        if (colunas == COL_MARCA) return "Marca";
        if (colunas == COL_FORNECEDOR) return "Fornecedor";
        if (colunas == COL_VALIDADE) return "Validade";
        if (colunas == COL_QTD) return "Quantidade";
        return"";
    }
}
