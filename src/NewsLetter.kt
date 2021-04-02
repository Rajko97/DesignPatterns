class NewsLetter : IObservable {
    override val observers: ArrayList<IObserver> = ArrayList()
    var latestNewsArticleTitle = ""
        set(value) {
            field = value
            sendUpdateEvent(value)
        }
}