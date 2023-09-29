import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)

    println("İşlenecek veri miktarını giriniz")

    var veri = girdi.nextInt()

    while (veri > 0){
        println("$veri. Veri")
        veri -= 1
    }

}