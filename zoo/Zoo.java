package zoo;

import org.jetbrains.annotations.NotNull;
import zoo.creature.Creature;
import zoo.enclosure.Enclosure;
import zoo.food.IFood;

import java.util.ArrayList;

public class Zoo {

    private final String name;

    private final ArrayList<Enclosure> enclosures;

    private final ArrayList<Creature> creatures;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new ArrayList<Enclosure>();
        this.creatures = new ArrayList<Creature>();
    }

    public String getZooName() {
        return this.name;
    }

    public void feedCreature(@NotNull Creature creature, IFood food) {

        if (creature.getHungerState()) {
            creature.eat(food);
        }
        creature.getStomachContents();
    }

    public int countEnclosures() {
        return this.enclosures.size();
    }

    public void addEnclosure(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        this.enclosures.remove(enclosure);
    }

    // TODO: 30/05/2020 Add method to return array of enclosures
    // TODO: 30/05/2020 Add method(s) to get list of enclosure names/details

    public int countCreatures() {
        return this.creatures.size();
    }

    public void addCreature(Creature creature) {
        this.creatures.add(creature);
    }

    public void removeCreature(Creature creature) {
        this.creatures.remove(creature);
    }

    // TODO: 30/05/2020 Add method to return array of creatures
    // TODO: 30/05/2020 Add method(s) to get list of creature names/details
}
