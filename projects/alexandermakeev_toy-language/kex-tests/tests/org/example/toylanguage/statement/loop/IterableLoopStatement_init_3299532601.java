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

public class IterableLoopStatement_init_3299532601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;

    public IterableLoopStatement_init_3299532601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term612 = new ArrayList();
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        Integer term616 = new Integer(-1685132342);
        term598 = newInstance(Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement"));
        Object term599 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term599, term599.getClass(), "name", "eZFUvlxvGV");
        setField(term598, term598.getClass(), "variableExpression", term599);
        setField(term598, term598.getClass(), "iterableExpression", null);
        setField(term598, term598.getClass(), "iterator", null);
        setField(term598, term598.getClass(), "statements2Execute", term612);
        setField(term598, term598.getClass(), "rowNumber", term616);
        setField(term598, term598.getClass(), "blockName", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term598, args);
    }

};


