class ScrollDecorator(widget: Widget) : Decorator(widget) {
    override fun draw() {
        super.draw()
        println("  ScrollDecorator")
    }
}