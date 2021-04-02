fun main() {
    val translationManager = TranslationManager()
    translationManager.translate("Some text", Language.English, Language.Italian)
    translationManager.translate("Some text", Language.English, Language.French)
}