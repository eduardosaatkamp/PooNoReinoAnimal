package test.Animals;

import Animals.Animal;
import Animals.Gato;
import org.junit.Assert;
import org.junit.Test;

public class GatoTest {
    @Test
    public void testEmitirSom() {
         Animal gato = new Gato("Garfield");
         gato.emitirSom();
         Assert.assertEquals("Garfield está miando!",
                 gato.getNome() + " está miando!");
    }
}
