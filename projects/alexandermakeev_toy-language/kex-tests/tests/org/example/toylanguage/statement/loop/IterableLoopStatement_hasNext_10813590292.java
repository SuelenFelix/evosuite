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

public class IterableLoopStatement_hasNext_10813590292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650;

    public IterableLoopStatement_hasNext_10813590292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term664 = new ArrayList();
        ((ArrayList) term664).add((Object)null);
        Integer term668 = new Integer(-1456670397);
        term650 = newInstance(Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement"));
        Object term651 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term651, term651.getClass(), "name", "vrQLuWIDJX");
        setField(term650, term650.getClass(), "variableExpression", term651);
        setField(term650, term650.getClass(), "iterableExpression", null);
        setField(term650, term650.getClass(), "iterator", null);
        setField(term650, term650.getClass(), "statements2Execute", term664);
        setField(term650, term650.getClass(), "rowNumber", term668);
        setField(term650, term650.getClass(), "blockName", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.IterableLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term650, args);
    }

};


