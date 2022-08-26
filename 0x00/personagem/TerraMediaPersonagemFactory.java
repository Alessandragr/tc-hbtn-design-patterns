public class TerraMediaPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        Personagem personagem;
        if (tipoPersonagem.equals(TipoPersonagem.MAGO)) {
            personagem = new Mago("Mago", 10, 2, 5, 3 ,4);
        } else if (tipoPersonagem.equals(TipoPersonagem.GUERREIRO)) {
            personagem = new Guerreiro("Ladrao", 1, 8, 5, 10, 6);
        } else {
            personagem = new Ladrao("Guerreiro", 2, 6, 8, 5, 10);
        }
        return personagem;
    }
}
