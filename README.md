<<<<<<< HEAD
# 문자열 덧셈 계산기
## String Addition Calculator 구현 기능 목록
[ x ] 계산하고자 하는 문자열을 입력한다.\
[ x ] 빈 문자열 또는 null을 입력할 경우 0을 반환해야 한다. (e.g. "" => 0, null => 0)\
[ x ] 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (e.g. "-1,2,3")\
[ x ] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다. (e.g. "1")\
[ x ] 숫자가 아닌 문자 하나를 문자열로 입력할 경우 RuntimeException 예외가 발생해야 한다. (e.g. ",")\
[ x ] 숫자 두 개 이상을 컴마(,) 구분자 혹은 콜론(:) 구분자로 입력할 경우 모든 숫자의 합을 반환한다. (e.g. "1,2" => 3, "1,2:3" => 6)\
[ x ] 구분자 사이에 숫자가 없다면 0으로 계산한다.\
[ x ] "//"와 "\n" 문자 사이에 커스텀 구분자를 지정할 수 있다. (e.g. "//;\n1;2;3" => 6) \
[   ] "//"와 "\n" 문자 사이에 커스텀 구분자와 기존 컴마(,) 구분자 혹은 콜론(:) 구분자를 혼용할 수 있다. (e.g. "//;\n1;2,3" => 6)

# 로또 자동
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## Lotto Auto 구현 기능 목록
[ x ] 사용자로부터 로또 구매 금액을 입력받는다.\
[ x ] 구매 금액만큼 로또 수량을 계산한다.\
[ x ] 1부터 45까지 번호를 준비한다.\
[ x ] 로또 번호는 1부터 45까지 번호를 섞은 다음 6개 번호를 순서대로 추출한다.\
[ x ] 이 과정을 로또 구매 수량만큼 반복한다.\
[ x ] 자동으로 추출된 로또 번호들을 출력한다.

[ x ] 사용자로부터 지난 주 로또 당첨번호와 보너스번호를 입력받는다.\
[ x ] 자동으로 추출된 로또 번호들과 당첨번호와 보너스번호를 비교한다.\
[ x ] 로또 한 장마다 몇 개의 번호가 당첨번호와 동일한지 비교하여 센다.\
[ x ] 동일한 번호 갯수가 3개일 경우 5등, 4개일 경우 4등, 5개일 경우 3등 혹은 2등, 6개일 경우 1등이다.\
[ x ] 동일한 번호 갯수가 5개이고 보너스번호도 가지고 있다면 2등, 그렇지 않다면 3등이다.
[ x ] 당첨 결과를 출력한다.\
[ x ] 총 수익률(당첨금액/구매금액) 을 계산하여 출력한다.

### lotto.model.LottoAutoModel 의 역할
- 1부터 45까지의 숫자를 갖고 있다.
- 1부터 45까지의 숫자를 섞어서 6개의 숫자를 자동으로 선정한다.
- 외부에서 로또 번호들을 볼 수 있다.
- 외부로부터 당첨번호와 보너스번호를 입력받으면 몇등에 당첨되었는지 반환해준다.

### lotto.view.LottoAutoInputView 의 역할
- 사용자로부터 로또구매금액을 입력받는다.
- 사용자로부터 당첨번호와 보너스번호를 입력받는다.
  
- 사용자에게 로또구매갯수를 출력해준다.
- 사용자가 구매한 로또별로 자동으로 고른 6개의 번호를 출력해준다.

- 사용자가 구매한 로또들의 당첨 결과와 총 수익률을 출력해준다.

### lotto.controller.LottoAutoController 의 역할

# 로또 수동
## Lotto Manual 구현 기능 목록
[ x ] 사용자로부터 로또 구매 금액을 입력받는다.\
[ x ] 구매 금액만큼 로또 수량을 계산한다.\
[ x ] 사용자로부터 로또 수동 구매 갯수를 입력받는다.\
[ x ] 로또 수동 갯수와 로또 자동 갯수를 계산한다.\
[ x ] 로또 수동 갯수만큼 번호들을 입력받는다.\
[ x ] 로또 자동 갯수만큼 자동으로 번호를 생성한다.\
[ x ] 로또 객체들을 생성한다.\

[ x ] 사용자로부터 지난 주 로또 당첨번호와 보너스번호를 입력받는다.\
[ x ] 로또 번호들과 당첨번호와 보너스번호를 비교한다.\
[ x ] 로또 한 장마다 몇 개의 번호가 당첨번호와 동일한지 비교하여 센다.\
[ x ] 동일한 번호 갯수가 3개일 경우 5등, 4개일 경우 4등, 5개일 경우 3등 혹은 2등, 6개일 경우 1등이다.\
[ x ] 동일한 번호 갯수가 5개이고 보너스번호도 가지고 있다면 2등, 그렇지 않다면 3등이다.
[ x ] 당첨 결과를 출력한다.\
[ x ] 총 수익률(당첨금액/구매금액) 을 계산하여 출력한다.

### lotto.model.Lotto 의 역할
- 로또 한 장 안에 사용자가 수동으로 입력하거나 자동으로 선택된 번호 6개가 저장되어 있다.
- 외부에서 로또 번호들을 볼 수 있다.
- 외부로부터 당첨번호와 보너스번호를 입력받으면 몇등에 당첨되었는지 반환해준다.

### lotto.view.LottoManualInputView 의 역할
- 사용자로부터 로또구매금액을 입력받는다.
- 사용자로부터 로또수동갯수를 입력받는다.
- 사용자로부터 로또수동번호들을 입력받는다.
- 사용자로부터 당첨번호와 보너스번호를 입력받는다.

- 사용자에게 로또 수동, 자동 구매갯수를 출력해준다.
- 사용자가 구매한 로또별로 6개의 번호를 출력해준다.

- 사용자가 구매한 로또들의 당첨 결과와 총 수익률을 출력해준다.

### lotto.controller.LottoManualController 의 역할


=======
문자열 덧셈 계산기
- [기능 구현 목록](https://github.com/LEE-Yerim/java-lotto/blob/step2/src/StringAdditionCalculator.md)
- [main](https://github.com/LEE-Yerim/java-lotto/tree/step2/src/main/java/stringadditioncalculator)
- [test](https://github.com/LEE-Yerim/java-lotto/tree/step2/src/test/java/stringadditioncalculator)

로또 자동
- [기능 구현 목록](https://github.com/LEE-Yerim/java-lotto/blob/step2/src/LottoAuto.md)
- [main](https://github.com/LEE-Yerim/java-lotto/tree/step2/src/main/java/lotto)
- [test](https://github.com/LEE-Yerim/java-lotto/tree/step2/src/test/java/lotto)

로또 수동
- [기능 구현 목록](https://github.com/LEE-Yerim/java-lotto/blob/step2/src/LottoManual.md)
- [main](https://github.com/LEE-Yerim/java-lotto/tree/step2/src/main/java/lotto)
- [test](https://github.com/LEE-Yerim/java-lotto/tree/step2/src/test/java/lotto)
>>>>>>> origin/step2
