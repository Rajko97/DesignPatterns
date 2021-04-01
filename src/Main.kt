const val noCurrencyCode = "Currency Code Available"

fun main() {
    val currencyFactory = CurrencyFactory()

    val greece = currencyFactory.make(Country.Greece)
    val spain = currencyFactory.make(Country.Spain)
    val unitedStates = currencyFactory.make(Country.UnitedStates)
    val unitedKingdom = currencyFactory.make(Country.UK)

    println(greece?.code() ?: noCurrencyCode)
    println(spain?.code() ?: noCurrencyCode)
    println(unitedStates?.code() ?: noCurrencyCode)
    println(unitedKingdom?.code() ?: noCurrencyCode)
}