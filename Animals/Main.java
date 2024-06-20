package Animals;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Kripto");
        Animal gato = new Gato("Garfield");
        Animal leao = new Leao("Simba");

        cachorro.emitirSom();
        gato.emitirSom();
        leao.emitirSom();

        ((AcaoAnimal) cachorro).executarAcao();
        ((AcaoAnimal) gato).executarAcao();
        ((AcaoAnimal) leao).executarAcao();
    }
}
