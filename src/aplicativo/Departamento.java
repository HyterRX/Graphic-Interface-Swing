package aplicativo;

import java.util.ArrayList;

public class Departamento {
    
    private int codigo;
    private String nome;
    ArrayList<Funcionario> ListaFunc;

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        ListaFunc = new ArrayList();
    }

    public Departamento() {
        ListaFunc = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> listaFunc) {
        this.ListaFunc = listaFunc;
    }
    
    public void addFunc(Funcionario f){
        f.setDep(this);
        ListaFunc.add(f);
    }
    
    
    
}
