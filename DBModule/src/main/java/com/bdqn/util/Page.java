package com.bdqn.util;

public class Page {
    private int maxCount; //总行数
    private int maxPage; //总页数
    private int rowCount; //每页显示行数
    private int current;//当前第几页

    public Page(int rowCount, int current) {
        this.rowCount = rowCount;
        this.current = current;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
