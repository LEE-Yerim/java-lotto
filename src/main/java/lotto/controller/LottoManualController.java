package lotto.controller;

import lotto.model.*;
import lotto.view.LottoManualInputView;
import lotto.view.LottoManualOutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoManualController {

    public void start() {
        LottoManualInputView inputView = new LottoManualInputView();
        LottoManualOutputView outputView = new LottoManualOutputView();
        ManualLottos manualLottos = new ManualLottos();

        LottoPrice lottoPrice = new LottoPrice(inputView.inputPrice());
        int quantity = lottoPrice.getQuantity();

        int manualQuantity = inputView.inputManualLottoQuantity();
        int autoQuantity = quantity - manualQuantity;

        List<String> manualNumbers = inputView.inputManualLottoNumbers(manualQuantity);
        Lottos lottos = new Lottos(manualLottos.setLotto(manualQuantity, autoQuantity, manualNumbers));

        outputView.printLottos(manualQuantity, autoQuantity, lottos);

        List<Integer> winningNumbers = convertWinningNumbersToInt(inputView.inputWinningNumbers());
        int bonusNumber = convertBonusNumberToInt(inputView.inputBonusNumber());
        WinningLotto winningLotto = new WinningLotto(winningNumbers, bonusNumber);

        WinningResult winningResult = new WinningResult();
        winningResult.getWinningResult(lottos, winningLotto.getWinningNumbers(), winningLotto.getBonusNumber());
        outputView.outputWinningStatistics(lottos.getEarningRate(lottos.getEarningPrice(), LottoPrice.getPrice()));
    }

    public List<Integer> convertWinningNumbersToInt(String winningStringNumbers) {
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
