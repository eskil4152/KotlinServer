package com.blikeng.kotlinServer.controllers;

import com.blikeng.kotlinServer.entities.People
import com.blikeng.kotlinServer.services.PeopleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import kotlin.math.log

@RestController
@RequestMapping("/api/people")
class PeopleController(@Autowired private val peopleService: PeopleService) {

    @GetMapping("/all")
    fun findAll(): ResponseEntity<List<People>> {
        return ResponseEntity.ok(peopleService.getAllPeople())
    }

    @PostMapping("/search/first")
    fun findByFirstName(@RequestBody request: FirstNameRequest): ResponseEntity<List<People>> {
        val firstName = request.firstName

        val result = peopleService.getPeopleByFirstName(firstName)

        if (result.isEmpty())
            return ResponseEntity.notFound().build()

        return ResponseEntity.ok(result)
    }

    @PostMapping("/search/last")
    fun findByLastName(@RequestBody request: LastNameRequest): ResponseEntity<List<People>> {
        val lastName = request.lastName

        val result = peopleService.getPeopleByLastName(lastName)

        if (result.isEmpty())
            return ResponseEntity.notFound().build()

        return ResponseEntity.ok(result)
    }

    @PostMapping("/search/full")
    fun getByFullName(@RequestBody request: FullNameRequest): ResponseEntity<List<People>> {
        val firstName = request.firstName
        val lastName = request.lastName

        val result = peopleService.getPersonByFullName(firstName, lastName)

        if (result.isEmpty())
            return ResponseEntity.notFound().build()

        return ResponseEntity.ok(result)
    }

    @PostMapping("/new")
    fun addNewPerson(@RequestBody people: People): ResponseEntity<List<People>> {
        val result = peopleService.addPerson(people)

        if (result.isEmpty())
            return ResponseEntity.notFound().build()

        return ResponseEntity.ok(result);
    }
}

data class FirstNameRequest(val firstName: String)
data class LastNameRequest(val lastName: String)
data class FullNameRequest(val firstName: String, val lastName: String)