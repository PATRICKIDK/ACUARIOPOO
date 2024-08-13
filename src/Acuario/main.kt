package acuario

fun construirAcuario() {
    // Crear un acuario rectangular
    val acuario1 = Acuario()
    println("Acuario 1 (default dimensions):")
    acuario1.imprimirTamano()

    // Establecer el alto a 60 cm y volver a imprimir
    acuario1.alto = 60
    println("\nAcuario 1 (after changing height to 60 cm):")
    acuario1.imprimirTamano()

    // Crear un acuario con parámetros personalizados
    val acuario2 = Acuario(ancho = 25)
    println("\nAcuario 2 (with custom width):")
    acuario2.imprimirTamano()

    val acuario3 = Acuario(alto = 35, largo = 110)
    println("\nAcuario 3 (with custom height and length):")
    acuario3.imprimirTamano()

    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    println("\nAcuario 4 (fully customized):")
    acuario4.imprimirTamano()

    // Crear un acuario usando el constructor secundario
    val acuario5 = Acuario(numeroDePeces = 29)
    println("\nAcuario 5 (using secondary constructor):")
    acuario5.imprimirTamano()

    // Establecer el volumen a 70 litros y recalcular las dimensiones
    val acuario6 = Acuario(numeroDePeces = 29)
    println("\nAcuario 6 (initial dimensions):")
    acuario6.imprimirTamano()
    acuario6.volumen = 70
    println("\nAcuario 6 (after setting volume to 70 liters):")
    acuario6.imprimirTamano()

    // Crear un tanque cilíndrico
    val miTorre = TanqueTorre(diametro = 25, alto = 45)
    println("\nTanque Torre (cylindrical tank):")
    miTorre.imprimirTamano()
}

fun main() {
    construirAcuario()
}
