public class Ladrao extends Personagem{

    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.LADRAO, inteligencia, vigor, forca, resistencia, destreza);

        if (forca < inteligencia && forca < destreza) {
            throw new IllegalArgumentException("Atributos invalidos para LADRAO");
        }
    }

    public double getDanoAtaque() {
        return ((getForca()*0.5) + (getDestreza()*0.35) + (getVigor()*0.1) + (getInteligencia()*0.05));
    }
}
