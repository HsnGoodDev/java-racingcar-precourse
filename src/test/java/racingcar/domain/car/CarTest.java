package racingcar.domain.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @ParameterizedTest
    @ValueSource(strings = {"1234", "race", "car" })
    public void 자동차_성공(String name){
        final Car testCar = Car.of(CarName.of(name));
        assertThat(testCar).isNotNull();


    }
    @ParameterizedTest
    @ValueSource(strings = {"    ", "123456", "", })
    public void 자동차_이름_유효성_체크(String name){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> CarName.of(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234", "race", "car" })
    public void 자동차_이름_체크(String name){
        String carName =  Car.of(CarName.of(name)).getCarName();
        assertThat(carName).isNotNull();

    }

    @ParameterizedTest
    @ValueSource(strings = {"test" })
    public void 자동차_위치_체크(String name){
        int position =  Car.of(CarName.of(name)).getPosition();
        assertThat(position).isZero();

    }
}
