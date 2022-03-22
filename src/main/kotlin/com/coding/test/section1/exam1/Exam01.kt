package com.coding.test.section1.exam1

import java.util.*

/*
설명
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

입력
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 해당 문자의 개수를 출력한다
 */

class Exam01 {

    fun solution(str: String, c: Char): Int {
        var result = 0
        val strArr = str.toCharArray()

        strArr.forEach {
            if(it.equals(c, true)) result ++
        }
        return result
    }

}

fun main() {
    val sc = Scanner(System.`in`)
    val input1 = sc.nextLine()
    val c = sc.next().first()

    val exam1 = Exam01()
    val result = exam1.solution(input1, c)
    println(result)
    
    
//    val a = listOf(8, 5, 6, 7)
//    val reduce = a.reduce { i, acc ->
//        println("i: $i, \t acc: $acc")
//        i + acc
//    }
//    println(reduce)


}