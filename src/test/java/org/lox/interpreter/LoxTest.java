package org.lox.interpreter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;


public class LoxTest {

    @Test
    public void testBlockAndScopes() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        System.out.println("testBlockAndScopes");
        Lox.main(new String[]{"src/test/resources/scopes.lox"});
        System.out.println("");
    }

    @Test
    public void testBasicFunction() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        System.out.println("testBasicFunction");
        Lox.main(new String[]{"src/test/resources/sayHi.lox"});
        System.out.println("");
    }

    @Test
    public void testForLoopOnFibonnaciSequence() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        System.out.println("testForLoopOnFibonnaciSequence");
        Lox.main(new String[]{"src/test/resources/fibonacci.lox"});
        System.out.println("");
    }

    @Test
    public void testRecursiveFibonnaci() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        System.out.println("testRecursiveFibonnacixs");
        Lox.main(new String[]{"src/test/resources/recursive_fibonacci.lox"});
        System.out.println("");
    }

    @Test
    public void testBasicClosure() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        System.out.println("testBasicClosure");
        Lox.main(new String[]{"src/test/resources/closures.lox"});
        System.out.println("");
    }

    @Test
    public void testClosureScopeFix() throws IOException {
        // TODO: capture the output of the Lox script, so that we can assert its correctness
        System.out.println("testClosureScopeFix");
        Lox.main(new String[]{"src/test/resources/closures_scope_fix.lox"});
        System.out.println("");
    }

}
