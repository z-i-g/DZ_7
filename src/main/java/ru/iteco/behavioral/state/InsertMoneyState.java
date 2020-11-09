package ru.iteco.behavioral.state;

public class InsertMoneyState implements State{
    @Override
    public void insertMoney(CopyMashine copyMashine) {
        System.out.println("Деньги внесены!");
        copyMashine.setState(new SelectSourceState());
    }

    @Override
    public void selectSource(CopyMashine copyMashine) {
        System.out.println("Внесите деньги");
    }

    @Override
    public void selectDoc(CopyMashine copyMashine) {
        System.out.println("Внесите деньги");
    }

    @Override
    public void printDoc(CopyMashine copyMashine) {
        System.out.println("Внесите деньги");
    }

    @Override
    public void getCashe(CopyMashine copyMashine) {
        System.out.println("Получите сдачу");
        copyMashine.setState(new InsertMoneyState());
    }
}
