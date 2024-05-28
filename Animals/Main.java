package Animals;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de animais
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Whiskers");

        // Chamando métodos comuns a todos os animais
        cachorro.emitirSom();
        gato.emitirSom();

        // Polimorfismo: Chamando método específico da interface AcaoAnimal
        ((AcaoAnimal) cachorro).executarAcao();
        ((AcaoAnimal) gato).executarAcao();
    }
}
