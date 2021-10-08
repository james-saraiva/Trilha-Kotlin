package digitalinnovationone

class Pessoa {
    var nome: String = "James"
    var cpf: String = "123.456.789.10"

}

fun main(){
    val james = Pessoa()

    println(james.nome)
    println(james.cpf)
}