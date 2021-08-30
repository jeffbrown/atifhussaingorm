package atifhussaingorm

class BootStrap {
    PersonService personService
    def init = { servletContext ->
        Person jake = personService.save 'Jake'
        Person betsy = personService.save 'Betsy'
        personService.save 'Zack'
        personService.save 'Jeff'

        List<Person> searchByIdsResult = personService.searchByids( [2112, jake.id, betsy.id])
        log.debug "Search By Id Returned [${searchByIdsResult?.size()}] records"

        List<Person> listResult = personService.list()
        log.debug "List All Returned [${listResult?.size()}] records"
    }
    def destroy = {
    }
}
