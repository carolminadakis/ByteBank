class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int

) : Funcionario(    //Os dois pontos : é o sinal de que a classe herda outra
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override val bonificacao: Double get() = salario * 0.2

}
