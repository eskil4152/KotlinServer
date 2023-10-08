package com.blikeng.kotlinServer.controllers;

import com.blikeng.kotlinServer.entities.Person
import com.blikeng.kotlinServer.services.PeopleService
import jakarta.websocket.server.PathParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/people")
class PeopleController(@Autowired private val peopleService: PeopleService) {

    @GetMapping("/all")
    fun findAll(@PathParam("page") page: Int): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(peopleService.getAllPeople(page).toList())
    }

    @GetMapping("/first")
    fun findByFirstName(@RequestBody firstName: String): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(peopleService.getPeopleByFirstName(firstName))
    }

    @GetMapping("/last")
    fun findByLastName(@RequestBody lastName: String): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(peopleService.getPeopleByLastName(lastName))
    }

    @GetMapping("/full")
    fun getByFullName(@RequestBody firstName: String, lastName: String): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(peopleService.getPersonByFullName(firstName, lastName))
    }
}
