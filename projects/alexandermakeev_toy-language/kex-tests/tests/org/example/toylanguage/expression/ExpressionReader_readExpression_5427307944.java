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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;

public class ExpressionReader_readExpression_5427307944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10248;

    public ExpressionReader_readExpression_5427307944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10288 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term10287 = ((Class) term10288).getDeclaredField((String) "GreaterThanOrEqualTo");
        ((Field) term10287).setAccessible(true);
        Object enum17 = ((Field) term10287).get((Object) null);
        Class<? extends Object> term10615 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term10614 = ((Class) term10615).getDeclaredField((String) "ClassProperty");
        ((Field) term10614).setAccessible(true);
        Object enum18 = ((Field) term10614).get((Object) null);
        Integer term10279 = new Integer(1622346318);
        Object term10278 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10278, term10278.getClass(), "type", null);
        setField(term10278, term10278.getClass(), "value", null);
        setField(term10278, term10278.getClass(), "rowNumber", term10279);
        Integer term10282 = new Integer(1048535127);
        Object term10281 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10281, term10281.getClass(), "type", null);
        setField(term10281, term10281.getClass(), "value", null);
        setField(term10281, term10281.getClass(), "rowNumber", term10282);
        ArrayList term10276 = new ArrayList();
        ((ArrayList) term10276).add(term10278);
        ((ArrayList) term10276).add(term10281);
        term10248 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term10249 = newInstance(Class.forName("java.util.Stack"));
        Object[] term10250 = (Object[]) newArray("java.lang.Object", 10);
        Object term10254 = newInstance(Class.forName("java.util.Stack"));
        Object[] term10255 = (Object[]) newArray("java.lang.Object", 10);
        Object term10275 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term10249, term10249.getClass(), "elementData", term10250);
        setIntField(term10249, term10249.getClass(), "elementCount", 0);
        setIntField(term10249, term10249.getClass(), "capacityIncrement", 0);
        setIntField(term10249, term10249.getClass(), "modCount", 0);
        setField(term10248, term10248.getClass(), "operands", term10249);
        setElement(term10255, 0, enum17);
        setElement(term10255, 1, enum18);
        setField(term10254, term10254.getClass(), "elementData", term10255);
        setIntField(term10254, term10254.getClass(), "elementCount", 2);
        setIntField(term10254, term10254.getClass(), "capacityIncrement", 0);
        setIntField(term10254, term10254.getClass(), "modCount", 2);
        setField(term10248, term10248.getClass(), "operators", term10254);
        setField(term10275, term10275.getClass(), "tokens", term10276);
        setIntField(term10275, term10275.getClass(), "position", -2038273078);
        setField(term10248, term10248.getClass(), "tokens", term10275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readExpression", argTypes, term10248, args);
    }

};


