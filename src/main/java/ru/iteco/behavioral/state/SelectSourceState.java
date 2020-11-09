package ru.iteco.behavioral.state;

public class SelectSourceState implements State{
    @Override
    public void insertMoney(CopyMashine copyMashine) {
        System.out.println("Вы уже внесли деньги!");
    }

    @Override
    public void selectSource(CopyMashine copyMashine) {
        System.out.println("Источник выбран");
        copyMashine.setState(new SelectDocState());
    }

    @Override
    public void selectDoc(CopyMashine copyMashine) {
        System.out.println("Выберите источник!");
    }

    @Override
    public void printDoc(CopyMashine copyMashine) {
        System.out.println("Выберите источник!");
    }

    @Override
    public void getCashe(CopyMashine copyMashine) {
        System.out.println("Получите сдачу");
        copyMashine.setState(new InsertMoneyState());
    }
}
