package com.blikeng.kotlinServer.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.SequenceGenerator

@Entity
class Person (
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
        @SequenceGenerator(
                name = "id_generator",
                allocationSize = 1
        )
        @Column(name = "id")
        val id: Long,

        @Column(name = "firstName")
        val firstName: String,

        @Column(name = "lastName")
        val lastName: String,

        @Column(name = "age")
        val age: Int
)