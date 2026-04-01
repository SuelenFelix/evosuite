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
import java.lang.String;
import java.lang.Integer;

public class ExpressionReader_init_10320529430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645;

    public ExpressionReader_init_10320529430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1245 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term1244 = ((Class) term1245).getDeclaredField((String) "This");
        ((Field) term1244).setAccessible(true);
        Object enum0 = ((Field) term1244).get((Object) null);
        Integer term652 = new Integer(1134449235);
        Object term648 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term648, term648.getClass(), "type", enum0);
        setField(term648, term648.getClass(), "value", "");
        setField(term648, term648.getClass(), "rowNumber", term652);
        Class<? extends Object> term1459 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term1458 = ((Class) term1459).getDeclaredField((String) "Logical");
        ((Field) term1458).setAccessible(true);
        Object enum1 = ((Field) term1458).get((Object) null);
        Integer term658 = new Integer(-883034806);
        Object term654 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term654, term654.getClass(), "type", enum1);
        setField(term654, term654.getClass(), "value", "");
        setField(term654, term654.getClass(), "rowNumber", term658);
        Class<? extends Object> term1682 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term1681 = ((Class) term1682).getDeclaredField((String) "Text");
        ((Field) term1681).setAccessible(true);
        Object enum2 = ((Field) term1681).get((Object) null);
        Integer term664 = new Integer(1585847225);
        Object term660 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term660, term660.getClass(), "type", enum2);
        setField(term660, term660.getClass(), "value", "");
        setField(term660, term660.getClass(), "rowNumber", term664);
        Class<? extends Object> term1896 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term1895 = ((Class) term1896).getDeclaredField((String) "Text");
        ((Field) term1895).setAccessible(true);
        Object enum3 = ((Field) term1895).get((Object) null);
        Integer term670 = new Integer(597278769);
        Object term666 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term666, term666.getClass(), "type", enum3);
        setField(term666, term666.getClass(), "value", "");
        setField(term666, term666.getClass(), "rowNumber", term670);
        ArrayList term646 = new ArrayList();
        ((ArrayList) term646).add(term648);
        ((ArrayList) term646).add(term654);
        ((ArrayList) term646).add(term660);
        ((ArrayList) term646).add(term666);
        term645 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term645, term645.getClass(), "tokens", term646);
        setIntField(term645, term645.getClass(), "position", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokensStack");
        Object[] args = new Object[1];
        args[0] = term645;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


