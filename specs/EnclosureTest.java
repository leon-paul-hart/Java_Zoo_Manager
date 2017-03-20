import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
import java.util.*;

public class EnclosureTest {

  Enclosure enclosure;
  Creature creature;
  ArrayList<Creature> creatures;

  @Before
  public void before() {
    creature = new Creature( "Morchock" , "Dragon" , "Fire" );
    creatures = new ArrayList<Creature>();
    enclosure = new Enclosure( "Volcanic Cave" , "Fire" , 3 );
  }

  @Test
  public void getEnclosureNameTest() {
    assertEquals( "Volcanic Cave" , enclosure.getEnclosureName() );
  }

  @Test
  public void getEnclosureTypeTest() {
    assertEquals( "Fire" , enclosure.getEnclosureType() );
  }

  @Test
  public void getEnclosureMaxCapacityTest() {
    assertEquals( 3 , enclosure.getEnclosureMaxCapacity() );
  }

  @Test
  public void getEnclosureCreaturesTest() {
    assertEquals( 0 , enclosure.getEnclosureCreatures().size() );
  }

}
