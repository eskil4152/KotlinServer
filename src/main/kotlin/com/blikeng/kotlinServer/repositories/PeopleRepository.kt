package com.blikeng.kotlinServer.repositories

import com.blikeng.kotlinServer.entities.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PeopleRepository: JpaRepository<Person, Long> {

    fun findByFirstName(firstName: String): List<Person>

    fun findByLastName(lastName: String): List<Person>

    fun findByFullName(firstName: String, lastName: String): List<Person>
}