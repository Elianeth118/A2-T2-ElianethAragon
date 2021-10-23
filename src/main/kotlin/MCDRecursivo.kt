fun main(args: Array<String>) {
    val a = 50
    val b = 120
    val mcd = maximoComunDivisor(a, b)
    System.out.printf("El MCD de %d y %d es %d\n", a, b, mcd)
    val mcdRecursivo = maximoComunDivisorRecursivo(a, b)
    System.out.printf("El MCD de %d y %d (con recursividad) es %d\n", a, b, mcdRecursivo)
}
fun maximoComunDivisor(a: Int, b: Int): Int {
    var a = a
    var b = b
    var temporal: Int //Para no perder b
    while (b != 0) {
        temporal = b
        b = a % b
        a = temporal
    }
    return a
}
fun maximoComunDivisorRecursivo(a: Int, b: Int): Int {
    return if (b == 0) a
    else
        maximoComunDivisorRecursivo(b, a % b)
}