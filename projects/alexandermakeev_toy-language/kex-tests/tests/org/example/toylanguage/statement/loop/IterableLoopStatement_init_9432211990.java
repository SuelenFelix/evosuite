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

public class IterableLoopStatement_init_9432211990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;
     Object term565;

    public IterableLoopStatement_init_9432211990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551 = new Integer(597278769);
        term565 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term565, term565.getClass(), "name", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.example.toylanguage.expression.VariableExpression");
        argTypes[3] = Class.forName("org.example.toylanguage.expression.Expression");
        Object[] args = new Object[4];
        args[0] = term551;
        args[1] = "RkybSrpybU";
        args[2] = term565;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


