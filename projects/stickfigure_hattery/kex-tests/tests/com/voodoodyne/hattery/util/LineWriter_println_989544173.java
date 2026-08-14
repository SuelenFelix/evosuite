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

public class LineWriter_println_989544173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931;

    public LineWriter_println_989544173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term931 = newInstance(Class.forName("com.voodoodyne.hattery.util.LineWriter"));
        char[] term932 = (char[]) newCharArray(6);
        char[] term941 = (char[]) newCharArray(4);
        Object term946 = newInstance(Class.forName("java.lang.Object"));
        setField(term931, term931.getClass(), "out", null);
        setCharElement(term932, 0, 'g');
        setCharElement(term932, 1, 'Q');
        setCharElement(term932, 2, 'H');
        setCharElement(term932, 3, 'g');
        setCharElement(term932, 4, 'q');
        setCharElement(term932, 5, 'z');
        setField(term931, term931.getClass(), "cb", term932);
        setIntField(term931, term931.getClass(), "nChars", -1339778481);
        setIntField(term931, term931.getClass(), "nextChar", 1725571209);
        setCharElement(term941, 0, 'x');
        setCharElement(term941, 1, 'x');
        setCharElement(term941, 2, 't');
        setCharElement(term941, 3, 'l');
        setField(term931, term931.getClass(), "writeBuffer", term941);
        setField(term931, term931.getClass(), "lock", term946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.LineWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "println", argTypes, term931, args);
    }

};


