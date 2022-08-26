public class WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        Personagem personagem;
        if (tipoPersonagem.equals(TipoPersonagem.MAGO)) {
            personagem = new Mago("Mago", 8, 3, 3, 3 ,4);
        } else if (tipoPersonagem.equals(TipoPersonagem.GUERREIRO)) {
            personagem = new Guerreiro("Ladrao", 0, 7, 9, 10, 7);
        } else {
            personagem = new Ladrao("Guerreiro", 1, 7, 8, 7, 10);
        }
        return personagem;
    }
}
