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

public class IterableLoopStatement_preIncrement_2485606163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702;

    public IterableLoopStatement_preIncrement_2485606163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term716 = new ArrayList();
        ((ArrayList) term716).add((Object)null);
        ((ArrayList) term716).add((Object)null);
        ((ArrayList) term716).add((Object)null);
        ((ArrayList) term716).add((Object)null);
        ((ArrayList) term716).add((Object)null);
        ((ArrayList) term716).add((Object)null);
        Integer term720 = new Integer(1622346318);
        term702 = newInstance(Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement"));
        Object term703 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term703, term703.getClass(), "name", "OclPbYPkcH");
        setField(term702, term702.getClass(), "variableExpression", term703);
        setField(term702, term702.getClass(), "iterableExpression", null);
        setField(term702, term702.getClass(), "iterator", null);
        setField(term702, term702.getClass(), "statements2Execute", term716);
        setField(term702, term702.getClass(), "rowNumber", term720);
        setField(term702, term702.getClass(), "blockName", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preIncrement", argTypes, term702, args);
    }

};


