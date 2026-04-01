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

public class CompositeStatement_getStatements2Execute_19254079453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785;

    public CompositeStatement_getStatements2Execute_19254079453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term786 = new ArrayList();
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        Integer term790 = new Integer(-1007160944);
        term785 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term785, term785.getClass(), "statements2Execute", term786);
        setField(term785, term785.getClass(), "rowNumber", term790);
        setField(term785, term785.getClass(), "blockName", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatements2Execute", argTypes, term785, args);
    }

};


