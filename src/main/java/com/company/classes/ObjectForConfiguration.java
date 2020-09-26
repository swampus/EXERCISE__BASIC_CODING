package com.company.classes;

public class ObjectForConfiguration {
    private int firstField;
    private int secondField;
    private int thirdField;
    private int secretField;

    public int getFirstField() {
        return firstField;
    }

    public void setFirstField(int firstField) {
        this.firstField = firstField;
    }

    public int getSecondField() {
        return secondField;
    }

    public void setSecondField(int secondField) {
        this.secondField = secondField;
    }

    public int getThirdField() {
        return thirdField;
    }

    public void setThirdField(int thirdField) {
        this.thirdField = thirdField;
    }

    public void secretActionMethod(int param) {
        secretField = param;
    }

    public int getSecretField() {
        return secretField;
    }
}
