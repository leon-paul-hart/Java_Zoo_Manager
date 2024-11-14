package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import zoomanager.creature.Creature;
import zoomanager.enclosure.Enclosure;

public class EnclosureTest {

    private Enclosure enclosure;
    private Enclosure enclosure2;
    private Creature creature;
    private Creature creature2;
    private Creature creature3;

    @BeforeEach
    public void before() {
        enclosure = new Enclosure("Volcanic Cave", "Fire", 3);
        enclosure2 = new Enclosure("Volcano Cliff Face", "Fire", 2);
        creature = new Creature("Morchock", "Dragon", "Spicy");
        creature2 = new Creature("Phoosh", "Phoenix", "Spicy");
        creature3 = new Creature("Deimos", "Hellhound", "Spicy");
    }

    @Test
    public void getEnclosureNameTest() {
        assertEquals("Volcanic Cave", enclosure.getEnclosureName());
    }

    @Test
    public void getEnclosureTypeTest() {
        assertEquals("Fire", enclosure.getEnclosureType());
    }

    @Test
    public void getEnclosureMaxCapacityTest() {
        assertEquals(3, enclosure.getEnclosureCapacity());
    }

    @Test
    public void getEnclosureCreaturesTest() {
        assertEquals(0, enclosure.getEnclosureCreaturesList().size());
    }

    @Test
    public void countCreatures() {
        assertEquals(0, enclosure.countEnclosureCreatures());
    }

    @Test
    public void addCreatureTest() {
        enclosure.addCreatureToEnclosure(creature);
        assertEquals(1, enclosure.countEnclosureCreatures());
    }

    @Test
    public void addTwoCreaturesTest() {
        enclosure.addCreatureToEnclosure(creature);
        enclosure.addCreatureToEnclosure(creature2);
        assertEquals(2, enclosure.countEnclosureCreatures());
    }

    @Test
    public void removeCreatureTest() {
        enclosure.addCreatureToEnclosure(creature);
        enclosure.removeCreatureFromEnclosure(creature);
        assertEquals(0, enclosure.countEnclosureCreatures());
    }

    @Test
    public void checkIfEnclosureIsEmptyTest() {
        assertEquals(true, enclosure.checkIfEnclosureIsEmpty());
    }

    @Test
    public void checkIfEnclosureIsNotEmpty() {
        enclosure.addCreatureToEnclosure(creature);
        assertEquals(false, enclosure.checkIfEnclosureIsEmpty());
    }

    @Test
    public void checkIfEnclosureIsNotFullTest() {
        enclosure.addCreatureToEnclosure(creature);
        enclosure.addCreatureToEnclosure(creature2);
        assertEquals(false, enclosure.checkIfEnclosureIsFull());
    }

    @Test
    public void checkIfEnclosureIsFullTest() {
        enclosure.addCreatureToEnclosure(creature);
        enclosure.addCreatureToEnclosure(creature2);
        enclosure.addCreatureToEnclosure(creature3);
        assertEquals(true, enclosure.checkIfEnclosureIsFull());
    }

    @Test
    public void newEnclosureCountIncreasesByOneTest() {
        enclosure.addCreatureToEnclosure(creature);
        enclosure.moveCreatureBetweenEnclosures(creature, enclosure2);
        assertEquals(1, enclosure2.countEnclosureCreatures());
    }

    @Test
    public void previousEnclosureDecreasesByOneTest() {
        enclosure.addCreatureToEnclosure(creature);
        enclosure.moveCreatureBetweenEnclosures(creature, enclosure2);
        assertEquals(0, enclosure.countEnclosureCreatures());
    }

} // End of class
