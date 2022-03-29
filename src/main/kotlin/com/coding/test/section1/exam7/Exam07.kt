package com.coding.test.section1.exam7

/*
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 대소문자를 구분하지 않습니다.

입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
gooG

출력
첫 번째 줄에 회문 문자열 인지의 결과를 YES 또는 NO로 출력합니다.
YES


 */
class Exam07 {

    fun solution(input: String): Boolean {
        var result = false
        val charArray = input.toCharArray()
        val checkPoint = charArray.size / 2

        var startPoint = 0
        var lastPoint = charArray.size - 1

        while (startPoint < checkPoint) {
            if (charArray[startPoint].equals(charArray[lastPoint], ignoreCase = true)) {
                result = true
            }
            startPoint++
            lastPoint--
        }
        return result
    }

    fun solution2(input: String): Boolean {
        return input.equals(input.reversed(), ignoreCase = true)
    }
}

fun main() {
    val exam07 = Exam07()
    val input = readln()
    
    val isPalindrome = exam07.solution(input)

    if (isPalindrome) println("YES")
    else println("NO")


}