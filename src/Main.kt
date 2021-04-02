fun main() {
    val widget: Widget = BorderDecorator(BorderDecorator(ScrollDecorator(TextField(80, 24))))
    widget.draw()
}