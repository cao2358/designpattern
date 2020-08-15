package com.cwg.designpattern.interpreter;

import org.junit.Test;

/**
 * 创建时间：2019-10-27 11:18
 * Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
 *
 * @author 曹文岗
 **/
public class InterpreterTest {
    @Test
    public void interpreter(){
        Expression define = buildInterpreterTree();
        String context1 = "D A";
        String context2 = "A B";
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));
    }

    /**
     * 构建解析树
     */
    public static Expression buildInterpreterTree() {
        // Literal
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");
        // B C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        // A Or (B C)
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        // D And (A Or (B C))
        return new AndExpression(terminal4, alternation2);
    }
}
