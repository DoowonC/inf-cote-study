package com.coding.test.section2.exam1

/*
설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
6
7 3 9 5 6 12

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
7 9 6 12



 */

class Exam01 {

    fun solution(numbers: IntArray): List<Int> {
        val resultList = mutableListOf<Int>()
        resultList.add(numbers[0])
        for (i in 1 until numbers.size) {
            if (numbers[i] > numbers[i - 1]) resultList.add(numbers[i])
        }
        return resultList
    }
}

fun main() {
    val exam01 = Exam01()
    val cnt = readln().toInt()
    val numbers = IntArray(cnt)

    for (i in 0 until cnt) {
        numbers[i] = readln().toInt()
    }
    val result = exam01.solution(numbers)

    println(result.joinToString())

}