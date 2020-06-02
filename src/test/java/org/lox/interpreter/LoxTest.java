package org.lox.interpreter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;


public class LoxTest {

    @Test
    public void testBlockAndScopes() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        Lox.main(new String[]{"src/test/resources/scopes.lox"});
    }

    @Test
    public void testForLoopOnFibonnaciSequence() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        Lox.main(new String[]{"src/test/resources/fibonacci.lox"});
    }

    @Test
    public void testRecursiveFibonnaci() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        Lox.main(new String[]{"src/test/resources/recursive_fibonacci.lox"});
    }

    @Test
    public void testBasicFunction() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        Lox.main(new String[]{"src/test/resources/sayHi.lox"});
    }

}
