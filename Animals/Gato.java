package Animals;

class Gato extends Animal implements AcaoAnimal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(getNome() + " está miando!");
    }

    @Override
    public void executarAcao() {
        System.out.println(getNome() + " está ronronando!");
    }
}