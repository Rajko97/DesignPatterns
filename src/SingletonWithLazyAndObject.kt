
//1- create private constructor
class SingletonWithLazyAndObject private constructor() {
    fun doSomething() {
        println("KotlinSingleton works well!")
    }

    init {
        println("Initializing Singleton ")
    }

    //3- static method to get instance of class
    //4- Globally accessible object reference
    //Holder object & lazy instance is used to ensure only one instance of Singleton is created.
    private object Holder {
        val INSTANCE = SingletonWithLazyAndObject()
    }

    //2- static reference of its class
    companion object {
        val instance: SingletonWithLazyAndObject by lazy { Holder.INSTANCE }
    }
}