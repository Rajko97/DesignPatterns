abstract class Decorator(private val widget: Widget) : Widget {
    override fun draw() {
        widget.draw()
    }
}