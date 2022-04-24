package racingcar.view;

import racingcar.domain.car.Car;

import java.util.ArrayList;
import java.util.List;

public class OutputView {
    public static final String RACE_RESULT = "실행결과";
    public static final String COLON = " : ";
    public static final String WINNER = "최종 우승자 : ";
    public static final String COMMA = ",";

    /**
     * 결과 출력
     */
    public void resultPrint() {
        System.out.println(RACE_RESULT);
    }

    /**
     * 각 라운드 결과 출력
     *
     * @param car 자동차
     */
    public void raceRoundResult(Car car) {
        System.out.println(car.getCarName() + COLON + car.dashPosition());
    }

    /**
     * 우승자 출력
     *
     * @param winner 우승한 자동차
     */
    public void printWinner(List<Car> winner) {
        System.out.println(WINNER + winnerComma(winner));
    }

    /**
     * 우승자들 일 경우
     *
     * @param winner 우승 자동차 목록
     * @return 우승차 목록 콤마 string
     */
    public String winnerComma(List<Car> winner) {
        List<String> list = new ArrayList<>();
        for (Car car : winner) {
            list.add(car.getCarName());
        }
        return winner.size() > 0 ? String.join(COMMA, list) : "";
    }
}
