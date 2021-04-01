class CurrencyFactory() {
    fun make(country: Country): ICurrency? {
        return when (country) {
            Country.Spain, Country.Greece -> Euro()
            Country.UnitedStates -> UnitedStatesDollar()
            else -> null
        }
    }
}