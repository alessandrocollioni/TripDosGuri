package Java;

public enum TipoPasseio {

        PRIVATIVO(01),GRUPOS(02),GRUPOS_FECHADOS(03);

        public int valorTipoPasseio;
        TipoPasseio(int valor) {
            valorTipoPasseio = valor;
        }

}
