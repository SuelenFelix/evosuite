package de.schauderhaft.beyond.bidiinternal;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static de.schauderhaft.beyond.bidiinternal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Minion_addToy_3168271025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350;

    public Minion_addToy_3168271025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Minion"));
        setField(term350, term350.getClass(), "id", null);
        setField(term350, term350.getClass(), "name", null);
        setField(term350, term350.getClass(), "toys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.schauderhaft.beyond.bidiinternal.Minion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.schauderhaft.beyond.bidiinternal.Toy");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addToy", argTypes, term350, args);
    }

};


