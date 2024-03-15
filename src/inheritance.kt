open class mzazi{
    var dad="He likes watching football"
    var mum="she likes cooking"
    var mumcolor="light skin"
    var dadcolor="Dark skin"
}
class boy:mzazi(){
    fun mvu(){
        println("The boy is $dadcolor  $dad")

    }

}
class girl:mzazi(){
    fun msc(){
        println("The girl is $mumcolor and shr likes $mum")
    }

}

fun main(args: Array<String>) {
    val obj=boy()
    obj.mvu()


}