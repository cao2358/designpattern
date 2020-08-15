package com.cwg.designpattern.interpreter;

import java.util.StringTokenizer;

/**
 * 创建时间：2019-10-27 11:20
 *
 * @author 曹文岗
 **/
public class TerminalExpression extends Expression {
    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
