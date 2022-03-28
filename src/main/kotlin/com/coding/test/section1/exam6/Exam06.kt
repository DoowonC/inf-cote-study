package com.coding.test.section1.exam6

import java.lang.StringBuilder

/*

설명
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
ksekkset

출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.
kset

--> 문자열을 순회하며 String의 indexOf 메소드를 통해서 특정 문자가 발견된 위치를 탐색

 */
class Exam06 {
    fun solution(input: String): String {
        val sb = StringBuilder()
        for (i in input.indices) {
            val indexOfChar = input[i]
            if (i == input.indexOf(indexOfChar)) {
                sb.append(indexOfChar)
            }
        }
        return sb.toString()
    }

//    fun solution2(input: String): String {
//        return input.map {
//            it
//        }
//            .toSet()
//            .joinToString("")
//    }
}

fun main() {
    val exam6 = Exam06()
    val input = readln()

    val result = exam6.solution(input)
    println(result)

}

