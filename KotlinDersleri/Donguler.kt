fun main(){

    for(i in 3..5){// 3, 4, 5
        println(i)
    }

    var baslangic = 10
    var bitis = 20
    var artis = 5

    for (a in baslangic..bitis step artis){
        println("a : $a")
    }

    for (b in 20 downTo 10 step 2){ // geriye doğru ikişer ikişer
        println("b : $b")
    }

    for (c in 1 until 5){ // son rakamı dahil etmeden
        println("c : $c")
    }

    var sayac = 1
    while (sayac < 4){
        println("sayac : $sayac")
        sayac+=1
    }
}