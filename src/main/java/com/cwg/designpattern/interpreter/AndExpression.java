package com.cwg.designpattern.interpreter;

/**
 * 创建时间：2019-10-27 11:21
 *
 * @author 曹文岗
 **/
public class AndExpression extends Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String str) {
        return expression1.interpret(str) && expression2.interpret(str);
    }
}
