package com.study.command;

/**
 * Created by Frank on 2016/12/25.
 */
public class SwitchCommand implements Command {
    Switch aSwitch;

    public SwitchCommand() {
    }

    public SwitchCommand(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void execute() {
        boolean state = !aSwitch.getLastState();
        aSwitch.switchOper(state);
    }

    @Override
    public void undo() {
        aSwitch.resetUndo();
    }

    @Override
    public void store() {

    }

    @Override
    public void load() {

    }
}
