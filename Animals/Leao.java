package Animals;

public class Leao extends Animal implements AcaoAnimal {
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo!");
    }

    @Override
    public void executarAcao() {
        System.out.println(getNome() + " está caçando!");
    }
}
