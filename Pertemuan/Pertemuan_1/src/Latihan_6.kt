fun main() {
    val greet = { name: String -> greting(name) }
    greet("Kotlin")
}

fun greting(name: String) {
    println("Halo $name!")
}