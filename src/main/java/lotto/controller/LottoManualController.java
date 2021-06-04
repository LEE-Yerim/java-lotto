package lotto.controller;

import lotto.model.*;
import lotto.view.LottoManualInputView;
import lotto.view.LottoManualOutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoManualController {
    LottoManualInputView inputView = new LottoManualInputView();
    LottoManualOutputView outputView = new LottoManualOutputView();
    AutoLotto autoLotto = new AutoLotto();
    ManualLotto manualLotto = new ManualLotto();

    public void start() {
        LottoPrice lottoPrice = new LottoPrice(inputView.inputPrice());
        int quantity = lottoPrice.calculateLottoQuantity();
        int manualQuantity = inputView.inputManualLottoQuantity();
        int autoQuantity = quantity - manualQuantity;

        List<String> manualNumbers = inputView.inputManualLottoNumbers(manualQuantity);

        Lottos lottos = createLottos(autoQuantity, manualQuantity, manualNumbers);
        outputView.printLottos(manualQuantity, autoQuantity, lottos.getLottos());

        Lotto winningNumbers = new Lotto(convertWinningNumbersToInt(inputView.inputWinningNumbers()));
        int bonusNumber = convertBonusNumberToInt(inputView.inputBonusNumber());
        WinningLotto winningLotto = new WinningLotto(winningNumbers, bonusNumber);

        lottos.countWinningResults(winningLotto.getWinningNumbers(), winningLotto.getBonusNumber());
        outputView.outputWinningResults(lottos.getWinningResults());
        outputView.outputEarningRate(lottos.calculateEarningRate(lottoPrice.getPrice()));
    }

    private Lottos createLottos(int autoQuantity, int manualQuantity, List<String> manualNumbers) {
        List<Lotto> lottos = new ArrayList<>();
        lottos.addAll(autoLotto.createLottos(autoQuantity));
        lottos.addAll(manualLotto.createLottos(manualQuantity, manualNumbers));
        return new Lottos(lottos);
    }
    private List<Integer> convertWinningNumbersToInt(String winningStringNumbers) {
        List<Integer> winningNumbers = new ArrayList<>();
        String[] splitWinningNumbers = winningStringNumbers.split(", ");
        for (int i = 0; i < splitWinningNumbers.length; i++) {
            int number = Integer.parseInt(splitWinningNumbers[i]);
            winningNumbers.add(number);
        }
        return winningNumbers;
    }

    private int convertBonusNumberToInt(String bonusStringNumber) {
        int bonusNumber = Integer.parseInt(bonusStringNumber);
        return bonusNumber;
    }
}
