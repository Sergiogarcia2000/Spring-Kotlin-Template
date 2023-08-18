package com.backend.template.models

import jakarta.persistence.*

@Entity
@Table(name = "Users")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?=null,

    @Column(name = "name")
    val name: String? = null,

    @Column(name = "surname")
    val description: String? = null
)