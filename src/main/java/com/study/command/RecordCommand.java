package com.study.command;

/**
 * Created by Frank on 2016/12/25.
 */
public class RecordCommand implements Command {
    private Record record;

    public RecordCommand() {
    }

    public RecordCommand(Record record) {
        this.record = record;
    }

    @Override
    public void execute() {
        record.record();
    }

    @Override
    public void undo() {

    }

    @Override
    public void store() {

    }

    @Override
    public void load() {

    }
}
