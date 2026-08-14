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

public class ForLoopStatement_postIncrement_197197846211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;

    public ForLoopStatement_postIncrement_197197846211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450 = newInstance(Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement"));
        setField(term450, term450.getClass(), "variable", null);
        setField(term450, term450.getClass(), "lowerBound", null);
        setField(term450, term450.getClass(), "uppedBound", null);
        setField(term450, term450.getClass(), "step", null);
        setField(term450, term450.getClass(), "statements2Execute", null);
        setField(term450, term450.getClass(), "rowNumber", null);
        setField(term450, term450.getClass(), "blockName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "postIncrement", argTypes, term450, args);
    }

};


