package ru.iteco.behavioral.state;

public class CopyMashine {

    private State state;

    public CopyMashine() {
        this.state = new InsertMoneyState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertMoney() {
        state.insertMoney(this);
    }

    public void selectSource() {
        state.selectSource(this);
    }

    public void selectDoc() {
        state.selectDoc(this);
    }

    public void printDoc() {
        state.printDoc(this);
    }

    public void getCashe() {
        state.getCashe(this);
    }
}
