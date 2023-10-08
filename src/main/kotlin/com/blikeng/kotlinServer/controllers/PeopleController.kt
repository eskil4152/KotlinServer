package com.blikeng.kotlinServer.controllers;

import com.blikeng.kotlinServer.entities.People
import com.blikeng.kotlinServer.services.PeopleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/people")
class PeopleController(@Autowired private val peopleService: PeopleService) {

    @GetMapping("/all")
    fun findAll(): ResponseEntity<List<People>> {
        return ResponseEntity.ok(peopleService.getAllPeople().toList())
    }

    @GetMapping("/search/first/{firstName}")
    fun findByFirstName(@PathVariable firstName: String): ResponseEntity<List<People>> {
        return ResponseEntity.ok(peopleService.getPeopleByFirstName(firstName))
    }

    @GetMapping("/search/last/{lastName}")
    fun findByLastName(@PathVariable lastName: String): ResponseEntity<List<People>> {
        return ResponseEntity.ok(peopleService.getPeopleByLastName(lastName))
    }

    /*@GetMapping("/search/full/{firstName}/{lastName}")
    fun getByFullName(@PathVariable firstName: String, lastName: String): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(peopleService.getPersonByFullName(firstName, lastName))
    }*/
}
