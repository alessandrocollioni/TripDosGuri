package Java;

public enum Modalidade {

        TRILHA(01),CAMINHADA(02),MERGULHO(03),PARA_QUEDAS(04);

        public int valorModalidade;
        Modalidade(int valor) {
            valorModalidade = valor;
        }
}
