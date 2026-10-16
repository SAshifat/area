fun main() {
    val name = arrayOf("valvo", "BMW", "Ford", "Mazda", "Opel")
    println(name[2])

    name[2] = "vvv"
    println(name[2])

    println(name.size)

    if("valvo" in name) {
        println("i`t is true")
    }
    else{
        println("i`t is false")
    }
}