class TextField(private val width: Int, private val height: Int) : Widget {
    override fun draw() {
        println("TextField: $width, $height")
    }
}