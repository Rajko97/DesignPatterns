class BorderDecorator(widget: Widget) : Decorator(widget) {
    override fun draw() {
        super.draw()
        println("  BorderDecorator")
    }
}