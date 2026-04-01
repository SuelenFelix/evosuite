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
import java.util.LinkedList;

public class FunctionExpression_evaluate_2485596132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term116;

    public FunctionExpression_evaluate_2485596132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112 = new ArrayList();
        ((ArrayList) term112).add((Object)null);
        ((ArrayList) term112).add((Object)null);
        ((ArrayList) term112).add((Object)null);
        term99 = newInstance(Class.forName("org.example.toylanguage.expression.FunctionExpression"));
        setField(term99, term99.getClass(), "name", "RkybSrpybU");
        setField(term99, term99.getClass(), "argumentExpressions", term112);
        term116 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.FunctionExpression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term116;
        callMethod(klass, "evaluate", argTypes, term99, args);
    }

};


