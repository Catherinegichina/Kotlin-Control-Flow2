fun main(){
    println(isEven(20))
    println(isEven(67))
    println(Digit("banana"))
    println(longNames(arrayOf("mary","adama","apple")))
    var product=Product("groceries","tomato",2.0,100.00)
    println(product.buyer())


}
data class Product(var category:String,var name:String,var weight:Double,var price:Double){

    fun buyer(){
        var hygieneList = mutableListOf("toothpaste")
        var groceriesList = mutableListOf("watermelon")
        var otherList = mutableListOf<String>()

        when (category) {
            "groceries" -> println(groceriesList.plus(name))
            "hygiene" -> println(hygieneList.plus(name))
            "other" -> println(otherList.plus(name))
        }
    }
}




fun isEven(n:Int,):Boolean{

    return n%2==0
}
fun Digit(name:String):String{
    var names=""
    for (names in name){
        if(name.indexOf(names)%2==0){
            print(names)
        }
    }
    return "$names"
}

fun longNames(names:Array<String>):MutableList<String> {
    var longNamesList = mutableListOf<String>()
    for (name in names) {
        if (name.length % 2 == 0) {
            longNamesList.add(name)
        }
    }
    return longNamesList
}

