package cn.principle.openclose;

public class TestClass {
    public static void main(String[] args) {
        StrategyDialer strategyDialer = new StrategyDialer();
        StrategyButton strategyButton = new StrategyButton(strategyDialer,5);
        strategyButton.press();

        DigitButtonDialerAdepter digitButtonDialerAdepter = new DigitButtonDialerAdepter();
        StrategyButton adapter = new StrategyButton(digitButtonDialerAdepter,2);
        adapter.press();
    }
}
