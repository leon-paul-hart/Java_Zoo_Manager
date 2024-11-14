package zoomanager.zoo;

import zoomanager.creature.Creature;
import zoomanager.enclosure.Enclosure;
import zoomanager.food.IFood;

import java.util.ArrayList;

public class Zoo implements IZoo {

    private final String name;
    private final ArrayList<Enclosure> enclosures;
    private final ArrayList<Creature> creatures;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new ArrayList<>();
        this.creatures = new ArrayList<>();
    }

    public String getZooName() {
        return this.name;
    }

    // TODO : 14/11/2024 Zoo itself should not be feeding creatures, it should likely be a call to a yet to be implemented 'ZooStaff' class to assign a task to feed creatures.

    public void feedCreature(Creature creature, IFood food) {

        if (creature.getHungerState()) {
            creature.eat(food);
        }

        creature.getStomachContentsCount();
    }

    public int countEnclosures() {
        return this.enclosures.size();
    }

    // TODO: 02/06/2020 Add an additional method for creating a new enclosure and its details

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

    // TODO: 02/06/2020 Add an additional method for creating a new creature and its details
    public void addCreature(Creature creature) {
        this.creatures.add(creature);
    }

    public void removeCreature(Creature creature) {
        this.creatures.remove(creature);
    }

    // TODO: 30/05/2020 Add method to return array of creatures
    // TODO: 30/05/2020 Add method(s) to get list of creature names/details
}
