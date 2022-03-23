package com.coding.test.section1.exam4

/*
설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

3
good
Time
Big

출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
doog
emiT
giB


 */
class Exam04 {
    fun solution(input: List<String>): List<String> {
        return input.map {
            it.reversed()
        }
    }

//    fun solution2(input: List<String>): List<String> {
//        val result = mutableListOf<String>()
//        val sb = StringBuilder()
//        for (x in input) {
//            val charArr = x.toCharArray()
//            for (i in charArr.size - 1 downTo 0) {
//                sb.append(charArr[i])
//            }
//            result.add(sb.toString())
//            sb.setLength(0) // initialize
//        }
//        return result
//    }

    // 강의한 solution (문자열 직접 뒤집기)
//    fun solution3(input: List<String>): List<String> {
//        val result = mutableListOf<String>()
//        for (x in input) {
//            val charArr = x.toCharArray()
//            var lt = 0
//            var rt = x.length - 1
//            while (lt < rt) {
//                val tmp = charArr[lt]
//                charArr[lt] = charArr[rt]
//                charArr[rt] = tmp
//                lt++
//                rt--
//            }
//            result.add(String(charArr))
//        }
//        return result
//    }
}

fun main() {
    val exam04 = Exam04()
    val count = readln().toInt()
    val inputArr = mutableListOf<String>()
    for (i in 0 until count) {
        val input = readln()
        inputArr.add(input)
    }
    val results = exam04.solution(inputArr)
    results.forEach { println(it) }
}