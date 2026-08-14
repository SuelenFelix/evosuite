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

public class ForLoopStatement_init_14371033612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239;

    public ForLoopStatement_init_14371033612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term253 = new ArrayList();
        ((ArrayList) term253).add((Object)null);
        Integer term257 = new Integer(-2038273078);
        term239 = newInstance(Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement"));
        Object term240 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term240, term240.getClass(), "name", "RMFIsYGgne");
        setField(term239, term239.getClass(), "variable", term240);
        setField(term239, term239.getClass(), "lowerBound", null);
        setField(term239, term239.getClass(), "uppedBound", null);
        setField(term239, term239.getClass(), "step", null);
        setField(term239, term239.getClass(), "statements2Execute", term253);
        setField(term239, term239.getClass(), "rowNumber", term257);
        setField(term239, term239.getClass(), "blockName", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term239, args);
    }

};


