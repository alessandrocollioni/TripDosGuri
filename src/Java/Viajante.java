package Java;

import java.util.List;

public class Viajante extends Pessoa {
    private String profissao;


    public Viajante(String nome, String datanascimento, String datacadastro, String cpf, String profissao) {
        super(nome, datanascimento, datacadastro, cpf);
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
