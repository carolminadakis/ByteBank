fun main() {
    println("Bem vindo ao Bytebank")

    val ana = Funcionario(nome = "Ana", cpf = "256.468.435-55", salario = 2500.0)

    println(ana.nome)
    println(ana.cpf)
    println(ana.salario)
    println("bonificação ${ana.bonificacao}")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")
}



