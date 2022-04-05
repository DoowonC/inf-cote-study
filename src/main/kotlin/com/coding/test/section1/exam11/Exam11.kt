package com.coding.test.section1.exam11

import java.lang.StringBuilder

/*
설명
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
KKHSSSSSSSE

출력
첫 줄에 압축된 문자열을 출력한다.
K2HS7E



 */
class Exam11 {
    fun solution(input: String): String {
        val sb = StringBuilder()
        var cnt = 1
        val lastIdx = input.length - 1

        for (i in 0..lastIdx) {
            if (i == lastIdx) {
                if (cnt > 1) sb.append(cnt)
                else sb.append(input[lastIdx])
                break
            }

            if (input[i] == input[i + 1]) {
                cnt++
            } else {
                sb.append(input[i])
                if (cnt > 1) sb.append(cnt)
                cnt = 1
            }
        }

        return sb.toString()
    }
}

fun main() {
    val exam11 = Exam11()
    val input = readln()

    val result: String = exam11.solution(input.uppercase())
    println(result)
}