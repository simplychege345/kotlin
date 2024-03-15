class  staff(val name:String,val age:Int,val gender:String)

fun main(args: Array<String>) {
    val myob1=staff("john",20,"male")
    println("staff name is ${myob1.name} and staff age is ${myob1.age} and gender is ${myob1.gender}")
    val myob2=staff("worldboss",24,"male")
    println("staff name is ${myob2.name} and staff age is ${myob2.age} and gender is ${myob2.gender}")
    val myob3=staff("vybes kartel",22,"male")
    println("staff name is ${myob3.name} and staff age is ${myob3.age} and gender is ${myob3.gender}")
    val myob4=staff("skillibeng",26,"male")
    println("staff name is ${myob4.name} and staff age is ${myob4.age} and gender is ${myob4.gender}")
}