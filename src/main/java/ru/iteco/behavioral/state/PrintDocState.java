package ru.iteco.behavioral.state;

import java.util.Scanner;

public class PrintDocState implements State{
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
        copyMashine.setState(this);
    }

    @Override
    public void printDoc(CopyMashine copyMashine) {
        System.out.println("Документ распечатан! Хотите еще что-нибудь распечатать? y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();
        if ("y".equals(answer)) {
            copyMashine.setState(new SelectSourceState());
        } else {
            copyMashine.setState(new GetCasheState());
        }
    }

    @Override
    public void getCashe(CopyMashine copyMashine) {
        System.out.println("Получите сдачу");
        copyMashine.setState(new InsertMoneyState());
    }
}
