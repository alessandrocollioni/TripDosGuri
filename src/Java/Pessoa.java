package Java;

import java.util.List;

public abstract class Pessoa {

    private String nome;
    private String datanascimento;
    private  String datacadastro;
    private String cpf;
    private List<Book> listaBooks;

    public Pessoa(String nome, String datanascimento, String datacadastro, String cpf) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.datacadastro = datacadastro;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(String datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getCpf() {
        return cpf;
    }






}
