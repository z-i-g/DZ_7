package ru.iteco.behavioral.state;

public class PrintDocState implements State{
    @Override
    public void insertMoney(CopyMashine copyMashine) {
        System.out.println("Вы уже внесли деньги!");
    }

    @Override
    public void selectSource(CopyMashine copyMashine) {

    }

    @Override
    public void selectDoc(CopyMashine copyMashine) {

    }

    @Override
    public void printDoc(CopyMashine copyMashine) {
        System.out.println("Документ распечатан!");
    }

    @Override
    public void getCashe(CopyMashine copyMashine) {
        System.out.println("Получите сдачу");
        copyMashine.setState(new InsertMoneyState());
    }
}
