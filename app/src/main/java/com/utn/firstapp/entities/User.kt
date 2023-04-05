package com.utn.firstapp.entities

/*class User {
    var name: String
    var lastName: String
    var email: String
    var password: String

    constructor(name: String, lastName: String, email: String, password: String) {
        this.name = name
        this.lastName = lastName
        this.email = email
        this.password = password
    }
}*/

/*class User (
    var name: String,
    var lastName: String,
    var email: String,
    var password: String) {

    var age: Int = 0

    fun greet(): String {
        return "Hi, my name is $name $lastName"
    }

    companion object{
        const val MAX_AGE = 100                     //Investigate why const val
    }
}*/

class User (
    var name: String,
    var lastName: String,
    var email: String,
    var password: String) : Greet {

    var age: Int = 0

    override fun greet(): String {
        return "Hi, my name is $name $lastName"
    }
    companion object{
        const val MAX_AGE = 100                     //Investigate why const val
    }
}