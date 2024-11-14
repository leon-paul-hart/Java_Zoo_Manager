package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import zoomanager.creature.Creature;
import zoomanager.food.Food;

public class CreatureTest {

    private Creature creature;

    @BeforeEach
    public void before() {
        creature = new Creature("Spot", "Dog", "Spicy");
    }

    @Test
    public void getCreatureName() {

        // Arrange

        //Act

        //Assert
        assertEquals("Spot", creature.getCreatureName());
    }

    @Test
    public void getCreatureType() {
        
        // Arrange

        //Act

        //Assert
        assertEquals("Dog", creature.getCreatureType());
    }

    @Test
    public void defaultStateStomachContentsIsEmpty() {
        
        // Arrange

        //Act

        //Assert
        assertEquals(0, creature.getStomachContentsCount());
    }

    @Test
    public void defaultStateIsHungryEqualsTrue() {
        
        // Arrange

        //Act

        //Assert
        assertEquals(true, creature.getHungerState());
    }

    @Test
    public void defaultStateHasEnclosureEqualsFalse() {
        
        // Arrange

        //Act

        //Assert
        assertEquals(false, creature.getContainmentState());
    }

    @Test
    public void getCreatureFoodPreferences() {
        
        // Arrange

        //Act

        //Assert
        assertEquals("Spicy", creature.getPreferences());
    }

    @Test
    public void creatureCanBeFedOnce() {
        
        // Arrange
        
        //Act
        creature.eat(new Food("Sausages"));

        //Assert
        assertEquals(1, creature.getStomachContentsCount());
    }

    @Test
    public void creatureCanBeFedMoreThanOnce() {
        
        // Arrange

        //Act
        creature.eat(new Food("Sausages"));
        creature.eat(new Food("Steak"));

        //Assert
        assertEquals(2, creature.getStomachContentsCount());
    }

    @Test
    public void creatureIsNoLongerHungryOnceFed() {
        
        // Arrange

        //Act
        creature.eat(new Food("Sausages"));

        //Assert
        assertEquals(false, creature.getHungerState());
    }

}
