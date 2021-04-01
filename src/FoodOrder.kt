class FoodOrder private constructor(
    val bread: String?,
    val condiments: String?,
    val meat: String?,
    val fish: String?) {

    fun getOrder() : String {
        var res = ""
        if(bread != null) res += "Bread: $bread"
        if(condiments != null) res += "Condiments: $condiments"
        if(meat != null) res += "Meat: $meat"
        if(fish != null) res += "Fish: $fish"
        return res
    }

    data class Builder(
        var bread: String? = null,
        var condiments: String? = null,
        var meat: String? = null,
        var fish: String? = null) {

        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(bread, condiments, meat, fish)
    }
}