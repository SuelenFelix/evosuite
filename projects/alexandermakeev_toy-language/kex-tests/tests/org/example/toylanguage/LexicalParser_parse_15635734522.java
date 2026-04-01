package org.example.toylanguage;

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
import static org.example.toylanguage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class LexicalParser_parse_15635734522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52214;

    public LexicalParser_parse_15635734522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52239 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term52238 = ((Class) term52239).getDeclaredField((String) "Variable");
        ((Field) term52238).setAccessible(true);
        Object enum71 = ((Field) term52238).get((Object) null);
        Integer term52221 = new Integer(872295704);
        Object term52217 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term52217, term52217.getClass(), "type", enum71);
        setField(term52217, term52217.getClass(), "value", "");
        setField(term52217, term52217.getClass(), "rowNumber", term52221);
        ArrayList term52215 = new ArrayList();
        ((ArrayList) term52215).add(term52217);
        term52214 = newInstance(Class.forName("org.example.toylanguage.LexicalParser"));
        setField(term52214, term52214.getClass(), "tokens", term52215);
        setField(term52214, term52214.getClass(), "source", "ZOUuaTJRXe");
        setIntField(term52214, term52214.getClass(), "rowNumber", 215016257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.LexicalParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parse", argTypes, term52214, args);
    }

};


