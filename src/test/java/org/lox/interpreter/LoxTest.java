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

}
