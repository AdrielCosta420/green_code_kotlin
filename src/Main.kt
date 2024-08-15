fun main() {



    val consumoEletricidade = 100
    val consumoGasNatural = 50


    println("Qual o seu tipo de Energia? ")
    println("1 - ${TiposEnergia.eletricidade} | 2 - ${TiposEnergia.gasNatural}")
    val inputEnergia = readln().toInt()

    println("Quanto é o seu consumo?")
    val inputConsumo = readln().toDouble()

    val fatorEmissaoEletricidade = 0.475
    val fatorEmissaoGasNatural = 2.0
    var totalPegadasCarborno = 0.0

    if (inputEnergia == 1) {
        totalPegadasCarborno = consumoEletricidade * fatorEmissaoEletricidade

    } else if(inputEnergia == 2) {
         totalPegadasCarborno = consumoGasNatural * fatorEmissaoGasNatural

    } else {
        println("Tipo de Energia inválido.")
    }
    println("A quantidade de pegadas de CO² é igual a: $totalPegadasCarborno KG Co²")













}

