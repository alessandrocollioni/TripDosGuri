package Test;

import Java.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    @Test
    public void testeSeReservaEfetuadaComSucesso() {
        //ENTRADA
        List<Cidade> listaCidade = new ArrayList<Cidade>();
        listaCidade.add(Cidade.MEXICO);
        listaCidade.add(Cidade.RIO_JANEIRO);

        Viajante viajante = new Viajante("João", "10/10/1992","01/01/2001","012444586", "Programador");

        List<TipoPasseio> listaPasseio = new ArrayList<TipoPasseio>();
        listaPasseio.add(TipoPasseio.GRUPOS);
        listaPasseio.add(TipoPasseio.GRUPOS_FECHADOS);
        listaPasseio.add(TipoPasseio.PRIVATIVO);

        List<Modalidade> listaModalidades = new ArrayList<Modalidade>();
        listaModalidades.add(Modalidade.MERGULHO);
        listaModalidades.add(Modalidade.PARA_QUEDAS);
        listaModalidades.add(Modalidade.CAMINHADA);

        Guia guia = new Guia("Fulano de Tal", "10/10/1990","01/01/2000","012444585", 10.00,listaCidade,listaModalidades,listaPasseio);
        Book book = new Book("10/10/2020", Cidade.PORTO_ALEGRE, TipoPasseio.GRUPOS, 3 , guia ) ;

        //EXECUTA
        List<Viajante> retorno = book.RealizaReserva(viajante);

        //COMPARA
        Assert.assertEquals(false,retorno.isEmpty());


    }
}
