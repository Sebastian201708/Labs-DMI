package collections



fun main() {

    val mutableList = mutableListOf("Sergio", "Sebas", "Salome")


    val immutableList = mutableList.toList()


    println("Lista de compañeros:")
    for (companion in immutableList) {
        println(companion)
    }
}
