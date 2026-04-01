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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ClassStatement_getRowNumber_602826021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031;

    public ClassStatement_getRowNumber_602826021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1038 = new Integer(-1179120542);
        ArrayList term1034 = new ArrayList();
        ((ArrayList) term1034).add((Object)null);
        ((ArrayList) term1034).add((Object)null);
        ((ArrayList) term1034).add((Object)null);
        ((ArrayList) term1034).add((Object)null);
        ((ArrayList) term1034).add((Object)null);
        term1031 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        setField(term1031, term1031.getClass(), "rowNumber", term1038);
        setField(term1031, term1031.getClass(), "statements2Execute", term1034);
        setField(term1031, term1031.getClass(), "blockName", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.ClassStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowNumber", argTypes, term1031, args);
    }

};


