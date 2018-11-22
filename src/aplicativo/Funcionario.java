package aplicativo;

public class Funcionario {
    
    
    private String nome;
    private String cpf;
    private Departamento Dep;
    
    public String getNome() {
        return nome;
    }

    public Departamento getDep() {
        return Dep;
    }

    public void setDep(Departamento Dep) {
        this.Dep = Dep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
}
