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

public class ForLoopStatement_hasNext_6856975923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public ForLoopStatement_hasNext_6856975923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term305 = new ArrayList();
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        Integer term309 = new Integer(1227103734);
        term291 = newInstance(Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement"));
        Object term292 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term292, term292.getClass(), "name", "uuaPigETmJ");
        setField(term291, term291.getClass(), "variable", term292);
        setField(term291, term291.getClass(), "lowerBound", null);
        setField(term291, term291.getClass(), "uppedBound", null);
        setField(term291, term291.getClass(), "step", null);
        setField(term291, term291.getClass(), "statements2Execute", term305);
        setField(term291, term291.getClass(), "rowNumber", term309);
        setField(term291, term291.getClass(), "blockName", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term291, args);
    }

};


