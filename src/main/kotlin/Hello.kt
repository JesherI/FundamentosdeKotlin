fun main(){
    println("hello world!")

    // Variables
    // val para declarar constantes (solo lectura)
    // var para variables

    val pi = 3.14
    var x = 24

    println(pi)
    x = 24
    x = x + 1
    x++
    x--
    x += 10
    x -= 2
    x *= 2
    x /= 5

    println(x)

    val firstName = "Jesher"
    val lastName:String = "Mendieta"
    val fullName = firstName + " " + lastName
    println(fullName)

    val age: Int = 18
    val height:Double = 1.75

    var stars = 10

    // String Templates
    // $ para imprimir variables
    // ${} para procesar antes de imprimir

    println("I'm $age years old")
    println("I'm $height tall")
    println("Obtendré ${ stars+10 } estrellas")

}