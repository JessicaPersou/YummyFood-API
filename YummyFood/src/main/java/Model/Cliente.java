package Model;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private boolean isAtivo = false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void ativar() {
        this.isAtivo = true;
    }

}