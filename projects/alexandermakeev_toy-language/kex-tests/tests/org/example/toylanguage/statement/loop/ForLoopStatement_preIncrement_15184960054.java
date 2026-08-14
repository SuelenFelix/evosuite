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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class ForLoopStatement_preIncrement_15184960054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;

    public ForLoopStatement_preIncrement_15184960054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term357 = new ArrayList();
        ((ArrayList) term357).add((Object)null);
        ((ArrayList) term357).add((Object)null);
        Integer term361 = new Integer(-1339778481);
        term343 = newInstance(Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement"));
        Object term344 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term344, term344.getClass(), "name", "LQFpaHEwXR");
        setField(term343, term343.getClass(), "variable", term344);
        setField(term343, term343.getClass(), "lowerBound", null);
        setField(term343, term343.getClass(), "uppedBound", null);
        setField(term343, term343.getClass(), "step", null);
        setField(term343, term343.getClass(), "statements2Execute", term357);
        setField(term343, term343.getClass(), "rowNumber", term361);
        setField(term343, term343.getClass(), "blockName", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preIncrement", argTypes, term343, args);
    }

};


