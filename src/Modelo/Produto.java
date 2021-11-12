package Modelo;


public class Produto {
    private String nome, marca, fornecedor, validade, codbarras;
    private int quantidade;
    
    public Produto() {
        this.nome = null;
        this.marca = null;
        this.fornecedor = null;
        this.validade = null;
        this.codbarras = null;
        this.quantidade = 0;
    }
    
    public Produto(String nome, String marca, String fornecedor, String validade, String codbarras, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.fornecedor = fornecedor;
        this.validade = validade;
        this.codbarras = codbarras;
        this.quantidade = quantidade;
    }
    
    // Nome
    public String getNome_produto() {
        return nome;
    }
    public void setNome_produto(String nome) {
        this.nome = nome;
    }
    
    // Marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Fornecedor
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    // Fornecedor
    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    // Codigo de Barras
    public String getCodbarras() {
        return codbarras;
    }
    public void setCodbarras(String codbarras) {
        this.codbarras = codbarras;
    }
    
    // Quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
