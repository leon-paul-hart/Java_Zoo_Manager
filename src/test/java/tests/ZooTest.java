package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import zoomanager.creature.Creature;
import zoomanager.enclosure.Enclosure;
import zoomanager.food.Food;
import zoomanager.food.IFood;
import zoomanager.zoo.IZoo;
import zoomanager.zoo.Zoo;

public class ZooTest {

    IZoo IZoo;
    Creature creature;
    Enclosure enclosure1;
    Enclosure enclosure2;
    IFood food;

    @BeforeEach
    public void before() {
        IZoo = new Zoo("Zizis Zodiac Ziggarut!");
        creature = new Creature("Morchock", "Dragon", "Spicy");
        enclosure1 = new Enclosure("Volcanic Cave", "Fire", 3);
        enclosure2 = new Enclosure("Damp Cave", "Water", 2);
        food = new Food("Spicy Haggis");
    }

    @Test
    public void getZooNameTest() {
                
        //Arrange

        //Act

        //Assert
        assertEquals("Zizis Zodiac Ziggarut!", IZoo.getZooName());
    }

    @Test
    public void new_Zoo_Has_Zero_Enclosures() {
                
        //Arrange

        //Act

        //Assert
        assertEquals(0, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_An_Enclosure() {
                
        //Arrange

        //Act
        IZoo.addEnclosure(enclosure1);

        //Assert
        assertEquals(1, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_Two_Enclosures() {
                
        //Arrange

        //Act
        IZoo.addEnclosure(enclosure1);
        IZoo.addEnclosure(enclosure2);

        //Assert
        assertEquals(2, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_And_Remove_An_Enclosure() {
        
        //Arrange
        IZoo.addEnclosure(enclosure1);

        //Act
        IZoo.removeEnclosure(enclosure1);

        //Assert
        assertEquals(0, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_Two_Enclosures_And_Remove_One_Enclosure() {

        //Arrange
        IZoo.addEnclosure(enclosure1);
        IZoo.addEnclosure(enclosure2);
        
        //Act
        IZoo.removeEnclosure(enclosure1);

        //Assert
        assertEquals(1, IZoo.countEnclosures());
    }

    @Test
    public void feedCreatureTest() {

        //Arrange

        //Act
        IZoo.feedCreature(creature, food);

        //Assert
        assertEquals(1, creature.getStomachContentsCount());
    }

}
