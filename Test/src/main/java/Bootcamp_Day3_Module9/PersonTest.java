package Bootcamp_Day3_Module9;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        // Create a new Person before each test
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // Clean up after each test
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        // float needs a third argument: allowed difference (delta)
        assertEquals(1.75f, person.getHeight(), 0.001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        // Valid BMI categories
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.75));
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));
        assertEquals("Overweight", person.getBodyMassIndex(85, 1.75));
        assertEquals("Obese", person.getBodyMassIndex(100, 1.75));

        // Category boundaries (height 1.0 means BMI equals weight)
        assertEquals("Normal weight", person.getBodyMassIndex(18.5, 1.0));
        assertEquals("Overweight", person.getBodyMassIndex(25, 1.0));
        assertEquals("Obese", person.getBodyMassIndex(30, 1.0));

        // Upper limits that are still valid
        assertEquals("Obese", person.getBodyMassIndex(600, 3.0));

        // Invalid weight
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-5, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.75));

        // Invalid height
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));
    }
}