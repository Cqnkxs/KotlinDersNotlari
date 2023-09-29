import java.util.Scanner

fun main() {
    val girdi = Scanner(System.`in`)
    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")

    val secim = girdi.nextInt()
    println("Seçiminiz : $secim")

    if (secim<=0 || secim > 4){
        println("Hatalı Secim")
    }
    else{
        println("Sayı giriniz")
        val s1 = girdi.nextDouble()
        println("Sayı giriniz")
        val s2 = girdi.nextDouble()

        var islem : Double

        if (secim == 1) {
            islem = s1 + s2
        }
        else if (secim == 2) {
            islem = s1 - s2
        }
        else if (secim == 3) {
            islem = s1 * s2
        }
        else {
            islem = s1 / s2
        }
        println("Seçilen işlemin Sonucu : $islem")
    }
}