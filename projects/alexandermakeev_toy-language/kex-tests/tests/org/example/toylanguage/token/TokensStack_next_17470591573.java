package org.example.toylanguage.token;

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
import static org.example.toylanguage.token.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class TokensStack_next_17470591573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7811;
     Object enum30;
     Object term7868;

    public TokensStack_next_17470591573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7954 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term7953 = ((Class) term7954).getDeclaredField((String) "GroupDivider");
        ((Field) term7953).setAccessible(true);
        Object enum27 = ((Field) term7953).get((Object) null);
        Integer term7818 = new Integer(-2068769794);
        Object term7814 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7814, term7814.getClass(), "type", enum27);
        setField(term7814, term7814.getClass(), "value", "");
        setField(term7814, term7814.getClass(), "rowNumber", term7818);
        Class<? extends Object> term8192 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term8191 = ((Class) term8192).getDeclaredField((String) "GroupDivider");
        ((Field) term8191).setAccessible(true);
        Object enum28 = ((Field) term8191).get((Object) null);
        Integer term7824 = new Integer(-117576464);
        Object term7820 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7820, term7820.getClass(), "type", enum28);
        setField(term7820, term7820.getClass(), "value", "");
        setField(term7820, term7820.getClass(), "rowNumber", term7824);
        Class<? extends Object> term8430 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term8429 = ((Class) term8430).getDeclaredField((String) "Comment");
        ((Field) term8429).setAccessible(true);
        Object enum29 = ((Field) term8429).get((Object) null);
        Integer term7830 = new Integer(-1007160944);
        Object term7826 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7826, term7826.getClass(), "type", enum29);
        setField(term7826, term7826.getClass(), "value", "");
        setField(term7826, term7826.getClass(), "rowNumber", term7830);
        ArrayList term7812 = new ArrayList();
        ((ArrayList) term7812).add(term7814);
        ((ArrayList) term7812).add(term7820);
        ((ArrayList) term7812).add(term7826);
        term7811 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term7811, term7811.getClass(), "tokens", term7812);
        setIntField(term7811, term7811.getClass(), "position", 391863371);
        Class<? extends Object> term8653 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term8652 = ((Class) term8653).getDeclaredField((String) "LineBreak");
        ((Field) term8652).setAccessible(true);
        enum30 = ((Field) term8652).get((Object) null);
        term7868 = (Object[]) newArray("java.lang.String", 7);
        setElement(term7868, 0, "IoAlmYsBwc");
        setElement(term7868, 1, "TEParAifyi");
        setElement(term7868, 2, "OWDIEULEFu");
        setElement(term7868, 3, "dWRymuLBtr");
        setElement(term7868, 4, "AijpHYOFuy");
        setElement(term7868, 5, "SbAoxhfrkn");
        setElement(term7868, 6, "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = enum30;
        args[1] = "OclPbYPkcH";
        args[2] = term7868;
        callMethod(klass, "next", argTypes, term7811, args);
    }

};


