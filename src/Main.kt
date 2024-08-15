fun main() {
    var energiaEletrica = 0;
    var gasNatural = 0;
    val inputEnergia = readln().toInt()
    val fatorEmissaoEletricidade = 0.475
    val consumoEletricidade = 100
    val fatorEmissaoGasNatural = 2.0
    val consumoGasNatural = 50
    val inputConsumo = readln().toDouble()


    println("Qual o seu tipo de Energia? $inputEnergia")
    println("1 - ${TiposEnergia.eletricidade} | 2 - ${TiposEnergia.gasNatural}")

    println("Quanto é o seu consumo? $inputConsumo")

    if (inputEnergia == 1) {
        val totalPegadasCarborno = consumoEletricidade * fatorEmissaoEletricidade
        println("A quantidade de pegadas de CO² é igual a: $totalPegadasCarborno KG Co²")

    }

    if(inputEnergia == 2) {
        val totalPegadasCarborno = consumoGasNatural * fatorEmissaoGasNatural
        println("A quantidade de pegadas de CO² é igual a: $totalPegadasCarborno KG Co²")
    }














}

