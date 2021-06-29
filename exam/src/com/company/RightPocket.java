package com.company;

public class RightPocket {
    Paper paper;

    public RightPocket() {
    }

    public RightPocket(Paper paper) {
        this.paper = paper;
    }

    public Paper getPaper() {
        return paper;
    }

    @Override
    public String toString() {
        return "В правом кормане лежит что-то бумажное  " + paper + "\n";
    }
}
