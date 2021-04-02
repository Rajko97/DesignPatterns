class ItalianTranslator : Translator {
    override fun translate(text: String, textLanguage: Language) {
        println("Translate ($text) from ${textLanguage.name} to Italian")
    }
}