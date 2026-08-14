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

public class ConditionStatement_addCase_11469134685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2266;

    public ConditionStatement_addCase_11469134685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2266 = newInstance(Class.forName("org.example.toylanguage.statement.ConditionStatement"));
        setField(term2266, term2266.getClass(), "cases", null);
        setField(term2266, term2266.getClass(), "rowNumber", null);
        setField(term2266, term2266.getClass(), "blockName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.ConditionStatement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.Expression");
        argTypes[1] = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addCase", argTypes, term2266, args);
    }

};


