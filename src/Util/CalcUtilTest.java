package Util;

import static org.junit.Assert.*;

public class CalcUtilTest {

    @org.junit.Test
    public void addNumber() {
    }

    @org.junit.Test
    public void addSymbol() {
    }

    @org.junit.Test
    public void insetBlanks() {
    }

    @org.junit.Test
    public void expressionToValue() {
        String s = CalcUtil.expressionToValue("123.2+1.5");
        System.out.println("s = " + s);
    }
}