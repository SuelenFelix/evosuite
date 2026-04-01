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

public class ForLoopStatement_hasNext_6856975929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;

    public ForLoopStatement_hasNext_6856975929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement"));
        setField(term448, term448.getClass(), "variable", null);
        setField(term448, term448.getClass(), "lowerBound", null);
        setField(term448, term448.getClass(), "uppedBound", null);
        setField(term448, term448.getClass(), "step", null);
        setField(term448, term448.getClass(), "statements2Execute", null);
        setField(term448, term448.getClass(), "rowNumber", null);
        setField(term448, term448.getClass(), "blockName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term448, args);
    }

};


