package test.Animals;

import Animals.Animal;
import Animals.Leao;
import org.junit.Assert;
import org.junit.Test;

public class LeaoTest {
    @Test
    public void testEmitirSom() {
         Animal leao = new Leao("Simba");
         leao.emitirSom();
         Assert.assertEquals("Simba está rugindo!",
                 leao.getNome() + " está rugindo!");
    }
}
