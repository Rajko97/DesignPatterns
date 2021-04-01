fun main() {
    println("Testing singletons")

    SimpleSingleton.doSomething()
    SingletonWithoutObject.getInstance()?.doSomething()
    SingletonWithoutObject.safeInstance?.doSomething()
    SingletonWithLazyAndObject.instance.doSomething()
}