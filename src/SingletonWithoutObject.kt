//1- create private constructor
class SingletonWithoutObject private constructor() {
    fun doSomething() {
        println("Singleton Without Object works well!")
    }

    companion object {
        //2- static reference of its class
        private var instance: SingletonWithoutObject? = null

        //3- static method to get instance of class
        //4- Globally accessible object reference
        fun getInstance(): SingletonWithoutObject? {
            if (instance == null) instance =
                SingletonWithoutObject()
            return instance
        }

        //3- static method to get instance of class
        //4- Globally accessible object reference
        //5- Consistency across multiple threads
        val safeInstance: SingletonWithoutObject?
            get() {
                if (instance == null) {
                    synchronized(SingletonWithoutObject::class.java) {
                        if (instance == null) {
                            instance = SingletonWithoutObject()
                        }
                    }
                }
                return instance
            }

        //3- static method to get instance of class
        //4- Globally accessible object reference
        //5- Consistency across multiple threads using Synchronized Annotation
        @Synchronized
        private fun createInstance() {
            if (instance == null) {
                instance = SingletonWithoutObject()
            }
        }
    }
    init {
        println("Initializing singleton without object keyword")
    }
}