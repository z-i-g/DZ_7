package ru.iteco.behavioral.state;

public class SelectDocState implements State{
    @Override
    public void insertMoney(CopyMashine copyMashine) {
        System.out.println("Вы уже внесли деньги!");
    }

    @Override
    public void selectSource(CopyMashine copyMashine) {
        System.out.println("Источник изменен!");
        copyMashine.setState(new SelectDocState());
    }

    @Override
    public void selectDoc(CopyMashine copyMashine) {
        System.out.println("Документ выбран!");
        copyMashine.setState(new PrintDocState());
    }

    @Override
    public void printDoc(CopyMashine copyMashine) {
        System.out.println("Выберите документ для печати!");
    }

    @Override
    public void getCashe(CopyMashine copyMashine) {
        System.out.println("Получите сдачу");
        copyMashine.setState(new InsertMoneyState());
    }
}
