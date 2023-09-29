import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)

    println("Dikdörtgenin Alanı (1)")
    println("Çemberin Alanı (2)")

    val secim = girdi.nextInt()
    println("Seçiminiz : $secim")

    if(secim==1){
        println("Kısa kenar giriniz")
        val k_kenar = girdi.nextInt()
        println("Uzun kenar giriniz")
        val u_kenar = girdi.nextInt()

        val d_alan = u_kenar * k_kenar

        println("Dikdörtgenin Alanı : $d_alan")
    }
    else if(secim==2){
        println("Yarıçap giriniz")
        val y_cap = girdi.nextInt()

        val c_alan = 3.14 * y_cap * y_cap

        println("Çemberin Alanı : $c_alan")
    }
    else
        println("Hatalı Seçim!")


}