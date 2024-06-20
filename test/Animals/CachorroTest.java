package test.Animals;

import Animals.Animal;
import Animals.Cachorro;
import org.junit.Assert;
import org.junit.Test;

public class CachorroTest {

    @Test
    public void testEmitirSom() {
        Animal cachorro = new Cachorro("Kripto");
        cachorro.emitirSom();

        Assert.assertEquals("Kripto está latindo!",
                cachorro.getNome() + " está latindo!");
    }

}
