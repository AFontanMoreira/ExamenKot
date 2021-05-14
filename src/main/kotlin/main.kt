fun main() {

    var aleatorio: (Unit) -> Int = {  var alea=(50..250).random()

        alea
    }
    for (numero in Ej1(1,aleatorio).lista){
        println("$numero")
    }






}
