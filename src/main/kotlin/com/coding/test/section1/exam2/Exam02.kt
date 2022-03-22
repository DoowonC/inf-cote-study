package com.coding.test.section1.exam2

import java.lang.StringBuilder
import java.util.*

/*
설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.
StuDY

출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
sTUdy


 */

class Exam02 {

    fun solution(input: String): String {
        val chars = input.toCharArray()
        val sb = StringBuilder()
        chars.forEach { c -> 
            sb.append(convertCase(c))
        }
        return sb.toString()
    }
    
    private fun convertCase(c: Char): Char {
        return if(c.isLowerCase()) {
            c.uppercaseChar()
        } else c.lowercaseChar()
    }
}


fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()

    val exam02 = Exam02()
    val result = exam02.solution(input)
    println(result)
}