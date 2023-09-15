import com.sun.org.apache.xpath.internal.functions.FuncLast

fun main(){
    println("Hello")
    sayHello()
    sayHelloTo("Peter")
    sayHelloToFrom("Peter","New York")
    println("El doble de 25 es ${duplicate(25)}")
    val result = divide(99,15.0)
    println("El sesultado de 99 / 15 es $result")
    println(fullName("John","Travolta"))
    welcomeToMexico()
    welcomeToMexico("Spiderman")
    sayHelloToFrom("Superman", "Metropolis")
    sayHelloToFrom(city = "Namekusei", name = "Pikoro")
}

// functions without param and without return
fun sayHello(){
    println("hello")
}
// functions without params amd without return
fun sayHelloTo(name:String){
    println("Hello $name")
    println("Welcome")
}

fun sayHelloToFrom(name: String, city: String){
    println("Hello $name from $city")
}

// functions With return
// We must specify the datatype
fun duplicate(num:Int):Int{
    return num * 2
}

fun  divide(num1: Int,num2:Double):Double{
    return num1/num2
}

fun fullName(firstName: String, lastName: String):String{
    return "$firstName $lastName"
}

// functions with optional Params
fun welcomeToMexico(name:String = "Invitado"): Unit{
    println("Welcome to Mexico $name")
}