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

public class LineWriter_print_14282373561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845;

    public LineWriter_print_14282373561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term845 = newInstance(Class.forName("com.voodoodyne.hattery.util.LineWriter"));
        char[] term846 = (char[]) newCharArray(7);
        char[] term856 = (char[]) newCharArray(0);
        Object term857 = newInstance(Class.forName("java.lang.Object"));
        setField(term845, term845.getClass(), "out", null);
        setCharElement(term846, 0, 'D');
        setCharElement(term846, 1, 's');
        setCharElement(term846, 2, 'j');
        setCharElement(term846, 3, 'l');
        setCharElement(term846, 4, 'J');
        setCharElement(term846, 5, 'A');
        setCharElement(term846, 6, 'E');
        setField(term845, term845.getClass(), "cb", term846);
        setIntField(term845, term845.getClass(), "nChars", -616727354);
        setIntField(term845, term845.getClass(), "nextChar", -1955890973);
        setField(term845, term845.getClass(), "writeBuffer", term856);
        setField(term845, term845.getClass(), "lock", term857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.LineWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "print", argTypes, term845, args);
    }

};


