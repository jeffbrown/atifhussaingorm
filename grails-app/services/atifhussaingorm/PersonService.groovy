package atifhussaingorm

import grails.gorm.services.Service

@Service(Person)
abstract class PersonService {
    abstract Person save(String name);

    List<Person> searchByids(List<Long> ids) {
        Person.findAllByIdInList(ids)
    }

    List<Person> list() {
        Person.findAll()
    }

}
