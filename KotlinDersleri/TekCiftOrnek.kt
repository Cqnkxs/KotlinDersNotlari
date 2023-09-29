import java.util.Scanner
fun main(){
    val girdi = Scanner(System.`in`)
    while(true){
        println("Sayı giriniz")
        val sayi = girdi.nextInt()
        val sonuc = sayi % 2
        if(sonuc==0){
            println("Sayı çift")
        }
        else
            println("Sayı tek")

        println("Çıkmak için (1) - Devam etmek için diğer sayılar")
        val cikis = girdi.nextInt()
        if(cikis == 1)
        {
            println("Çıkış yapıldı")
            break
        }
    }
}