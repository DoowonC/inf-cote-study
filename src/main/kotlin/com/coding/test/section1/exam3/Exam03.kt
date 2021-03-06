package com.coding.test.section1.exam3

import java.util.*

/*
설명
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

sample input:
it is time to study

출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
단어를 답으로 합니다.

sample output:
study


 */
class Exam03 {

    companion object {
        private const val SPACE_DELIMITER = " "
    }

    fun solution(input: String): String {
        return input
            .split(SPACE_DELIMITER)
            .reduce { acc, s ->
                if(acc.length >= s.length)
                    acc
                else s
            }


//        var initValue = Int.MIN_VALUE
//        var result = ""
//        input
//            .splitToSequence(SPACE_DELIMITER)
//            .forEach {
//                if(it.length > initValue) {
//                    initValue = it.length
//                    result = it
//                }
//            }
//
//        return result
    }
}

fun main() {
    val input = readln()

    val exam03 = Exam03()
    val result = exam03.solution(input)
    println(result)
}