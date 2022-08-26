public class WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        Personagem personagem;
        if (tipoPersonagem.equals(TipoPersonagem.MAGO)) {
            personagem = new Mago(nome, 8, 3, 3, 3 ,4);
        } else if (tipoPersonagem.equals(TipoPersonagem.GUERREIRO)) {
            personagem = new Guerreiro(nome, 0, 9, 7, 10, 7);
        } else {
            personagem = new Ladrao(nome, 1, 8, 7, 7, 10);
        }
        return personagem;
    }
}
