import java.util.Scanner

fun main(args: Array<String>) {
    val scn=Scanner(System.`in`)
    var n=scn.nextInt()
    val mylist= mutableListOf<String>()
    while (n>0){

        val input=scn.next()
        mylist.add(input)
        n--
    }
    val list=mylist.map({ it.uppercase()})
    print(list.filter { it.contains("B")||it.contains("M") })}
