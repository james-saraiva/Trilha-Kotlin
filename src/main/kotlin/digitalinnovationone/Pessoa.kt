package digitalinnovationone

class Pessoa {
    var nome: String = "James"
    var cpf: String = "123.456.789.10"
    private set //Priva qualquer mudança de dados enquanto o código é executado apenas para a classe pessoa

    constructor()

    fun pessoaInfo(){
        println("$nome e $cpf")
    }

}

fun main(){
    val pessoa = Pessoa()

    pessoa.pessoaInfo()

}