package com.coding.test.section1.exam10

/*
설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

teachermode e

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
1 0 1 2 1 0 1 2 2 1 0

// 문제 후기
강의에서 나온대로 앞 뒤로, 순회해서 값을 채워나가는 방법이외에는 도무지 생각이 나지 않는다.
 */

class Exam10 {
    companion object {
        private const val TEMP_MAXIMUM_VALUE = 10000
    }

    fun solution(input: String, target: Char): List<Int> {
        val charArray = input.toCharArray()
        val intArray = mutableListOf<Int>()

        var temp: Int = TEMP_MAXIMUM_VALUE
        for (i in charArray.indices) {
            if (charArray[i] == target) {
                temp = 0
            } else {
                temp++
            }
            intArray.add(temp)
        }

        temp = TEMP_MAXIMUM_VALUE
        for (i in charArray.size - 1 downTo 0) {
            if (charArray[i] == target) {
                temp = 0
            } else {
                temp++
                intArray[i] = intArray[i].coerceAtMost(temp) // Math.min(intArray[i], temp)
            }
        }
        return intArray
    }

}

fun main() {
    val exam10 = Exam10()
    val input = readln()
    val target = readln().first()

    val result = exam10.solution(input, target)
    result.forEach {
        print("$it ")
    }
}