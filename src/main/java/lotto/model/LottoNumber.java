package lotto.model;

import java.util.HashMap;
import java.util.Map;

public class LottoNumber {
    private static final Map<Integer, LottoNumber> NUMBERS = new HashMap<>();
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;

    private final int number;

    static {
        for (int number = MIN_NUMBER; number <= MAX_NUMBER; number++) {
            NUMBERS.put(number, new LottoNumber(number));
        }
    }

    private LottoNumber(int number) {
        checkNumber(number);
        this.number = number;
    }

    public static LottoNumber of(int number) {
        return NUMBERS.get(number);
    }

    private void checkNumber(int number) {
        if (number < MIN_NUMBER || MAX_NUMBER < number) {
            throw new IllegalArgumentException("당첨번호는 1부터 45까지의 숫자입니다.");
        }
    }

    public boolean isSame(LottoNumber lottoNumber) {
        return number == lottoNumber.number;
    }

    @Override
    public String toString() {
        return number + "";
    }

    public boolean equals(Object obj) {
        if(obj instanceof LottoNumber) {
            LottoNumber lottoNumber = (LottoNumber) obj;
            if(obj.equals(number)) {
                return true;
            }
        }
        return false;
    }
}
