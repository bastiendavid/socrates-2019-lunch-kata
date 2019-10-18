import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SocratesTest {

    @Test
    void test() {
        Assertions.assertThat(true).isTrue();
    }
}


interface EtreVivant {}

interface Animal extends EtreVivant {}

interface Vertebre extends Animal {}

interface Mamifere extends Vertebre {}

interface Equide extends Mamifere {}

interface Cheval extends Equide {}
interface Zebre extends Equide {}

interface Felin extends Mamifere {}

interface Tigre extends Felin {}
interface Chat extends Felin {}

interface Siamois extends Chat{}

interface Canide extends Mamifere {}
interface Chien extends Canide {}
interface Loup extends Canide {}

interface Primate extends Mamifere {}

interface Oiseau extends Vertebre {}

interface Poisson extends Vertebre {}


interface Invertebre extends Animal {}
interface Mollusque extends Invertebre {}
interface Insecte extends Invertebre {}


interface Vegetal extends EtreVivant {}
interface Champignon extends EtreVivant {}
interface Protiste extends EtreVivant {}
interface Monaire extends EtreVivant {}
