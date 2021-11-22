package Modelo;

public class Venda {
    private String nome_produto, data;
    private float valor;
    private int quantidade;
    
    //Nome
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    
    //Quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    //Valor
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    //Data
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}
