class safaristu{
//    data member
    var nambari:Int=9
//    Member functio
    fun square():Int{
        return nambari*nambari
    }
}

fun main(args: Array<String>) {
//    instance of an object
    val myobj=safaristu()
    println("the square of is ${myobj.square()}")
    val myob=saf()
    println("${myob.addition()}")
}

class  saf{
    var num1:Int=2
    var num2:Int=4
    fun addition():Int{
        return num1+num2
    }

}
