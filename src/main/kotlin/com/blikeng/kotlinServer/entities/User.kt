package com.blikeng.kotlinServer.entities

import jakarta.persistence.*

@Entity
class User (
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
        @SequenceGenerator(
                name = "user_id_generator",
                allocationSize = 1
        )
        val id: Long,

        @Column(name = "username")
        val username: String,

        @Column(name = "password")
        val password: String,

        @ManyToOne
        @JoinColumn(name = "role_id", nullable = false)
        val role: Role
)