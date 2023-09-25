fun main() {
    val timesToRepeat = 3
    val border = "=-+"
    val age = 17
    val days = 365
    var name = "Aljon Mariano"
    
    printBorder(border,timesToRepeat)
    print("Happy Birthday! ${name}\n") 
    printBorder(border,timesToRepeat)
    print("I am ${age * days} \n")
    print("${age * days} is the best age to learn Kotlin! \n")
    println("${name} is already ${age * days} days old!")
	println("")
  
  //Let's print a cake
 	println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    
}

fun printBorder(border:String,timesToRepeat:Int){
    
    repeat(timesToRepeat){
        print(border)
    }
    println("")
}