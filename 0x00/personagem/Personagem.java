abstract class Personagem {
        private String nome;
        private TipoPersonagem tipoPersonagem;
        private int inteligencia;
        private int vigor;
        private int forca;
        private int resistencia;
        private int destreza;

    public Personagem(String nome, TipoPersonagem tipoPersonagem, int inteligencia, int vigor, int forca, int resistencia, int destreza) {
        this.nome = nome;
        this.tipoPersonagem = tipoPersonagem;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    abstract double getDanoAtaque() {
        return this.forca;
    }

    @Override
    public String toString() {
        return String.format("Personagem { nome = %s, tipo = %s, inteligencia = %d, forca = %d, vigor = %d, resistencia = %d, destreza = %d, dano ataque = %.2f }", nome, tipoPersonagem,
                inteligencia, forca, vigor, resistencia, destreza, getDanoAtaque());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPersonagem getTipoPersonagem() {
        return tipoPersonagem;
    }

    public void setTipoPersonagem(TipoPersonagem tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}
