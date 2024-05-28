package Animals;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato para emitir som do animal
    abstract void emitirSom();
}
