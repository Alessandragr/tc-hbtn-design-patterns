public class ImpressaoFactory {
    public static Impressao createImpressao( TamanhoImpressao tamanho, int totalPaginas, int quantidadesColoridas, boolean ehFrenteVerso){
        return  new Impressao(tamanho, totalPaginas, quantidadesColoridas, ehFrenteVerso);
    }
}