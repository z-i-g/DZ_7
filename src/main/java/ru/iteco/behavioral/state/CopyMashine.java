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

    public void insertMoney(CopyMashine copyMashine) {
        state.insertMoney(this);
    }

    public void selectSource(CopyMashine copyMashine) {
        state.selectSource(this);
    }

    public void selectDoc(CopyMashine copyMashine) {
        state.selectDoc(this);
    }

    public void зrintDoc(CopyMashine copyMashine) {
        state.printDoc(this);
    }

    public void getCashe(CopyMashine copyMashine) {
        state.getCashe(this);
    }
}
