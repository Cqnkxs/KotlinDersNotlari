fun main(){
    for(a in 1..5)
    {
        if (a==3){
            break
        }
        println("Döngü 1 : $a")
    }

    println()

    for(b in 1..5)
    {
        if (b==3){
            continue
        }
        println("Döngü 2 : $b")
    }
}