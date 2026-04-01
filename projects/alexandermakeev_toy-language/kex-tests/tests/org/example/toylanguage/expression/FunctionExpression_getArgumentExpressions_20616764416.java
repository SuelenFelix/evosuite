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

public class FunctionExpression_getArgumentExpressions_20616764416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;

    public FunctionExpression_getArgumentExpressions_20616764416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term365 = new ArrayList();
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        term352 = newInstance(Class.forName("org.example.toylanguage.expression.FunctionExpression"));
        setField(term352, term352.getClass(), "name", "wGmYcqUkgE");
        setField(term352, term352.getClass(), "argumentExpressions", term365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.FunctionExpression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArgumentExpressions", argTypes, term352, args);
    }

};


