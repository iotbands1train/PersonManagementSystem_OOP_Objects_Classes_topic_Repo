package module02.objectclassestopics;

/**
 * This class represents an array of Person objects and provides methods to manage and manipulate the array.
 */
public class PersonArray {
    private Person[] persons;

    /**
     * Constructor to create a PersonArray with a specified size.
     */
    public PersonArray(int size) {
        persons = new Person[size];
    }

    /**
     * Constructor to create a PersonArray from an existing array of Person objects.
     */
    public PersonArray(Person[] p) {
        persons = p;
    }

    /**
     * Sets a Person object at a specific index in the array.
     */
    public void setPerson(int index, Person person) {
        index = index < 0 ? 0 : index;
        index = index > persons.length - 1 ? persons.length - 1 : index;
        if (index >= 0 && index < persons.length) {
            persons[index] = person;
        }
    }

    /**
     * Retrieves a Person object from the array based on the index.
     */
    public Person getPersonByIndex(int index) {
        if (index >= 0 && index < persons.length) {
            return persons[index];
        }
        return null;
    }

    /**
     * Returns the size of the PersonArray.
     */
    public int getSize() {
        return persons.length;
    }

    /**
     * Displays details of all Person objects in the array.
     */
    public void displayAll() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                System.out.println("Person " + i + ":");
                persons[i].display();
                System.out.println("================================");
            }
        }
    }

    /**
     * Updates a Person object in the array using a matching person object.
     */
    public void updateByPerson(Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(person.getId())) {
                persons[i] = person;
                return;
            }
        }
    }

    /**
     * Updates a Person object in the array using ID and an updated person object.
     */
    public void updateByPerson(Long id, Person updatedPerson) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(id)) {
                persons[i] = updatedPerson;
                return;
            }
        }
    }

    /**
     * Deletes a Person object from the array using a matching person object.
     */
    public void deleteByPerson(Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(person.getId())) {
                persons[i] = null;
                return;
            }
        }
    }

    /**
     * Deletes a Person object from the array using ID.
     */
    public void deleteByPerson(Long id) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(id)) {
                persons[i] = null;
                return;
            }
        }
    }

    /**
     * Creates a specified number of Person objects and populates the array.
     */
    public void createBulkPersons(int num) {
        num = num > 1 ? num : 1;
        persons = new Person[num];
        for (int i = 0; i < num; i++) {
            persons[i] = new Person();
        }
    }

    /**
     * Prints the details of all Person objects in the array.
     */
    public void print() {
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (person != null) {
                System.out.println(i + " : " + person.printPerson());
            }
        }
    }
}
