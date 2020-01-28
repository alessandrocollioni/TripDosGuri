package Java;

import java.util.List;

public class Guia extends Pessoa{
    private double valor;
    List<Cidade> listaCidades ;
    List<Modalidade> listaModalidade;
    List<TipoPasseio> listaTipoPasseio;


    public Guia(String nome, String datanascimento, String datacadastro, String cpf,  double valor, List<Cidade> listaCidades, List<Modalidade> listaModalidade, List<TipoPasseio> listaTipoPasseio) {
        super(nome, datanascimento, datacadastro, cpf);
        this.valor = valor;
        this.listaCidades = listaCidades;
        this.listaModalidade = listaModalidade;
        this.listaTipoPasseio = listaTipoPasseio;
    }
}
