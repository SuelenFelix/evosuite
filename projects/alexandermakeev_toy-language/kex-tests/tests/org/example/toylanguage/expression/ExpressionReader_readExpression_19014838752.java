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

public class ExpressionReader_readExpression_19014838752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115;

    public ExpressionReader_readExpression_19014838752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6232 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term6231 = ((Class) term6232).getDeclaredField((String) "Division");
        ((Field) term6231).setAccessible(true);
        Object enum4 = ((Field) term6231).get((Object) null);
        Class<? extends Object> term6523 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term6522 = ((Class) term6523).getDeclaredField((String) "ClassCast");
        ((Field) term6522).setAccessible(true);
        Object enum5 = ((Field) term6522).get((Object) null);
        Class<? extends Object> term6817 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term6816 = ((Class) term6817).getDeclaredField((String) "LogicalAnd");
        ((Field) term6816).setAccessible(true);
        Object enum6 = ((Field) term6816).get((Object) null);
        Class<? extends Object> term7114 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term7113 = ((Class) term7114).getDeclaredField((String) "ClassInstance");
        ((Field) term7113).setAccessible(true);
        Object enum7 = ((Field) term7113).get((Object) null);
        Class<? extends Object> term7420 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term7419 = ((Class) term7420).getDeclaredField((String) "Division");
        ((Field) term7419).setAccessible(true);
        Object enum8 = ((Field) term7419).get((Object) null);
        Class<? extends Object> term7711 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term7710 = ((Class) term7711).getDeclaredField((String) "LessThanOrEqualTo");
        ((Field) term7710).setAccessible(true);
        Object enum9 = ((Field) term7710).get((Object) null);
        Class<? extends Object> term8029 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term8028 = ((Class) term8029).getDeclaredField((String) "ClassCast");
        ((Field) term8028).setAccessible(true);
        Object enum10 = ((Field) term8028).get((Object) null);
        Integer term2186 = new Integer(-1685132342);
        Object term2185 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term2185, term2185.getClass(), "type", null);
        setField(term2185, term2185.getClass(), "value", null);
        setField(term2185, term2185.getClass(), "rowNumber", term2186);
        Integer term2189 = new Integer(-1456670397);
        Object term2188 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term2188, term2188.getClass(), "type", null);
        setField(term2188, term2188.getClass(), "value", null);
        setField(term2188, term2188.getClass(), "rowNumber", term2189);
        ArrayList term2183 = new ArrayList();
        ((ArrayList) term2183).add(term2185);
        ((ArrayList) term2183).add(term2188);
        term2115 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term2116 = newInstance(Class.forName("java.util.Stack"));
        Object[] term2117 = (Object[]) newArray("java.lang.Object", 10);
        Object term2121 = newInstance(Class.forName("java.util.Stack"));
        Object[] term2122 = (Object[]) newArray("java.lang.Object", 10);
        Object term2182 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term2116, term2116.getClass(), "elementData", term2117);
        setIntField(term2116, term2116.getClass(), "elementCount", 2);
        setIntField(term2116, term2116.getClass(), "capacityIncrement", 0);
        setIntField(term2116, term2116.getClass(), "modCount", 2);
        setField(term2115, term2115.getClass(), "operands", term2116);
        setElement(term2122, 0, enum4);
        setElement(term2122, 1, enum5);
        setElement(term2122, 2, enum6);
        setElement(term2122, 3, enum7);
        setElement(term2122, 4, enum8);
        setElement(term2122, 5, enum9);
        setElement(term2122, 6, enum10);
        setField(term2121, term2121.getClass(), "elementData", term2122);
        setIntField(term2121, term2121.getClass(), "elementCount", 7);
        setIntField(term2121, term2121.getClass(), "capacityIncrement", 0);
        setIntField(term2121, term2121.getClass(), "modCount", 7);
        setField(term2115, term2115.getClass(), "operators", term2121);
        setField(term2182, term2182.getClass(), "tokens", term2183);
        setIntField(term2182, term2182.getClass(), "position", -616727354);
        setField(term2115, term2115.getClass(), "tokens", term2182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Object[] args = new Object[1];
        args[0] = term2115;
        callMethod(klass, "readExpression", argTypes, null, args);
    }

};


