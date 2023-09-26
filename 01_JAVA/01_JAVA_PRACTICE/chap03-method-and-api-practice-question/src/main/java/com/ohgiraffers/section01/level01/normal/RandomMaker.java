package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */
    public static String rockPaperScissors(int num1){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        return (randomNumber == 0) ? "바위" :(randomNumber == 1) ? "보" : "가위";
    }

    public static String tossCoin(int num1){
        Random random = new Random();
        int randomNumber = random.nextInt(2);

        return (randomNumber == 0) ? "앞" : "뒤";
    }
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

}
