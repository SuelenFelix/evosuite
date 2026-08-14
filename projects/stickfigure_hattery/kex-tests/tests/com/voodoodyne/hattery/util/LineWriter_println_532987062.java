package com.voodoodyne.hattery.util;

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
import static com.voodoodyne.hattery.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LineWriter_println_532987062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public LineWriter_println_532987062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("com.voodoodyne.hattery.util.LineWriter"));
        char[] term888 = (char[]) newCharArray(7);
        char[] term898 = (char[]) newCharArray(1);
        Object term900 = newInstance(Class.forName("java.lang.Object"));
        setField(term887, term887.getClass(), "out", null);
        setCharElement(term888, 0, 't');
        setCharElement(term888, 1, 'R');
        setCharElement(term888, 2, 'r');
        setCharElement(term888, 3, 'b');
        setCharElement(term888, 4, 'M');
        setCharElement(term888, 5, 'u');
        setCharElement(term888, 6, 'L');
        setField(term887, term887.getClass(), "cb", term888);
        setIntField(term887, term887.getClass(), "nChars", -2038273078);
        setIntField(term887, term887.getClass(), "nextChar", 1227103734);
        setCharElement(term898, 0, 'c');
        setField(term887, term887.getClass(), "writeBuffer", term898);
        setField(term887, term887.getClass(), "lock", term900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.LineWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "println", argTypes, term887, args);
    }

};


