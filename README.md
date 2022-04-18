# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

##MVC 패턴
* MVC 패턴으로 구현하려고 노력했습니다.
###Controller
* playGame : 게임 실행 함수입니다.

* gameStart : 게임 한 세트 실행하는 함수입니다.

###Service
게임 로직을 담고 있습니다.

* matchGame : 스트라이크, 볼인지 체크하는 함수입니다.

* playAgain : 플레이어가 1를 눌렀을 경우 다시 게임 시작합니다.

* hitBaseball : 사용자가 입력한 값으로 스트라이크인지 볼인지 파악합니다.

* inputNumber : 플레이어가 입력을 도와주는 함수입니다.

* checkInputValue : 플레이어의 입력한 값을 체크하는 함수입니다.

* checkBallStrike : 현재 볼, 스트라이크 점수를 보여주는 함수입니다.

* getStrike : 스트라이크 판단 여부 함수입니다.

* getBall : 볼 판단 여부 함수입니다.


