package raka

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("raka")
                .mainClass(Application.javaClass)
                .start()
    }
}