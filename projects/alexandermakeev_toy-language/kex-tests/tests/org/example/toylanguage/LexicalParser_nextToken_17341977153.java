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
import java.lang.Integer;

public class LexicalParser_nextToken_17341977153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52474;
     Object term52492;

    public LexicalParser_nextToken_17341977153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term52475 = new ArrayList();
        term52474 = newInstance(Class.forName("org.example.toylanguage.LexicalParser"));
        setField(term52474, term52474.getClass(), "tokens", term52475);
        setField(term52474, term52474.getClass(), "source", "gIyzpvuRnO");
        setIntField(term52474, term52474.getClass(), "rowNumber", -1967315273);
        term52492 = new Integer(-1848110874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.LexicalParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52492;
        callMethod(klass, "nextToken", argTypes, term52474, args);
    }

};


