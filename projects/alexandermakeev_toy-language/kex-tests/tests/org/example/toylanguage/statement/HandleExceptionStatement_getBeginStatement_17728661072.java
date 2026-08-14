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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class HandleExceptionStatement_getBeginStatement_17728661072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1506;

    public HandleExceptionStatement_getBeginStatement_17728661072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1508 = new ArrayList();
        ((ArrayList) term1508).add((Object)null);
        ((ArrayList) term1508).add((Object)null);
        ((ArrayList) term1508).add((Object)null);
        ((ArrayList) term1508).add((Object)null);
        ((ArrayList) term1508).add((Object)null);
        ((ArrayList) term1508).add((Object)null);
        ((ArrayList) term1508).add((Object)null);
        ((ArrayList) term1508).add((Object)null);
        Integer term1512 = new Integer(-1968847291);
        ArrayList term1527 = new ArrayList();
        ((ArrayList) term1527).add((Object)null);
        ((ArrayList) term1527).add((Object)null);
        ((ArrayList) term1527).add((Object)null);
        ((ArrayList) term1527).add((Object)null);
        ((ArrayList) term1527).add((Object)null);
        ((ArrayList) term1527).add((Object)null);
        Integer term1531 = new Integer(579005622);
        ArrayList term1546 = new ArrayList();
        ((ArrayList) term1546).add((Object)null);
        ((ArrayList) term1546).add((Object)null);
        Integer term1550 = new Integer(-14890619);
        Integer term1576 = new Integer(1632125673);
        term1506 = newInstance(Class.forName("org.example.toylanguage.statement.HandleExceptionStatement"));
        Object term1507 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1526 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1545 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1507, term1507.getClass(), "statements2Execute", term1508);
        setField(term1507, term1507.getClass(), "rowNumber", term1512);
        setField(term1507, term1507.getClass(), "blockName", "ytSBIKXogI");
        setField(term1506, term1506.getClass(), "beginStatement", term1507);
        setField(term1526, term1526.getClass(), "statements2Execute", term1527);
        setField(term1526, term1526.getClass(), "rowNumber", term1531);
        setField(term1526, term1526.getClass(), "blockName", "nHXjMycHlU");
        setField(term1506, term1506.getClass(), "rescueStatement", term1526);
        setField(term1545, term1545.getClass(), "statements2Execute", term1546);
        setField(term1545, term1545.getClass(), "rowNumber", term1550);
        setField(term1545, term1545.getClass(), "blockName", "ieCtQFdkii");
        setField(term1506, term1506.getClass(), "ensureStatement", term1545);
        setField(term1506, term1506.getClass(), "errorVariable", "dEnhdmILtU");
        setField(term1506, term1506.getClass(), "rowNumber", term1576);
        setField(term1506, term1506.getClass(), "blockName", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.HandleExceptionStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeginStatement", argTypes, term1506, args);
    }

};


