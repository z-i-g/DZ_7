package ru.iteco.behavioral.state;

public class Main {
    public static void main(String[] args) {
        CopyMashine copyMashine = new CopyMashine();
        System.out.println(copyMashine.getState());
        copyMashine.insertMoney();
        copyMashine.selectSource();
        copyMashine.selectDoc();
        copyMashine.printDoc();
        copyMashine.selectDoc();
    }
}
