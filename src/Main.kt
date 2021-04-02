fun main() {
    val observable = NewsLetter()
    val observer = object : IObserver {
        override fun update(data : String) {
            println("Brand News: $data")
        }
    }
    observable.add(observer)

    observable.latestNewsArticleTitle = "Rajko tried to learn observer pattern"
    observable.latestNewsArticleTitle = "Rajko succeeded to learn observer pattern"

    observable.remove(observer)

    observable.latestNewsArticleTitle = "This news no one gonna publish"
}