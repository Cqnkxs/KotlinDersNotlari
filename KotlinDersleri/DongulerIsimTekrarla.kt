import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)

    println("İsim giriniz")

    val isim = girdi.next()

    println("Tekrar sayısını giriniz")

    val tekrar = girdi.nextInt()

    for (a in 1..tekrar){
        println("$a. $isim")
    }
}