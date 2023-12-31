package com.blikeng.kotlinServer.services

import com.blikeng.kotlinServer.entities.People
import com.blikeng.kotlinServer.repositories.PeopleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PeopleService(@Autowired private val peopleRepository: PeopleRepository) {

    fun getAllPeople(): List<People> {
        return peopleRepository.findAll()
    }

    fun getPeopleByFirstName(firstName: String): List<People> {
        return peopleRepository.findByFirstName(firstName)
    }

    fun getPeopleByLastName(lastName: String): List<People> {
        return peopleRepository.findByLastName(lastName)
    }

    fun getPersonByFullName(firstName: String, lastName: String): List<People> {
        return peopleRepository.findByFirstNameAndLastName(firstName, lastName)
    }

    fun getPersonById(id: Long): People? {
        return peopleRepository.findPeopleById(id)
    }

    fun addPerson(person: People): People {
        return peopleRepository.save(person)
    }

    fun deletePerson(id: Long) {
        return peopleRepository.deleteById(id)
    }
}
