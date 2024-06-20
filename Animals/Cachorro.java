package Animals;

public class Cachorro extends Animal implements AcaoAnimal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo!");
    }

    @Override
    public void executarAcao() {
        System.out.println(getNome() + " está abanando o rabo!");
    }
}

