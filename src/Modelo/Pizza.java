package Modelo;

public class Pizza {
    private String nome, ingredientes;
    private Float valor;
    
    
    public Pizza(){
        this.nome = null;
        this.ingredientes = null;
        this.valor = null;
    }
    
    public Pizza(String nome, String ingredientes, Float valor){
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.valor = valor;
    }
  
    public Pizza(String nome){
        this.nome = nome;
    }
    
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Ingredientes
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    //Ingredientes
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    
}
