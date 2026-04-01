package org.example.toylanguage.expression;

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
import static org.example.toylanguage.expression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ArrayExpression_getValues_12738036662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472;

    public ArrayExpression_getValues_12738036662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term473 = new ArrayList();
        ((ArrayList) term473).add((Object)null);
        ((ArrayList) term473).add((Object)null);
        ((ArrayList) term473).add((Object)null);
        ((ArrayList) term473).add((Object)null);
        ((ArrayList) term473).add((Object)null);
        ((ArrayList) term473).add((Object)null);
        ((ArrayList) term473).add((Object)null);
        term472 = newInstance(Class.forName("org.example.toylanguage.expression.ArrayExpression"));
        setField(term472, term472.getClass(), "values", term473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ArrayExpression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValues", argTypes, term472, args);
    }

};


