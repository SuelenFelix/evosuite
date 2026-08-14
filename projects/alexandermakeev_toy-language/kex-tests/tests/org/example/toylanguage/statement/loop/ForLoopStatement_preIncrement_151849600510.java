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

public class ForLoopStatement_preIncrement_151849600510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449;

    public ForLoopStatement_preIncrement_151849600510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term449 = newInstance(Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement"));
        setField(term449, term449.getClass(), "variable", null);
        setField(term449, term449.getClass(), "lowerBound", null);
        setField(term449, term449.getClass(), "uppedBound", null);
        setField(term449, term449.getClass(), "step", null);
        setField(term449, term449.getClass(), "statements2Execute", null);
        setField(term449, term449.getClass(), "rowNumber", null);
        setField(term449, term449.getClass(), "blockName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preIncrement", argTypes, term449, args);
    }

};


