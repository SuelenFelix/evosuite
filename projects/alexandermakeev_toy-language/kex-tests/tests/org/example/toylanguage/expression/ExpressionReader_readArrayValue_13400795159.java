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

public class ExpressionReader_readArrayValue_13400795159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17317;
     Object term17410;

    public ExpressionReader_readArrayValue_13400795159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17447 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term17446 = ((Class) term17447).getDeclaredField((String) "ArrayAppend");
        ((Field) term17446).setAccessible(true);
        Object enum39 = ((Field) term17446).get((Object) null);
        Class<? extends Object> term17747 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term17746 = ((Class) term17747).getDeclaredField((String) "Modulo");
        ((Field) term17746).setAccessible(true);
        Object enum40 = ((Field) term17746).get((Object) null);
        Class<? extends Object> term18032 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term18031 = ((Class) term18032).getDeclaredField((String) "Addition");
        ((Field) term18031).setAccessible(true);
        Object enum41 = ((Field) term18031).get((Object) null);
        Class<? extends Object> term18323 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term18322 = ((Class) term18323).getDeclaredField((String) "RightParen");
        ((Field) term18322).setAccessible(true);
        Object enum42 = ((Field) term18322).get((Object) null);
        Class<? extends Object> term18620 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term18619 = ((Class) term18620).getDeclaredField((String) "Division");
        ((Field) term18619).setAccessible(true);
        Object enum43 = ((Field) term18619).get((Object) null);
        Class<? extends Object> term18911 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term18910 = ((Class) term18911).getDeclaredField((String) "LessThan");
        ((Field) term18910).setAccessible(true);
        Object enum44 = ((Field) term18910).get((Object) null);
        Class<? extends Object> term19202 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term19201 = ((Class) term19202).getDeclaredField((String) "Modulo");
        ((Field) term19201).setAccessible(true);
        Object enum45 = ((Field) term19201).get((Object) null);
        Integer term17384 = new Integer(579005622);
        Object term17383 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17383, term17383.getClass(), "type", null);
        setField(term17383, term17383.getClass(), "value", null);
        setField(term17383, term17383.getClass(), "rowNumber", term17384);
        Integer term17387 = new Integer(-14890619);
        Object term17386 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17386, term17386.getClass(), "type", null);
        setField(term17386, term17386.getClass(), "value", null);
        setField(term17386, term17386.getClass(), "rowNumber", term17387);
        Integer term17390 = new Integer(1632125673);
        Object term17389 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17389, term17389.getClass(), "type", null);
        setField(term17389, term17389.getClass(), "value", null);
        setField(term17389, term17389.getClass(), "rowNumber", term17390);
        Integer term17393 = new Integer(454281060);
        Object term17392 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17392, term17392.getClass(), "type", null);
        setField(term17392, term17392.getClass(), "value", null);
        setField(term17392, term17392.getClass(), "rowNumber", term17393);
        Integer term17396 = new Integer(-1786399638);
        Object term17395 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17395, term17395.getClass(), "type", null);
        setField(term17395, term17395.getClass(), "value", null);
        setField(term17395, term17395.getClass(), "rowNumber", term17396);
        Integer term17399 = new Integer(2055867847);
        Object term17398 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17398, term17398.getClass(), "type", null);
        setField(term17398, term17398.getClass(), "value", null);
        setField(term17398, term17398.getClass(), "rowNumber", term17399);
        Integer term17402 = new Integer(-1048298087);
        Object term17401 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17401, term17401.getClass(), "type", null);
        setField(term17401, term17401.getClass(), "value", null);
        setField(term17401, term17401.getClass(), "rowNumber", term17402);
        Integer term17405 = new Integer(292681826);
        Object term17404 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17404, term17404.getClass(), "type", null);
        setField(term17404, term17404.getClass(), "value", null);
        setField(term17404, term17404.getClass(), "rowNumber", term17405);
        ArrayList term17381 = new ArrayList();
        ((ArrayList) term17381).add(term17383);
        ((ArrayList) term17381).add(term17386);
        ((ArrayList) term17381).add(term17389);
        ((ArrayList) term17381).add(term17392);
        ((ArrayList) term17381).add(term17395);
        ((ArrayList) term17381).add(term17398);
        ((ArrayList) term17381).add(term17401);
        ((ArrayList) term17381).add(term17404);
        term17317 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term17318 = newInstance(Class.forName("java.util.Stack"));
        Object[] term17319 = (Object[]) newArray("java.lang.Object", 10);
        Object term17323 = newInstance(Class.forName("java.util.Stack"));
        Object[] term17324 = (Object[]) newArray("java.lang.Object", 10);
        Object term17380 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term17318, term17318.getClass(), "elementData", term17319);
        setIntField(term17318, term17318.getClass(), "elementCount", 3);
        setIntField(term17318, term17318.getClass(), "capacityIncrement", 0);
        setIntField(term17318, term17318.getClass(), "modCount", 3);
        setField(term17317, term17317.getClass(), "operands", term17318);
        setElement(term17324, 0, enum39);
        setElement(term17324, 1, enum40);
        setElement(term17324, 2, enum41);
        setElement(term17324, 3, enum42);
        setElement(term17324, 4, enum43);
        setElement(term17324, 5, enum44);
        setElement(term17324, 6, enum45);
        setField(term17323, term17323.getClass(), "elementData", term17324);
        setIntField(term17323, term17323.getClass(), "elementCount", 7);
        setIntField(term17323, term17323.getClass(), "capacityIncrement", 0);
        setIntField(term17323, term17323.getClass(), "modCount", 7);
        setField(term17317, term17317.getClass(), "operators", term17323);
        setField(term17380, term17380.getClass(), "tokens", term17381);
        setIntField(term17380, term17380.getClass(), "position", 1134449235);
        setField(term17317, term17317.getClass(), "tokens", term17380);
        Class<? extends Object> term19487 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term19486 = ((Class) term19487).getDeclaredField((String) "LineBreak");
        ((Field) term19486).setAccessible(true);
        Object enum46 = ((Field) term19486).get((Object) null);
        Integer term17444 = new Integer(458147407);
        term17410 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term17410, term17410.getClass(), "type", enum46);
        setField(term17410, term17410.getClass(), "value", "OJJtVNPyKZ");
        setField(term17410, term17410.getClass(), "rowNumber", term17444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.token.Token");
        Object[] args = new Object[1];
        args[0] = term17410;
        callMethod(klass, "readArrayValue", argTypes, term17317, args);
    }

};


