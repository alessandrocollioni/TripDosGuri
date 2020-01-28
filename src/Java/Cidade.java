package Java;

public enum Cidade {
    MEXICO(01),SAO_PAULO(02),RIO_JANEIRO(03),PORTO_ALEGRE(04);

    public int valorCidade;
    Cidade(int valor) {
        valorCidade = valor;
    }
}
