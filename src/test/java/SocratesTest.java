import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SocratesTest {

     <T> Comparator<T> comparator(Class<T> clazz) {
         return new Comparator<T>() {
             @Override
             public int compare(T o1, T o2) {
                 return 0;
             }
         };
     }

    @Test
    void test() {
        Assertions.assertThat(true).isTrue();
    }


    @Test
    public void isVaccinatedReturnNull(){
        isVaccinated(new ArrayList<Animal>());
        isVaccinated(new ArrayList<Chat>());
        isVaccinated(new ArrayList<EtreVivant>());

    }
    private Boolean isVaccinated(List<? extends Animal> animal) {
        return null;
    }

    @Test
    void ajouteAnimalDuJour() {
        ajouteAnimalDuJour(new ArrayList<Animal>());
        ajouteAnimalDuJour(new ArrayList<Chat>());
        ajouteAnimalDuJour(new ArrayList<EtreVivant>());

    }

    private void ajouteAnimalDuJour(List<? super Animal> animals){
        animals.add(new Zebre(){});
    }

    <T extends Animal> List<T> trierLesBetes(Comparator<? super T> comparator, Collection<T> animals) {
        return null;
    }

    // comparator -> du type T ou d'une classe mère de type T
    // collection -> d'un type T qui dérive d'animal

    @Test
    void trierLesBetes() {
         // Must work
        trierLesBetes(comparator(Animal.class), new ArrayList<Animal>());
        trierLesBetes(comparator(EtreVivant.class), new ArrayList<Animal>());
        trierLesBetes(comparator(Chat.class), new ArrayList<Chat>());
        trierLesBetes(comparator(Chien.class), new ArrayList<Chien>());
        trierLesBetes(comparator(Animal.class), new ArrayList<Chat>());

        // Must not work
        trierLesBetes(comparator(Chat.class), new ArrayList<Animal>());
        trierLesBetes(comparator(Vegetal.class), new ArrayList<Animal>());
        trierLesBetes(comparator(Chien.class), new ArrayList<Chat>());
        trierLesBetes(comparator(Vegetal.class), new ArrayList<Fleur>());

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
interface Fleur extends Vegetal {}
interface Champignon extends EtreVivant {}
interface Protiste extends EtreVivant {}
interface Monaire extends EtreVivant {}

