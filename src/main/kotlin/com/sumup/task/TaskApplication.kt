package com.sumup.task

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskApplication

fun main(args: Array<String>) {
	runApplication<TaskApplication>(*args)
}
