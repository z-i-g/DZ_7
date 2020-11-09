package ru.iteco.behavioral.state;

public interface State {

    void insertMoney(CopyMashine copyMashine);
    void selectSource(CopyMashine copyMashine);
    void selectDoc(CopyMashine copyMashine);
    void printDoc(CopyMashine copyMashine);
    void getCashe(CopyMashine copyMashine);

}
