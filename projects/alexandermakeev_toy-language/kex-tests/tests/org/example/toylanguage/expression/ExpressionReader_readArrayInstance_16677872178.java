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

public class ExpressionReader_readArrayInstance_16677872178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15377;

    public ExpressionReader_readArrayInstance_16677872178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15470 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term15469 = ((Class) term15470).getDeclaredField((String) "ClassProperty");
        ((Field) term15469).setAccessible(true);
        Object enum33 = ((Field) term15469).get((Object) null);
        Class<? extends Object> term15776 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term15775 = ((Class) term15776).getDeclaredField((String) "Equals");
        ((Field) term15775).setAccessible(true);
        Object enum34 = ((Field) term15775).get((Object) null);
        Class<? extends Object> term16061 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term16060 = ((Class) term16061).getDeclaredField((String) "GreaterThanOrEqualTo");
        ((Field) term16060).setAccessible(true);
        Object enum35 = ((Field) term16060).get((Object) null);
        Class<? extends Object> term16388 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term16387 = ((Class) term16388).getDeclaredField((String) "Modulo");
        ((Field) term16387).setAccessible(true);
        Object enum36 = ((Field) term16387).get((Object) null);
        Class<? extends Object> term16673 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term16672 = ((Class) term16673).getDeclaredField((String) "ExponentiationOperator");
        ((Field) term16672).setAccessible(true);
        Object enum37 = ((Field) term16672).get((Object) null);
        Class<? extends Object> term17006 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term17005 = ((Class) term17006).getDeclaredField((String) "ClassInstanceOf");
        ((Field) term17005).setAccessible(true);
        Object enum38 = ((Field) term17005).get((Object) null);
        Integer term15440 = new Integer(679763016);
        Object term15439 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15439, term15439.getClass(), "type", null);
        setField(term15439, term15439.getClass(), "value", null);
        setField(term15439, term15439.getClass(), "rowNumber", term15440);
        Integer term15443 = new Integer(1962444399);
        Object term15442 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15442, term15442.getClass(), "type", null);
        setField(term15442, term15442.getClass(), "value", null);
        setField(term15442, term15442.getClass(), "rowNumber", term15443);
        Integer term15446 = new Integer(767834723);
        Object term15445 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15445, term15445.getClass(), "type", null);
        setField(term15445, term15445.getClass(), "value", null);
        setField(term15445, term15445.getClass(), "rowNumber", term15446);
        Integer term15449 = new Integer(-602026508);
        Object term15448 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15448, term15448.getClass(), "type", null);
        setField(term15448, term15448.getClass(), "value", null);
        setField(term15448, term15448.getClass(), "rowNumber", term15449);
        Integer term15452 = new Integer(-157887805);
        Object term15451 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15451, term15451.getClass(), "type", null);
        setField(term15451, term15451.getClass(), "value", null);
        setField(term15451, term15451.getClass(), "rowNumber", term15452);
        Integer term15455 = new Integer(1876565163);
        Object term15454 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15454, term15454.getClass(), "type", null);
        setField(term15454, term15454.getClass(), "value", null);
        setField(term15454, term15454.getClass(), "rowNumber", term15455);
        Integer term15458 = new Integer(-817164822);
        Object term15457 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15457, term15457.getClass(), "type", null);
        setField(term15457, term15457.getClass(), "value", null);
        setField(term15457, term15457.getClass(), "rowNumber", term15458);
        Integer term15461 = new Integer(-1016503459);
        Object term15460 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15460, term15460.getClass(), "type", null);
        setField(term15460, term15460.getClass(), "value", null);
        setField(term15460, term15460.getClass(), "rowNumber", term15461);
        Integer term15464 = new Integer(-1968847291);
        Object term15463 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15463, term15463.getClass(), "type", null);
        setField(term15463, term15463.getClass(), "value", null);
        setField(term15463, term15463.getClass(), "rowNumber", term15464);
        ArrayList term15437 = new ArrayList();
        ((ArrayList) term15437).add(term15439);
        ((ArrayList) term15437).add(term15442);
        ((ArrayList) term15437).add(term15445);
        ((ArrayList) term15437).add(term15448);
        ((ArrayList) term15437).add(term15451);
        ((ArrayList) term15437).add(term15454);
        ((ArrayList) term15437).add(term15457);
        ((ArrayList) term15437).add(term15460);
        ((ArrayList) term15437).add(term15463);
        term15377 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term15378 = newInstance(Class.forName("java.util.Stack"));
        Object[] term15379 = (Object[]) newArray("java.lang.Object", 10);
        Object term15383 = newInstance(Class.forName("java.util.Stack"));
        Object[] term15384 = (Object[]) newArray("java.lang.Object", 10);
        Object term15436 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term15378, term15378.getClass(), "elementData", term15379);
        setIntField(term15378, term15378.getClass(), "elementCount", 9);
        setIntField(term15378, term15378.getClass(), "capacityIncrement", 0);
        setIntField(term15378, term15378.getClass(), "modCount", 9);
        setField(term15377, term15377.getClass(), "operands", term15378);
        setElement(term15384, 0, enum33);
        setElement(term15384, 1, enum34);
        setElement(term15384, 2, enum35);
        setElement(term15384, 3, enum36);
        setElement(term15384, 4, enum37);
        setElement(term15384, 5, enum38);
        setElement(term15384, 6, enum38);
        setField(term15383, term15383.getClass(), "elementData", term15384);
        setIntField(term15383, term15383.getClass(), "elementCount", 7);
        setIntField(term15383, term15383.getClass(), "capacityIncrement", 0);
        setIntField(term15383, term15383.getClass(), "modCount", 7);
        setField(term15377, term15377.getClass(), "operators", term15383);
        setField(term15436, term15436.getClass(), "tokens", term15437);
        setIntField(term15436, term15436.getClass(), "position", -522618178);
        setField(term15377, term15377.getClass(), "tokens", term15436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readArrayInstance", argTypes, term15377, args);
    }

};


