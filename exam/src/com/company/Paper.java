package com.company;

public class Paper extends AbstractPaper{
    public Paper() {
    }

    public Paper(boolean burn) {
        super(burn);
    }

    @Override
    public String toString() {
        return "бумажка с номером телефона";
    }
}
