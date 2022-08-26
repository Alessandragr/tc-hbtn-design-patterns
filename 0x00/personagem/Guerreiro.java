public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int inteligencia, int vigor, int forca, int resistencia, int destreza) {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, vigor, forca, resistencia, destreza);
        if (forca < inteligencia && forca < destreza) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    protected double getDanoAtaque() {
        return ((getForca()*0.8) + (getVigor()*0.05) + (getDestreza()*0.1)+ (getInteligencia()*0.05));
    }
}