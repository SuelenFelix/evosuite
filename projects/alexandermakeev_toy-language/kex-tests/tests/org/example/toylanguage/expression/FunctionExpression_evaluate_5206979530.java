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

public class FunctionExpression_evaluate_5206979530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public FunctionExpression_evaluate_5206979530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24 = new ArrayList();
        ((ArrayList) term24).add((Object)null);
        ((ArrayList) term24).add((Object)null);
        ((ArrayList) term24).add((Object)null);
        ((ArrayList) term24).add((Object)null);
        ((ArrayList) term24).add((Object)null);
        term11 = newInstance(Class.forName("org.example.toylanguage.expression.FunctionExpression"));
        setField(term11, term11.getClass(), "name", "PAEBtnZtTD");
        setField(term11, term11.getClass(), "argumentExpressions", term24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.FunctionExpression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "evaluate", argTypes, term11, args);
    }

};


