fun main() {
    var person=Human("Serah",20,42)
    person.eat(2)
    person.increment(2)
    println(person.weight)
    person.speak("I love Kortlin")
    person.birthday()
    println(person.age)


    var user=People("Gubo","Diba","gubodibawario@gmail.com","074765877","fhr457678j")
    println(user.email)
    println(user.firstname)


}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
    }
    fun increment(increment:Int){
        weight+=increment
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
    }

}
data class People(var firstname:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)

