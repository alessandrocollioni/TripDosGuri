package Java;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private  String data;
    private Cidade cidade;
    private  TipoPasseio tipoPasseio;
    private  Integer qtdVagas;
    private Double total;
    private List<Viajante> listaViajantes;
    private Guia guia;

    public Book(String data, Cidade cidade, TipoPasseio tipoPasseio, Integer qtdVagas, Guia guia) {
        this.data = data;
        this.cidade = cidade;
        this.tipoPasseio = tipoPasseio;
        this.qtdVagas = qtdVagas;
        this.guia = guia;
        this.listaViajantes = new ArrayList<Viajante>(qtdVagas);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public TipoPasseio getTipoPasseio() {
        return tipoPasseio;
    }

    public void setTipoPasseio(TipoPasseio tipoPasseio) {
        this.tipoPasseio = tipoPasseio;
    }

    public Integer getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(Integer qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


    public List<Viajante> RealizaReserva(Viajante viajante) {
        return null;
    }

    public List<Viajante> getListaViajantes() {
        return listaViajantes;
    }
}
