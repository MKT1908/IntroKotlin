package com.example.myapplication

//Definir y llamar la funcion

fun main(){
    llamarfuncion()
    println()
    parametros()
}

fun llamarfuncion() {
    birthdayGreeting()
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

//Funcion con Parametros

fun parametros() {
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting("Rex" , 2))
}
fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
