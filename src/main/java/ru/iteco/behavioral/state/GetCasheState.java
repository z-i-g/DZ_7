package ru.iteco.behavioral.state;

public class GetCasheState implements State{
    @Override
    public void insertMoney(CopyMashine copyMashine) {
        System.out.println("Получите сдачу!");
    }

    @Override
    public void selectSource(CopyMashine copyMashine) {
        System.out.println("Получите сдачу!");
    }

    @Override
    public void selectDoc(CopyMashine copyMashine) {
        System.out.println("Получите сдачу!");
    }

    @Override
    public void printDoc(CopyMashine copyMashine) {
        System.out.println("Получите сдачу!");
    }

    @Override
    public void getCashe(CopyMashine copyMashine) {
        System.out.println("Получите сдачу!");
        copyMashine.setState(new InsertMoneyState());
    }
}
