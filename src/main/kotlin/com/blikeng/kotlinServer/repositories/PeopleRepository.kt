package com.blikeng.kotlinServer.repositories

import com.blikeng.kotlinServer.entities.People
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PeopleRepository: JpaRepository<People, Long> {

    fun findByFirstName(firstName: String): List<People>

    fun findByLastName(lastName: String): List<People>

    fun findByFirstNameAndLastName(firstName: String, lastName: String): List<People>

    fun save(people: People): List<People>
}