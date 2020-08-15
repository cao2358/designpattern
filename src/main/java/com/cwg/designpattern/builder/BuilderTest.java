package com.cwg.designpattern.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 创建时间：2019-10-26 14:06
 * Separate the construction of a complex object from its representation so that the same construction process can create different representations.
 *
 * @author 曹文岗
 **/
@Slf4j
public class BuilderTest {

    @Test
    public void stringBuilder(){
        StringBuilder sb = new StringBuilder();

        final int count = 26;

        for(int i = 0; i < count; i++){
            sb.append((char)('a' + i));
        }

        log.info("string is {}", sb.toString());
    }
}
