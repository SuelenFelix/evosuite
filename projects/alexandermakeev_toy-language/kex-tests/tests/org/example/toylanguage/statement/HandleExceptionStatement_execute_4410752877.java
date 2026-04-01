package org.example.toylanguage.statement;

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
import static org.example.toylanguage.statement.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HandleExceptionStatement_execute_4410752877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2042;

    public HandleExceptionStatement_execute_4410752877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2042 = newInstance(Class.forName("org.example.toylanguage.statement.HandleExceptionStatement"));
        setField(term2042, term2042.getClass(), "beginStatement", null);
        setField(term2042, term2042.getClass(), "rescueStatement", null);
        setField(term2042, term2042.getClass(), "ensureStatement", null);
        setField(term2042, term2042.getClass(), "errorVariable", null);
        setField(term2042, term2042.getClass(), "rowNumber", null);
        setField(term2042, term2042.getClass(), "blockName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.HandleExceptionStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "execute", argTypes, term2042, args);
    }

};


