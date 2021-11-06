package Modelo;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cargo;
    
    
    public Usuario(){
        this.nome = null;
        this.email = null;
        this.senha = null;
        this.telefone = null;
        this.cargo = null;
    }
    
    public Usuario(String nome, String email,String telefone, String cargo){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cargo = cargo;
    }
  
    public Usuario(String nome, String email, String senha, String telefone, String cargo){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cargo = cargo;
    }
    
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    //Senha
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Cargo
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
