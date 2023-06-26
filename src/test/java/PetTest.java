import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {

    @Test
    public void getNameTest() {
//        Arrange
        Pet dog = new Pet("Jack", 7, "Dog");

//        Act
        String petName = dog.getName();

//        Assert
        assertEquals("Jack", petName);
    }

    @Test
    public void getAgeTest() {
//        Arrange
        Pet dog = new Pet("Jack", 7, "Dog");

//        Act
        int age = dog.getAge();

//        Assert
        assertEquals(7, age);
    }

    @Test
    public void getSpiecesTest() {
//        Arrange
        Pet dog = new Pet("Jack", 7, "Dog");

//        Act
        String species = dog.getSpecies();

//        Assert
        assertEquals("Dog", species);
    }

    @Test
    public void setOwnerTest() {
//        Arrange
        Person person = new Person("Jos", "van", "Puffelen", 69, "Male");
        Pet dog = new Pet("Jack", 7, "Dog");


//        Act
        dog.setOwner(person);
        String owner = dog.getOwner().getName();

//        Assert
        assertEquals("Jos", owner);
    }
}