package com.blikeng.kotlinServer.entities

import jakarta.persistence.*

@Entity
class Role (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long,

        @Column(nullable = false, unique = true)
        val name: String,

        @OneToMany(mappedBy = "role")
        val users: Set<User> = emptySet()
)