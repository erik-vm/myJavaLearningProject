package libary.factory;

import libary.model.Person;

public class PersonFactory {

    public Person createPerson(long id, String name) {
        Person person = new Person();
        person.setName(name);
        person.setId(id);
        return person;
    }
}
