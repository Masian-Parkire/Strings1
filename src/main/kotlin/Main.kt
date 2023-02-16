fun main(){
    placename()
println(details("Masian",21))
    println(length(""))
println(nameCheck("Masian"))


}
fun placename(){
    val place = "akirachix"
    println(place[0])
    println(place[2])
    println(place[3])

}
fun details(name :String,age:Int) : String {
val deets = " Hi, my name is $name and I am $age"
    return deets
}
fun length(text: String) :Int{
    val text = "My name is Masian and I am a girl"
return text.length
}
fun nameCheck(name:String) {
    if (name == "Masian"){
        println("That's me!") }
            else {
                println("I don't know who that is")}
}












