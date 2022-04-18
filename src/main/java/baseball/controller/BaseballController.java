package baseball.controller;

import baseball.service.BaseballService;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class BaseballController {
    public static final int INPUT_NUMBER_COUNT = 3;

    private static BaseballService baseballService = new BaseballService();

    private static void gameStart() {
        Set<Integer> set = new HashSet<>();
        while(set.size() < INPUT_NUMBER_COUNT) set.add(Randoms.pickNumberInRange(1, 9));
        baseballService.matchGame(set, baseballService.inputNumber());
        baseballService.hitBaseball(set);
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void playGame() {
        gameStart();
        while (baseballService.playAgain()) {
            gameStart();
        }
    }
}
