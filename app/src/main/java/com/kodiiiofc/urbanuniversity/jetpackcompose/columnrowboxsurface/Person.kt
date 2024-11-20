package com.kodiiiofc.urbanuniversity.jetpackcompose.columnrowboxsurface

data class Person(val name: String, var salary: Int, var phone: String = getRandomPhoneNumber()) {

    companion object {
        private fun getRandomPhoneNumber(): String {
            return "+79" + (100000000..999999999).random()
        }

        val personList = listOf(
            Person("Иван", 23000),
            Person("Петр", 13000),
            Person("Анна", 45000),
            Person("Дмитрий", 37000),
            Person("Яна", 87000),
            Person("Гриша", 12000),
            Person("Игорь", 11000),
            Person("Алексей", 19000),
            )
    }

}
