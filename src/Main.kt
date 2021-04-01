fun main() {
    val foodOrder = FoodOrder.Builder()
        .bread("white bread")
        .meat("bacon")
        .condiments("olive oil")
        .build()

    println(foodOrder.getOrder())
}