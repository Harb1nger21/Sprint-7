package ru.sber.springdata.entity

import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Address(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val country: String,
    val city: String
) {
    override fun toString(): String {
        return "$country, $city"
    }
}
