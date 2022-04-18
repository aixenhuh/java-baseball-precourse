package baseball.service;

import baseball.domain.Baseball;
import baseball.exception.CanNotInputHangleException;
import camp.nextstep.edu.missionutils.Console;

import java.util.Iterator;
import java.util.Set;

public class BaseballService {

    public static final int STRIKE_MAX_COUNT = 3;

    static Baseball baseball = new Baseball(0, 0);

    public void hitBaseball(Set<Integer> set) {
        while(baseball.getStrike() != STRIKE_MAX_COUNT) {
            baseball.setStrike(0);
            baseball.setBall(0);
            matchGame(set, inputNumber());
        }
    }

    public boolean playAgain() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        if(Console.readLine().equals("1")) {
            baseball.setBall(0);
            baseball.setStrike(0);
            return true;
        }
        return false;
    }

    public static String[] inputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        return checkInputValue(Console.readLine()).split("");
    }

    private static String checkInputValue(String input) {
        if(input.trim().length() != 3) throw new IllegalArgumentException();
        if(!isNumber(input.trim())) throw new CanNotInputHangleException();
        return input;
    }

    static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static void checkBallStrike() {
        int ball = baseball.getBall();
        int strike = baseball.getStrike();
        if(baseball.getBall() != 0) System.out.println(ball + "볼");
        if(strike != 0) System.out.println(strike + "스트라이크");
        if(ball != 0 && strike != 0) System.out.println(ball +"볼 " + strike + "스트라이크");
        if(strike == 0 && ball == 0) System.out.println("낫싱");
    }

    public static void matchGame(Set<Integer> randomArr, String[] inputArr) {
        BaseballService baseballService = new BaseballService();
        Iterator<Integer> iterator = randomArr.iterator();
        int idx = 0;
        while(iterator.hasNext()) {
            String s = iterator.next().toString();
            baseballService.getStrike(s, idx, inputArr);
            baseballService.getBall(s, idx, inputArr);
            idx++;
        }
        baseballService.checkBallStrike();
    }

    public static void getStrike(String random, int idx, String[] inputArr) {
        for(int i = 0; i < inputArr.length; i++) {
            String input = inputArr[i];
            isStrike(input, random, i, idx);
        }
    }

    public static void getBall(String random, int idx, String[] inputArr) {
        for(int i = 0; i < inputArr.length; i++) {
            String input = inputArr[i];
            isBall(input, random, i, idx);
        }
    }

    private static void isStrike(String input, String random, int i, int idx) {
        if(input.equals(random) && i == idx) baseball.addStrike();
    }

    private static void isBall(String input, String random, int i, int idx) {
        if(input.equals(random) && i != idx) baseball.addBall();
    }

}
