package org.example.toylanguage.statement.loop;

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
import static org.example.toylanguage.statement.loop.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IterableLoopStatement_postIncrement_5559322139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;

    public IterableLoopStatement_postIncrement_5559322139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = newInstance(Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement"));
        setField(term809, term809.getClass(), "variableExpression", null);
        setField(term809, term809.getClass(), "iterableExpression", null);
        setField(term809, term809.getClass(), "iterator", null);
        setField(term809, term809.getClass(), "statements2Execute", null);
        setField(term809, term809.getClass(), "rowNumber", null);
        setField(term809, term809.getClass(), "blockName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "postIncrement", argTypes, term809, args);
    }

};


