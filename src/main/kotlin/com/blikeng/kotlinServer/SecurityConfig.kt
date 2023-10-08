package com.blikeng.kotlinServer

/*import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain


@Configuration
class SecurityConfiguration {

    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
                .authorizeHttpRequests { authz ->
                    authz
                            .requestMatchers("**").permitAll()
                            //.requestMatchers("/api/people/**").permitAll()
                            //.requestMatchers("/hello").hasRole("ADMIN")
                            //.anyRequest().authenticated()
                }.formLogin { form ->
                    form
                            .loginPage("/login").permitAll()
                }
                .logout { logout -> logout.permitAll() }

        return http.build()
    }
}*/