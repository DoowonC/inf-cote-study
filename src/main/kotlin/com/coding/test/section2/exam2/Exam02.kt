package com.coding.test.section2.exam2

/*
설명
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
8
130 135 148 140 145 150 150 153

출력
선생님이 볼 수 있는 최대학생수를 출력한다.
5


 */
class Exam02 {
    fun solution(studentsLengthList: IntArray): Int {
        var cnt = 0
        var tallest = studentsLengthList[0]
        studentsLengthList.forEachIndexed { index, i ->
            if (index == 0) cnt++

            if (studentsLengthList[index] > tallest) {
                tallest = studentsLengthList[index]
                cnt++
            }
        }

        return cnt
    }
}

fun main() {
    val exam02 = Exam02()

    val cnt = readln().toInt()
    val studentsLengthList = IntArray(cnt)
    for (i in 0 until cnt) {
        studentsLengthList[i] = readln().toInt()
    }

    val visibleCnt = exam02.solution(studentsLengthList)
    println(visibleCnt)

}