package lotto;

import lotto.controller.LottoManualController;
import lotto.model.LottoModel;

import java.util.ArrayList;
import java.util.List;

public class LottoManualMain {
    public static void main(String[] args) {
        List<LottoModel> lottos = new ArrayList<>();
        LottoManualController controller = new LottoManualController();
        controller.start(lottos);
    }
}