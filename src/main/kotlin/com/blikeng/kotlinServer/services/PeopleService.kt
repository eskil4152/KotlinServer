package com.blikeng.kotlinServer.services;

import com.blikeng.kotlinServer.entities.Person
import com.blikeng.kotlinServer.repositories.PeopleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PeopleService(@Autowired private val peopleRepository: PeopleRepository) {

    fun getAllPeople(page: Int): Page<Person>{
        return peopleRepository.findAll(Pageable.ofSize(10).withPage(page))
    }

    fun getPeopleByFirstName(firstName: String): List<Person> {
        return peopleRepository.findByFirstName(firstName)
    }

    fun getPeopleByLastName(lastName: String): List<Person> {
        return peopleRepository.findByLastName(lastName)
    }

    fun getPersonByFullName(firstName: String, lastName: String): List<Person> {
        return peopleRepository.findByFullName(firstName, lastName)
    }
}
