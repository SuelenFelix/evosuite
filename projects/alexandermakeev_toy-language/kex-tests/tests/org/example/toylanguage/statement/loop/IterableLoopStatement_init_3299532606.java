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

public class IterableLoopStatement_init_3299532606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806;

    public IterableLoopStatement_init_3299532606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806 = newInstance(Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement"));
        setField(term806, term806.getClass(), "variableExpression", null);
        setField(term806, term806.getClass(), "iterableExpression", null);
        setField(term806, term806.getClass(), "iterator", null);
        setField(term806, term806.getClass(), "statements2Execute", null);
        setField(term806, term806.getClass(), "rowNumber", null);
        setField(term806, term806.getClass(), "blockName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term806, args);
    }

};


