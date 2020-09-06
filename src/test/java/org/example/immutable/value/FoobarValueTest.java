package org.example.immutable.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FoobarValueTest {

    @Test
    public void test() {

        final FoobarValue actual = ImmutableFoobarValue.builder()
                .foo(2)
                .bar("Bar")
                .addBuz(1, 3, 4)
                // FoobarValue{foo=2, bar=Bar, buz=[1, 3, 4], crux={}}
                .build();

        assertNotNull(actual);

    }
}
