package com.blikeng.kotlinServer

import io.github.cdimascio.dotenv.Dotenv
import org.flywaydb.core.Flyway
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.env.Environment

@SpringBootApplication
class KotlinServerApplication

fun main(args: Array<String>) {

	// Load environment variables from .env file
	val dotenv = Dotenv.configure().load()

	// Access environment variables
	println(dotenv.entries())
	val dbUsername = dotenv["DB_USERNAME"]
	val dbPassword = dotenv["DB_PASSWORD"]

	// Print values for verification
	println("DB Username: $dbUsername")
	println("DB Password: $dbPassword")

	runApplication<KotlinServerApplication>(*args)
}
