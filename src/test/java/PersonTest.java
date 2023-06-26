import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getName() {
        String name = "Jack";
        // arrange
        Person personTest = new Person(name, "Couchpotato", 7, "Male");

        // act
        String nameTest = personTest.getName();

        // assert
        assertEquals(name, nameTest);
    }

    @Test
    public void getMiddleName() {
        String middleName = "the";
        // arrange
        Person personTest = new Person("Jack", middleName, "Couchpotato", 7, "Male");

        // act
        String middleNameTest = personTest.getMiddleName();

        // assert
        assertEquals(middleName, middleNameTest);
    }

    @Test
    public void getLastName() {
        String middleName = "Couchpotato";
        // arrange
        Person personTest = new Person("Jack", "Couchpotato", 7, "Male");

        // act
        String lastNameTest = personTest.getLastName();

        // assert
        assertEquals(middleName, lastNameTest);
    }

    @Test
    public void getSex() {
        String sex = "Male";
        // arrange
        Person personTest = new Person("Jack", "Couchpotato", 7, sex);

        // act
        String sexTest = personTest.getSex();

        // assert
        assertEquals(sex, sexTest);
    }

    @Test
    public void getAge() {
        int age = 7;
        // arrange
        Person personTest = new Person("Jack", "Couchpotato", age, "Male");

        // act
        int ageTest = personTest.getAge();

        // assert
        assertEquals(age, ageTest);
    }

    @Test
    public void getMother() {
        // arrange
        Person personTest = new Person("Jack", "Couchpotato", 7, "Male");
        Person personTestMother = new Person("Nala", "LionKing", 12, "Female");
        personTest.setMother(personTestMother);
        // act
        Person mother = personTest.getMother();

        // assert
        assertEquals(mother, personTestMother);
    }

    @Test
    public void getFather() {
        // arrange
        Person personTest = new Person("Jack", "Couchpotato", 7, "Male");
        Person personTestFather = new Person("Simba", "LionKing", 12, "Female");
        personTest.setFather(personTestFather);
        // act
        Person father = personTest.getFather();

        // assert
        assertEquals(father, personTestFather);
    }

    @Test
    public void setAge() {
        // arrange
        Person personTest = new Person("Jack", "Couchpotato", 7, "male");

        // act
        personTest.setAge(10);
        int age = personTest.getAge();

        // assert
        assertEquals(10, age);
    }

    @Test
    public void setSex() {
        // arrange
        Person personTest = new Person("Jack", "Couchpotato", 7, "male");

        // act
        personTest.setSex("female");
        String sex = personTest.getSex();

        // assert
        assertEquals("female", sex);
    }

    @Test
    public void addParent() {
        // arrange
        Person childTest = new Person("Jack", "Couchpotato", 7, "Male");
        Person fatherTest = new Person("Simba", "Couchpotato", 14, "Male");
        Person motherTest = new Person("Nala", "Couchpotato", 14, "Female");

        // act
        childTest.addParents(fatherTest, motherTest, childTest);
        Person father = childTest.getFather();
        Person mother = childTest.getMother();

        // assert
        assertEquals(fatherTest, father);
        assertEquals(motherTest, mother);
    }

    @Test
    public void addChild() {
        // arrange
        Person parentTest = new Person("Simba", "Couchpotato", 14, "Male");
        Person childTest = new Person("Jack", "Couchpotato", 14, "Female");

        List<Person> children = new ArrayList<>();
        children.add(childTest);

        // act
        parentTest.addChild(parentTest, childTest);
        List<Person> childrenTest = parentTest.getChildren();

        // assert
        assertEquals(children, childrenTest);
    }

    @Test
    public void addPet() {
        // arrange
        Person ownerTest = new Person("Jos", "Couchpotato", 69, "Male");
        Pet dog = new Pet("Jack", 7, "Dog");
        Pet dog2 = new Pet("Simba", 6, "Dog");
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(dog2);

        // act
        ownerTest.addPet(ownerTest,dog);
        ownerTest.addPet(ownerTest, dog2);

        // assert
        assertEquals(pets, ownerTest.getPets());
    }

    @Test
    public void addSibblings() {
        // arrange
        Person personTest = new Person("Jos", "Couchpotato", 69, "Male");
        Person siblingTest = new Person("Jane", "Couchpotato", 69, "Female");
        List<Person> siblings = new ArrayList<>();

        siblings.add(siblingTest);

        // act
        personTest.addSibling(personTest, siblingTest);

        //assert
        assertEquals(siblings, personTest.getSiblings());
    }
}