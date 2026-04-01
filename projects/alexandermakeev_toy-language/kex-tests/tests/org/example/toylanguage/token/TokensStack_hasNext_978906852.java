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

public class TokensStack_hasNext_978906852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7109;

    public TokensStack_hasNext_978906852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7146 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term7145 = ((Class) term7146).getDeclaredField((String) "LineBreak");
        ((Field) term7145).setAccessible(true);
        Object enum24 = ((Field) term7145).get((Object) null);
        Integer term7116 = new Integer(-1685132342);
        Object term7112 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7112, term7112.getClass(), "type", enum24);
        setField(term7112, term7112.getClass(), "value", "");
        setField(term7112, term7112.getClass(), "rowNumber", term7116);
        Class<? extends Object> term7375 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term7374 = ((Class) term7375).getDeclaredField((String) "Text");
        ((Field) term7374).setAccessible(true);
        Object enum25 = ((Field) term7374).get((Object) null);
        Integer term7122 = new Integer(-1456670397);
        Object term7118 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7118, term7118.getClass(), "type", enum25);
        setField(term7118, term7118.getClass(), "value", "");
        setField(term7118, term7118.getClass(), "rowNumber", term7122);
        Integer term7126 = new Integer(1622346318);
        Object term7124 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7124, term7124.getClass(), "type", enum25);
        setField(term7124, term7124.getClass(), "value", "");
        setField(term7124, term7124.getClass(), "rowNumber", term7126);
        Class<? extends Object> term7589 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term7588 = ((Class) term7589).getDeclaredField((String) "Keyword");
        ((Field) term7588).setAccessible(true);
        Object enum26 = ((Field) term7588).get((Object) null);
        Integer term7132 = new Integer(1048535127);
        Object term7128 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7128, term7128.getClass(), "type", enum26);
        setField(term7128, term7128.getClass(), "value", "");
        setField(term7128, term7128.getClass(), "rowNumber", term7132);
        Integer term7136 = new Integer(-655067527);
        Object term7134 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7134, term7134.getClass(), "type", enum24);
        setField(term7134, term7134.getClass(), "value", "");
        setField(term7134, term7134.getClass(), "rowNumber", term7136);
        Integer term7140 = new Integer(-6029667);
        Object term7138 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term7138, term7138.getClass(), "type", enum26);
        setField(term7138, term7138.getClass(), "value", "");
        setField(term7138, term7138.getClass(), "rowNumber", term7140);
        ArrayList term7110 = new ArrayList();
        ((ArrayList) term7110).add(term7112);
        ((ArrayList) term7110).add(term7118);
        ((ArrayList) term7110).add(term7124);
        ((ArrayList) term7110).add(term7128);
        ((ArrayList) term7110).add(term7134);
        ((ArrayList) term7110).add(term7138);
        term7109 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term7109, term7109.getClass(), "tokens", term7110);
        setIntField(term7109, term7109.getClass(), "position", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term7109, args);
    }

};


