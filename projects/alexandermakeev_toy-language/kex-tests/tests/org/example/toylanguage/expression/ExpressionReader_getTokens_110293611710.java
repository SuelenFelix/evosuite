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

public class ExpressionReader_getTokens_110293611710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19725;

    public ExpressionReader_getTokens_110293611710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19799 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term19798 = ((Class) term19799).getDeclaredField((String) "GreaterThan");
        ((Field) term19798).setAccessible(true);
        Object enum47 = ((Field) term19798).get((Object) null);
        Class<? extends Object> term20099 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term20098 = ((Class) term20099).getDeclaredField((String) "Division");
        ((Field) term20098).setAccessible(true);
        Object enum48 = ((Field) term20098).get((Object) null);
        Class<? extends Object> term20390 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term20389 = ((Class) term20390).getDeclaredField((String) "GreaterThan");
        ((Field) term20389).setAccessible(true);
        Object enum49 = ((Field) term20389).get((Object) null);
        Class<? extends Object> term20690 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term20689 = ((Class) term20690).getDeclaredField((String) "LogicalAnd");
        ((Field) term20689).setAccessible(true);
        Object enum50 = ((Field) term20689).get((Object) null);
        Integer term19772 = new Integer(-184153539);
        Object term19771 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19771, term19771.getClass(), "type", null);
        setField(term19771, term19771.getClass(), "value", null);
        setField(term19771, term19771.getClass(), "rowNumber", term19772);
        Integer term19775 = new Integer(493620644);
        Object term19774 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19774, term19774.getClass(), "type", null);
        setField(term19774, term19774.getClass(), "value", null);
        setField(term19774, term19774.getClass(), "rowNumber", term19775);
        Integer term19778 = new Integer(1328271830);
        Object term19777 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19777, term19777.getClass(), "type", null);
        setField(term19777, term19777.getClass(), "value", null);
        setField(term19777, term19777.getClass(), "rowNumber", term19778);
        Integer term19781 = new Integer(1596070772);
        Object term19780 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19780, term19780.getClass(), "type", null);
        setField(term19780, term19780.getClass(), "value", null);
        setField(term19780, term19780.getClass(), "rowNumber", term19781);
        Integer term19784 = new Integer(97029295);
        Object term19783 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19783, term19783.getClass(), "type", null);
        setField(term19783, term19783.getClass(), "value", null);
        setField(term19783, term19783.getClass(), "rowNumber", term19784);
        Integer term19787 = new Integer(-1371869594);
        Object term19786 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19786, term19786.getClass(), "type", null);
        setField(term19786, term19786.getClass(), "value", null);
        setField(term19786, term19786.getClass(), "rowNumber", term19787);
        Integer term19790 = new Integer(-2095575670);
        Object term19789 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19789, term19789.getClass(), "type", null);
        setField(term19789, term19789.getClass(), "value", null);
        setField(term19789, term19789.getClass(), "rowNumber", term19790);
        Integer term19793 = new Integer(1225272962);
        Object term19792 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term19792, term19792.getClass(), "type", null);
        setField(term19792, term19792.getClass(), "value", null);
        setField(term19792, term19792.getClass(), "rowNumber", term19793);
        ArrayList term19769 = new ArrayList();
        ((ArrayList) term19769).add(term19771);
        ((ArrayList) term19769).add(term19774);
        ((ArrayList) term19769).add(term19777);
        ((ArrayList) term19769).add(term19780);
        ((ArrayList) term19769).add(term19783);
        ((ArrayList) term19769).add(term19786);
        ((ArrayList) term19769).add(term19789);
        ((ArrayList) term19769).add(term19792);
        term19725 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term19726 = newInstance(Class.forName("java.util.Stack"));
        Object[] term19727 = (Object[]) newArray("java.lang.Object", 10);
        Object term19731 = newInstance(Class.forName("java.util.Stack"));
        Object[] term19732 = (Object[]) newArray("java.lang.Object", 10);
        Object term19768 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term19726, term19726.getClass(), "elementData", term19727);
        setIntField(term19726, term19726.getClass(), "elementCount", 3);
        setIntField(term19726, term19726.getClass(), "capacityIncrement", 0);
        setIntField(term19726, term19726.getClass(), "modCount", 3);
        setField(term19725, term19725.getClass(), "operands", term19726);
        setElement(term19732, 0, enum47);
        setElement(term19732, 1, enum48);
        setElement(term19732, 2, enum49);
        setElement(term19732, 3, enum50);
        setField(term19731, term19731.getClass(), "elementData", term19732);
        setIntField(term19731, term19731.getClass(), "elementCount", 4);
        setIntField(term19731, term19731.getClass(), "capacityIncrement", 0);
        setIntField(term19731, term19731.getClass(), "modCount", 4);
        setField(term19725, term19725.getClass(), "operators", term19731);
        setField(term19768, term19768.getClass(), "tokens", term19769);
        setIntField(term19768, term19768.getClass(), "position", -883034806);
        setField(term19725, term19725.getClass(), "tokens", term19768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTokens", argTypes, term19725, args);
    }

};


