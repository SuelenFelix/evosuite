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

public class ExpressionReader_readClassInstance_4459832736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12779;
     Object term12828;

    public ExpressionReader_readClassInstance_4459832736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12902 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term12901 = ((Class) term12902).getDeclaredField((String) "NestedClassInstance");
        ((Field) term12901).setAccessible(true);
        Object enum25 = ((Field) term12901).get((Object) null);
        Integer term12802 = new Integer(1135664017);
        Object term12801 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12801, term12801.getClass(), "type", null);
        setField(term12801, term12801.getClass(), "value", null);
        setField(term12801, term12801.getClass(), "rowNumber", term12802);
        Integer term12805 = new Integer(590364439);
        Object term12804 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12804, term12804.getClass(), "type", null);
        setField(term12804, term12804.getClass(), "value", null);
        setField(term12804, term12804.getClass(), "rowNumber", term12805);
        Integer term12808 = new Integer(865208305);
        Object term12807 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12807, term12807.getClass(), "type", null);
        setField(term12807, term12807.getClass(), "value", null);
        setField(term12807, term12807.getClass(), "rowNumber", term12808);
        Integer term12811 = new Integer(-1275173084);
        Object term12810 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12810, term12810.getClass(), "type", null);
        setField(term12810, term12810.getClass(), "value", null);
        setField(term12810, term12810.getClass(), "rowNumber", term12811);
        Integer term12814 = new Integer(-244121226);
        Object term12813 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12813, term12813.getClass(), "type", null);
        setField(term12813, term12813.getClass(), "value", null);
        setField(term12813, term12813.getClass(), "rowNumber", term12814);
        Integer term12817 = new Integer(-203030934);
        Object term12816 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12816, term12816.getClass(), "type", null);
        setField(term12816, term12816.getClass(), "value", null);
        setField(term12816, term12816.getClass(), "rowNumber", term12817);
        Integer term12820 = new Integer(-1179120542);
        Object term12819 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12819, term12819.getClass(), "type", null);
        setField(term12819, term12819.getClass(), "value", null);
        setField(term12819, term12819.getClass(), "rowNumber", term12820);
        Integer term12823 = new Integer(-73683645);
        Object term12822 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12822, term12822.getClass(), "type", null);
        setField(term12822, term12822.getClass(), "value", null);
        setField(term12822, term12822.getClass(), "rowNumber", term12823);
        ArrayList term12799 = new ArrayList();
        ((ArrayList) term12799).add(term12801);
        ((ArrayList) term12799).add(term12804);
        ((ArrayList) term12799).add(term12807);
        ((ArrayList) term12799).add(term12810);
        ((ArrayList) term12799).add(term12813);
        ((ArrayList) term12799).add(term12816);
        ((ArrayList) term12799).add(term12819);
        ((ArrayList) term12799).add(term12822);
        term12779 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term12780 = newInstance(Class.forName("java.util.Stack"));
        Object[] term12781 = (Object[]) newArray("java.lang.Object", 10);
        Object term12785 = newInstance(Class.forName("java.util.Stack"));
        Object[] term12786 = (Object[]) newArray("java.lang.Object", 10);
        Object term12798 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term12780, term12780.getClass(), "elementData", term12781);
        setIntField(term12780, term12780.getClass(), "elementCount", 8);
        setIntField(term12780, term12780.getClass(), "capacityIncrement", 0);
        setIntField(term12780, term12780.getClass(), "modCount", 8);
        setField(term12779, term12779.getClass(), "operands", term12780);
        setElement(term12786, 0, enum25);
        setField(term12785, term12785.getClass(), "elementData", term12786);
        setIntField(term12785, term12785.getClass(), "elementCount", 1);
        setIntField(term12785, term12785.getClass(), "capacityIncrement", 0);
        setIntField(term12785, term12785.getClass(), "modCount", 1);
        setField(term12779, term12779.getClass(), "operators", term12785);
        setField(term12798, term12798.getClass(), "tokens", term12799);
        setIntField(term12798, term12798.getClass(), "position", -1339778481);
        setField(term12779, term12779.getClass(), "tokens", term12798);
        Class<? extends Object> term13226 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term13225 = ((Class) term13226).getDeclaredField((String) "Numeric");
        ((Field) term13225).setAccessible(true);
        Object enum26 = ((Field) term13225).get((Object) null);
        Integer term12899 = new Integer(-226514366);
        term12828 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12828, term12828.getClass(), "type", enum26);
        setField(term12828, term12828.getClass(), "value", "sEnIVFtZuQ");
        setField(term12828, term12828.getClass(), "rowNumber", term12899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.token.Token");
        Object[] args = new Object[1];
        args[0] = term12828;
        callMethod(klass, "readClassInstance", argTypes, term12779, args);
    }

};


