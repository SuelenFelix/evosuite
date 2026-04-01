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
import java.lang.Integer;

public class ForLoopStatement_init_11231386200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;
     Object term159;

    public ForLoopStatement_init_11231386200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = new Integer(-616727354);
        term159 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term159, term159.getClass(), "name", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.example.toylanguage.expression.VariableExpression");
        argTypes[3] = Class.forName("org.example.toylanguage.expression.Expression");
        argTypes[4] = Class.forName("org.example.toylanguage.expression.Expression");
        Object[] args = new Object[5];
        args[0] = term145;
        args[1] = "EGtDIRbSSb";
        args[2] = term159;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


