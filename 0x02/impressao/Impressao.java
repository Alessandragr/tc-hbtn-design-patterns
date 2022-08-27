public class Impressao {
    private int paginasTotais;

    private int paginasColoridas;

    private boolean ehFrenteVerso;

    private double valorColoridasFrenteVerso;

    private double valorPretoBrancoFrenteVerso;

    private double valorColoridasFrenteApenas;

    private double ValorPretoBrancoFrenteApenas;

    private TamanhoImpressao tamanhoImpressao;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;

    }

    public Impressao() {
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getGetValorPretoBrancoFrenteApenas() {
        return ValorPretoBrancoFrenteApenas;
    }

    public void setGetValorPretoBrancoFrenteApenas(double getValorPretoBrancoFrenteApenas) {
        this.ValorPretoBrancoFrenteApenas = getValorPretoBrancoFrenteApenas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public double calcularTotal() {
        double impressaoPretoBranco = 0;
        double impressaoColorida = 0;
        double valorTotalImpressao = 0;
        switch (tamanhoImpressao) {
            case A2:
                impressaoPretoBranco = (ehFrenteVerso) ? .18 : .22;
                impressaoColorida = (ehFrenteVerso) ? .28 : .32;
                break;
            case A3:
                impressaoPretoBranco = (ehFrenteVerso) ? .15 : .20;
                impressaoColorida = (ehFrenteVerso) ? .25 : .30;
                break;
            case A4:
                impressaoPretoBranco = (ehFrenteVerso) ? .10 : .15;
                impressaoColorida = (ehFrenteVerso) ? .20 : .25;
                break;
        }

        valorTotalImpressao = impressaoPretoBranco * getPaginasPretoBranco() + impressaoColorida * getPaginasColoridas();
        return valorTotalImpressao;
    }

    private int getPaginasPretoBranco() {
        return getPaginasTotais() - getPaginasColoridas();
    }

    @Override
    public String toString() {

        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                getPaginasTotais(),
                getPaginasColoridas(),
                getPaginasPretoBranco(),
                (ehFrenteVerso) ? "frente e verso" : "frente apenas",
                calcularTotal());
    }
}