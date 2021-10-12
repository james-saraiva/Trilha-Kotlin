package digitalinnovationone

class Pessoa {
    var nome: String = "James"
    var cpf: String = "123.456.789.10"
    private set //Priva qualquer mudança de dados enquanto o código é executado apenas para a classe pessoa

//    inner class Endereco{
//        var tipoend: String = "rua" //Esta é uma classe interna da classe Pessoa
//    }
}

fun main(){
    val pessoa = Pessoa()
    println(pessoa.nome)
    println(pessoa.cpf)

//    james.cpf = "1234564" //não pode ser executado pois está tentando modificar um dado de um atributo da classe pessoa
//    println(james.Endereco().tipoend) //caminho para acessar um atributo de uma classe interna
}