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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class CompositeStatement_addStatement_13604978041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727;

    public CompositeStatement_addStatement_13604978041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term728 = new ArrayList();
        ((ArrayList) term728).add((Object)null);
        ((ArrayList) term728).add((Object)null);
        ((ArrayList) term728).add((Object)null);
        ((ArrayList) term728).add((Object)null);
        ((ArrayList) term728).add((Object)null);
        ((ArrayList) term728).add((Object)null);
        ((ArrayList) term728).add((Object)null);
        Integer term732 = new Integer(-2068769794);
        term727 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term727, term727.getClass(), "statements2Execute", term728);
        setField(term727, term727.getClass(), "rowNumber", term732);
        setField(term727, term727.getClass(), "blockName", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.statement.Statement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addStatement", argTypes, term727, args);
    }

};


