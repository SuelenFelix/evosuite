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

public class IterableLoopStatement_postIncrement_5559322134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754;

    public IterableLoopStatement_postIncrement_5559322134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term768 = new ArrayList();
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        Integer term772 = new Integer(1048535127);
        term754 = newInstance(Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement"));
        Object term755 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term755, term755.getClass(), "name", "TEParAifyi");
        setField(term754, term754.getClass(), "variableExpression", term755);
        setField(term754, term754.getClass(), "iterableExpression", null);
        setField(term754, term754.getClass(), "iterator", null);
        setField(term754, term754.getClass(), "statements2Execute", term768);
        setField(term754, term754.getClass(), "rowNumber", term772);
        setField(term754, term754.getClass(), "blockName", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "postIncrement", argTypes, term754, args);
    }

};


