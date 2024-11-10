package private.jeff.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommonServerApplication

fun main(args: Array<String>) {
	runApplication<CommonServerApplication>(*args)
}
